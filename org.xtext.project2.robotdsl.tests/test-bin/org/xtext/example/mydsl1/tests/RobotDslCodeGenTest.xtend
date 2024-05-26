package org.xtext.example.mydsl1.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import com.google.inject.Inject
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.jupiter.api.Test

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class RobotDslCodeGenTest {
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void testAsebaFile(){
			'''
			Condition: 
				- Button left CENTER
				-Sensor sener
					sensorPosition 2
					detectObstacle OBSTACLE
				-Tap tap
				-Sound s   
			
			Action:
				- MotorAction goLeft
				 	motorLeft 300  
				 	motorRight 10
				- LightAction light2
					position: TOP
					red: 22
					green: 24+1
					blue: 31
				- SoundAction sounda
					set: (1,LONG,3),(1,MEDIUM,1),(2,LONG,2) 
			   
			Event a
				conditions: left actions: goLeft
			Event a2
				conditions: sener 
				actions: light2
			Event a3
				conditions: s actions: sounda
			'''.assertCompilesTo(
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
					
				onevent mic
					call math.copy(notes[0:5], [262, 311, 262, 0, 0, 0])
					call math.copy(durations[0:5], [7, 14, 14, 0, 0, 0])
					note_index = 1
					note_count = 6
					call sound.freq(notes[0], durations[0])
				onevent prox
					when prox.horizontal[1]  >= 2000  do
											call leds.top(22 , 25, 31)
					end
				onevent buttons
					when button.center == 1 do
											motor.left.target = 300
											motor.right.target = 10
					end
				'''
			)
	}
}