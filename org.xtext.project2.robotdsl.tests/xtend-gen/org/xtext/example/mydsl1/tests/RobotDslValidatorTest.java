package org.xtext.example.mydsl1.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl1.validation.MyDslValidator;
import project2.Project2Package;
import project2.RobotModel;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class RobotDslValidatorTest {
  @Inject
  private ParseHelper<RobotModel> parseHelper;

  @Inject
  private ValidationTestHelper validator;

  @Test
  public void testInvalidActionType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap tap1");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction goFront motorLeft 300 motorRight 200+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction stop ");
      _builder.newLine();
      _builder.append("Event e1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: goFront, stop");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getEvent(), 
        MyDslValidator.SAME_ACTION_TYPE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testInvalidNameDefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap tap1");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction goFront motorLeft 300 motorRight 200+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction stop ");
      _builder.newLine();
      _builder.append("Event tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: goFront");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getEvent(), 
        MyDslValidator.SAME_NAME);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testDefineTwoSameButtonConditions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Button center CENTER");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Button center2 CENTER");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction goFront motorLeft 300 motorRight 200+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction stop ");
      _builder.newLine();
      _builder.append("Event e1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: center");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: goFront");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertWarning(result, 
        Project2Package.eINSTANCE.getEvent(), 
        MyDslValidator.SAME_BUTTON_TYPE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testInvalidMotorSpeed() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction goFront motorLeft 300 motorRight 700");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getMotorAction(), 
        MyDslValidator.INVALID_SPEED);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testInvalidSensorPosition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Sensor s ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sensorPosition 56");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("detectObstacle NOOBSTACLE");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getSensor(), 
        MyDslValidator.INVALID_SENSOR_POS);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testInvalidSingularConditions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition: ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Tap tap");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Button center CENTER");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Button left LEFT");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction goFront motorLeft 300 motorRight 200+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction stop ");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Event event");
      _builder.newLine();
      _builder.append("conditions: tap and left actions: goFront");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getEvent(), 
        MyDslValidator.INVALID_SINGULAR_CONDITION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testInvalidMultipleConditions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition: ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sensor obstaculel");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sensorPosition 8");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("detectObstacle NOOBSTACLE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Button center CENTER");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- Button left LEFT");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction goFront motorLeft 300 motorRight 200+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction stop ");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Event event");
      _builder.newLine();
      _builder.append("conditions: tap and obstaculel actions: goFront");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getEvent(), 
        MyDslValidator.INVALID_CONDITION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testInvalidSoundNote() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic set:(15, MEDIUM, 2)");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getMusicSetting(), 
        MyDslValidator.INVALID_SOUND_NOTE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testInvalidSoundPosition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic set:(3, MEDIUM, 12)");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getMusicSetting(), 
        MyDslValidator.INVALID_SOUND_POS);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testSameSoundPosition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic set:(2, MEDIUM, 2),(5, NONE, 2)");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertError(result, 
        Project2Package.eINSTANCE.getMusicSetting(), 
        MyDslValidator.SAME_SOUND_POS);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testDefineTwoTapCondition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap tap2");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertWarning(result, 
        Project2Package.eINSTANCE.getTap(), 
        MyDslValidator.SAME_TAP);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testDefineTwoSoundCondition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sound s1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sound s2");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      this.validator.assertWarning(result, 
        Project2Package.eINSTANCE.getSound(), 
        MyDslValidator.SAME_SOUND);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
