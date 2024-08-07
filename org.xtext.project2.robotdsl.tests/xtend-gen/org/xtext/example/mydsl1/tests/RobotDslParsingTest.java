/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl1.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import project2.RobotModel;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class RobotDslParsingTest {
  @Inject
  private ParseHelper<RobotModel> parseHelper;

  @Test
  public void loadValidModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sensor sensor1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sensorPosition 2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("detectObstacle NOOBSTACLE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sound sound1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Button leftcontidion CENTER");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-MotorAction gofront motorLeft 200 motorRight 100+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-LightAction redLight position:TOP red:15 green:1 blue: 8");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic set:(2, MEDIUM, 2), (5, MEDIUM, 4)");
      _builder.newLine();
      _builder.append("Event event ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: sensor1 ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: playmusic");
      _builder.newLine();
      _builder.append("Event e2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: redLight");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadInvalidModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sensor sensor1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sensorPosition 2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("detectObstacle NOOBSTACLE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sound sound1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Button leftcontidion CENTER");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-MotorAction gofront motorLeft 200 motorRight 100+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-LightAction redLight position:TOP red:15 green:1 blue: 8");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic set:(2, MEDIUM, 2), (5, MEDIUM, 4)");
      _builder.newLine();
      _builder.append("Event event ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: sensor1 ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: playmusic");
      _builder.newLine();
      _builder.append("Event e2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: redLight");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadNoAction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sensor sensor1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sensorPosition 2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("detectObstacle NOOBSTACLE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sound sound1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Button leftcontidion CENTER");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-MotorAction gofront motorLeft 200 motorRight 100+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-LightAction redLight position:TOP red:15 green:1 blue: 8");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic set:(2, MEDIUM, 2), (5, MEDIUM, 4)");
      _builder.newLine();
      _builder.append("Event event ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: sensor1 ");
      _builder.newLine();
      _builder.append("Event e2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("conditions: tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: redLight");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadEventNoCondition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sensor sensor1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sensorPosition 2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("detectObstacle NOOBSTACLE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap tap1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sound sound1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Button leftcontidion CENTER");
      _builder.newLine();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-MotorAction gofront motorLeft 200 motorRight 100+100");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-LightAction redLight position:TOP red:15 green:1 blue: 8");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic set:(2, MEDIUM, 2), (5, MEDIUM, 4)");
      _builder.newLine();
      _builder.append("Event e2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("actions: redLight");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadInvalidLightAction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-LightAction redLight  red:15 green:1 blue: 8");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadInvalidSoundAction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- SoundAction playmusic (2, MEDIUM, 2), (5, MEDIUM, 4)");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadInvalidMotorAction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Action:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("- MotorAction motorLeft 200 motorRight 100+100");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadInvalidSensorCondition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sensor sensor1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("detectObstacle NOOBSTACLE");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadInvalidTapAndSoundCondition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Tap");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Sound");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
      int _size = errors.size();
      boolean _equals = (_size == 2);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Unexpected errors: ");
      String _join_1 = IterableExtensions.join(errors, ", ");
      _builder_2.append(_join_1);
      Assertions.assertTrue(_equals, _builder_2.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void loadInvalidButtonCondition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Condition:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("-Button buttoncondition 2");
      _builder.newLine();
      final RobotModel result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertFalse(_isEmpty, _builder_1.toString());
      int _size = errors.size();
      boolean _equals = (_size == 1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Unexpected errors: ");
      String _join_1 = IterableExtensions.join(errors, ", ");
      _builder_2.append(_join_1);
      Assertions.assertTrue(_equals, _builder_2.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
