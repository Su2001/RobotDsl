/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl1.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import project2.RobotModel
import java.util.ArrayList
import project2.Event
import project2.Tap
import project2.Sound
import project2.Sensor
import project2.Button
import project2.Action
import project2.SoundAction
import project2.MusicSetting
import project2.LightAction
import project2.MotorAction
import project2.Condition
import java.util.List

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("Robot.aesl",
			toAESLCode(resource.contents.head as RobotModel))
	}
	
	def toAESLCode(RobotModel model) {
		var taplist = new ArrayList<Event>()
		var soundlist = new ArrayList<Event>()
		var proxlist = new ArrayList<Event>()
		var buttonlist = new ArrayList<Event>()
		for(Event a : model.getEvents){
			if(a.getConditions.get(0) instanceof Tap){
				taplist.add(a)
			}else if(a.getConditions.get(0) instanceof Sound){
				soundlist.add(a)
			}else if(a.getConditions.get(0) instanceof Button){
				buttonlist.add(a)
			}else{
				proxlist.add(a)
			}
		}
		var counter = 0
		'''
		# variables for notes
		var notes[6]
		var durations[6]
		var note_index = 6
		var note_count = 6
		var wave[142]
		var i
		var wave_phase
		var wave_intensity
		
		# compute a sinus wave for sound
		for i in 0:141 do
			wave_phase = (i-70)*468
			call math.cos(wave_intensity, wave_phase)
			wave[i] = wave_intensity/256
		end
		call sound.wave(wave)
		# reset outputs
		call sound.system(-1)
		call leds.top(0,0,0)
		call leds.bottom.left(0,0,0)
		call leds.bottom.right(0,0,0)
		call leds.circle(0,0,0,0,0,0,0,0)
		
		# when a note is finished, play the next note
		onevent sound.finished
			if note_index != note_count then
				call sound.freq(notes[note_index], durations[note_index])
				note_index += 1
			end
			
		«IF taplist.size > 0»
		onevent tap
			«FOR e : taplist»
				«FOR a : e.getActions»
					«processAction(a)»
				«ENDFOR»
				emit pair_run «counter++»
			«ENDFOR»
		«ENDIF»
		«IF soundlist.size > 0»
		onevent mic
			«FOR e : soundlist»
				«FOR a : e.getActions»
					«processAction(a)»
				«ENDFOR»
				emit pair_run «counter++»
			«ENDFOR»
		«ENDIF»
		«IF proxlist.size > 0»
				onevent prox
				«FOR prox : proxlist»
				«processConditionSensor(prox.getConditions, prox.getActions)»
					emit pair_run «counter++»
					end
				«ENDFOR»	
				«ENDIF»
		«IF buttonlist.size > 0»
				onevent buttons
				«FOR but : buttonlist»
								«processConditionButton(but.getConditions, but.getActions)»
									emit pair_run «counter++»
									end
								«ENDFOR»			
						«ENDIF»
		'''
	}
	
	def processConditionSensor(List<Condition> lc, List<Action> la){
		var count = lc.size
		return '''	when «FOR c : lc»«IF c instanceof Sensor »«IF c.getSensorPos <= 7 »prox.horizontal[«c.getSensorPos-1»] «IF c.getDistance == 0 » <= 1000 «ELSE» >= 2000 «ENDIF»«ELSE»prox.ground.delta[«c.getSensorPos%8»]	«IF c.getDistance == 0 »<= 400 «ELSE»>= 450	«ENDIF»«ENDIF»«ENDIF»«IF count-- > 1» and «ENDIF»«ENDFOR» do
			«FOR a : la»«processAction(a)» «ENDFOR»
			'''
	}
	
	def processConditionButton(List<Condition> lc, List<Action> la){
		var count = lc.size
		return '''	when «FOR c : lc»«IF c instanceof Button »button.«IF c.getButton == 0 »forward «ELSEIF c.getButton == 1 »backward «ELSEIF c.getButton == 2»left «ELSEIF c.getButton == 3»right «ELSE»center «ENDIF»«ENDIF»== 1«IF count-- > 1» and «ENDIF»«ENDFOR» do
			«FOR a : la»«processAction(a)» «ENDFOR»
			'''
	}
	
	def processAction(Action a){
		val int[] note = #[0, 0, 0, 0, 0, 0]
		val int[] duration = #[0, 0, 0, 0, 0, 0]
		var pos = 1
		if(a instanceof SoundAction){
			
			for(MusicSetting m : a.getMusicsettings){
				if(m.getNote == 1){
					note.set(m.getPos-1,262)
				}else if(m.getNote == 2){
					note.set(m.getPos-1,311)
				}else if(m.getNote == 3){
					note.set(m.getPos-1,370)
				}else if(m.getNote == 4){
					note.set(m.getPos-1,440)
				}else{
					note.set(m.getPos-1,524)
				}
				
				switch m.getDuration {
		            case MEDIUM:
		                duration.set(m.getPos-1,7)
		            case LONG:
		                duration.set(m.getPos-1,14)
					default: {
						duration.set(m.getPos-1,0)
							}
        		}
			}
		}else if(a instanceof LightAction){
			switch a.getPos {
		            case BOT:
		                pos = 2
        		}
		}
		return '''«IF a instanceof SoundAction»
				call math.copy(notes[0:5], [«note.get(0)», «note.get(1)», «note.get(2)», «note.get(3)», «note.get(4)», «note.get(5)»])
				call math.copy(durations[0:5], [«duration.get(0)», «duration.get(1)», «duration.get(2)», «duration.get(3)», «duration.get(4)», «duration.get(5)»])
				note_index = 1
				note_count = 6
				call sound.freq(notes[0], durations[0])
				«ENDIF»
				«IF a instanceof LightAction»
				«IF pos == 1»	
				call leds.top(«a.getRed» , «a.getGreen», «a.getBlue»)
				«ENDIF»
				«IF pos == 2»	
				call leds.bottom.left(«a.getRed» , «a.getGreen», «a.getBlue»)
				call leds.bottom.right(«a.getRed» , «a.getGreen», «a.getBlue»)
				«ENDIF»
				«ENDIF»
				«IF a instanceof MotorAction»
				motor.left.target = «a.getMotorLeft»
				motor.right.target = «a.getMotorRight»
				«ENDIF»
				'''
	}
	
}
