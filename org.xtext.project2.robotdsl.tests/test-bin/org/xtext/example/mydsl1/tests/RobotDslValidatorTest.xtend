package org.xtext.example.mydsl1.tests

import org.eclipse.xtext.testing.InjectWith
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import project2.RobotModel
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import project2.Project2Package
import org.xtext.example.mydsl1.validation.MyDslValidator

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class RobotDslValidatorTest {
	@Inject
	ParseHelper<RobotModel> parseHelper
	
	@Inject
	ValidationTestHelper validator
	
	@Test
	def void testInvalidActionType(){
		val result = parseHelper.parse('''
			Condition:
				-Tap tap1
			Action:
				- MotorAction goFront motorLeft 300 motorRight 200+100
				- MotorAction stop 
			Event e1
				conditions: tap1
				actions: goFront, stop
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.event,
								MyDslValidator::SAME_ACTION_TYPE
		)
	}
	
	@Test
	def void testInvalidNameDefinition(){
		val result = parseHelper.parse('''
			Condition:
				-Tap tap1
			Action:
				- MotorAction goFront motorLeft 300 motorRight 200+100
				- MotorAction stop 
			Event tap1
				conditions: tap1
				actions: goFront
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.event,
								MyDslValidator::SAME_NAME
		)
	}
	
	@Test
	def void testDefineTwoSameButtonConditions(){
		val result = parseHelper.parse('''
			Condition:
				- Button center CENTER
				- Button center2 CENTER
			Action:
				- MotorAction goFront motorLeft 300 motorRight 200+100
				- MotorAction stop 
			Event e1
				conditions: center
				actions: goFront
		''')
		Assertions.assertNotNull(result)
		validator.assertWarning(result,
								Project2Package::eINSTANCE.event,
								MyDslValidator::SAME_BUTTON_TYPE
		)
	}
	
	@Test
	def void testInvalidMotorSpeed(){
		val result = parseHelper.parse('''
			Action:
				- MotorAction goFront motorLeft 300 motorRight 700
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.motorAction,
								MyDslValidator::INVALID_SPEED
		)
	}
	
	@Test
	def void testInvalidSensorPosition(){
		val result = parseHelper.parse('''
			Condition:
				- Sensor s 
					sensorPosition 56
					detectObstacle NOOBSTACLE
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.sensor,
								MyDslValidator::INVALID_SENSOR_POS
		)
	}
	
	@Test
	def void testInvalidSingularConditions(){
		val result = parseHelper.parse('''
			Condition: 
				- Tap tap
				- Button center CENTER
				- Button left LEFT
				
			Action:
				- MotorAction goFront motorLeft 300 motorRight 200+100
				- MotorAction stop 
				
			Event event
			conditions: tap and left actions: goFront
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.event,
								MyDslValidator::INVALID_SINGULAR_CONDITION
		)
	}
	
	@Test
	def void testInvalidMultipleConditions(){
		val result = parseHelper.parse('''
			Condition: 
				-Sensor obstaculel
					sensorPosition 8
					detectObstacle NOOBSTACLE
				- Button center CENTER
				- Button left LEFT
				
			Action:
				- MotorAction goFront motorLeft 300 motorRight 200+100
				- MotorAction stop 
				
			Event event
			conditions: tap and obstaculel actions: goFront
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.event,
								MyDslValidator::INVALID_CONDITION
		)
	}
	
	@Test
	def void testInvalidSoundNote(){
		val result = parseHelper.parse('''
			Action:
				- SoundAction playmusic set:(15, MEDIUM, 2)
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.musicSetting,
								MyDslValidator::INVALID_SOUND_NOTE
		)
	}
	
	@Test
	def void testInvalidSoundPosition(){
		val result = parseHelper.parse('''
			Action:
				- SoundAction playmusic set:(3, MEDIUM, 12)
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.musicSetting,
								MyDslValidator::INVALID_SOUND_POS
		)
	}
	
	@Test
	def void testSameSoundPosition(){
		val result = parseHelper.parse('''
			Action:
				- SoundAction playmusic set:(2, MEDIUM, 2),(5, NONE, 2)
		''')
		Assertions.assertNotNull(result)
		validator.assertError(result,
								Project2Package::eINSTANCE.musicSetting,
								MyDslValidator::SAME_SOUND_POS
		)
	}
	
	@Test
	def void testDefineTwoTapCondition(){
		val result = parseHelper.parse('''
			Condition:
				-Tap tap1
				-Tap tap2
		''')
		Assertions.assertNotNull(result)
		validator.assertWarning(result,
								Project2Package::eINSTANCE.tap,
								MyDslValidator::SAME_TAP
		)
	}
	
	@Test
	def void testDefineTwoSoundCondition(){
		val result = parseHelper.parse('''
			Condition:
				-Sound s1
				-Sound s2
		''')
		Assertions.assertNotNull(result)
		validator.assertWarning(result,
								Project2Package::eINSTANCE.sound,
								MyDslValidator::SAME_SOUND
		)
	}
	
}