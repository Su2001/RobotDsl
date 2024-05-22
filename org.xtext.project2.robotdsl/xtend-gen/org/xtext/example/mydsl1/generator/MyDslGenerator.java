/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl1.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import project2.Action;
import project2.Button;
import project2.ButtonType;
import project2.Condition;
import project2.Distance;
import project2.Duration;
import project2.Event;
import project2.LightAction;
import project2.LightPos;
import project2.MotorAction;
import project2.MusicSetting;
import project2.RobotModel;
import project2.Sensor;
import project2.Sound;
import project2.SoundAction;
import project2.Tap;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile("Robot.aesl", 
      this.toAESLCode(((RobotModel) _head)));
  }

  public CharSequence toAESLCode(final RobotModel model) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<Event> taplist = new ArrayList<Event>();
      ArrayList<Event> soundlist = new ArrayList<Event>();
      ArrayList<Event> proxlist = new ArrayList<Event>();
      ArrayList<Event> buttonlist = new ArrayList<Event>();
      EList<Event> _events = model.getEvents();
      for (final Event a : _events) {
        Condition _get = a.getConditions().get(0);
        if ((_get instanceof Tap)) {
          taplist.add(a);
        } else {
          Condition _get_1 = a.getConditions().get(0);
          if ((_get_1 instanceof Sound)) {
            soundlist.add(a);
          } else {
            Condition _get_2 = a.getConditions().get(0);
            if ((_get_2 instanceof Button)) {
              buttonlist.add(a);
            } else {
              proxlist.add(a);
            }
          }
        }
      }
      int counter = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# variables for notes");
      _builder.newLine();
      _builder.append("var notes[6]");
      _builder.newLine();
      _builder.append("var durations[6]");
      _builder.newLine();
      _builder.append("var note_index = 6");
      _builder.newLine();
      _builder.append("var note_count = 6");
      _builder.newLine();
      _builder.append("var wave[142]");
      _builder.newLine();
      _builder.append("var i");
      _builder.newLine();
      _builder.append("var wave_phase");
      _builder.newLine();
      _builder.append("var wave_intensity");
      _builder.newLine();
      _builder.newLine();
      _builder.append("# compute a sinus wave for sound");
      _builder.newLine();
      _builder.append("for i in 0:141 do");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("wave_phase = (i-70)*468");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("call math.cos(wave_intensity, wave_phase)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("wave[i] = wave_intensity/256");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      _builder.append("call sound.wave(wave)");
      _builder.newLine();
      _builder.append("# reset outputs");
      _builder.newLine();
      _builder.append("call sound.system(-1)");
      _builder.newLine();
      _builder.append("call leds.top(0,0,0)");
      _builder.newLine();
      _builder.append("call leds.bottom.left(0,0,0)");
      _builder.newLine();
      _builder.append("call leds.bottom.right(0,0,0)");
      _builder.newLine();
      _builder.append("call leds.circle(0,0,0,0,0,0,0,0)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("# when a note is finished, play the next note");
      _builder.newLine();
      _builder.append("onevent sound.finished");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if note_index != note_count then");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("call sound.freq(notes[note_index], durations[note_index])");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("note_index += 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("end");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        int _size = taplist.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          _builder.append("onevent tap");
          _builder.newLine();
          {
            for(final Event e : taplist) {
              {
                EList<Action> _actions = e.getActions();
                for(final Action a_1 : _actions) {
                  _builder.append("\t");
                  String _processAction = this.processAction(a_1);
                  _builder.append(_processAction, "\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      {
        int _size_1 = soundlist.size();
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          _builder.append("onevent mic");
          _builder.newLine();
          {
            for(final Event e_1 : soundlist) {
              {
                EList<Action> _actions_1 = e_1.getActions();
                for(final Action a_2 : _actions_1) {
                  _builder.append("\t");
                  String _processAction_1 = this.processAction(a_2);
                  _builder.append(_processAction_1, "\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      {
        int _size_2 = proxlist.size();
        boolean _greaterThan_2 = (_size_2 > 0);
        if (_greaterThan_2) {
          _builder.append("onevent prox");
          _builder.newLine();
          {
            for(final Event prox : proxlist) {
              String _processConditionSensor = this.processConditionSensor(prox.getConditions(), prox.getActions());
              _builder.append(_processConditionSensor);
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("end");
              _builder.newLine();
            }
          }
        }
      }
      {
        int _size_3 = buttonlist.size();
        boolean _greaterThan_3 = (_size_3 > 0);
        if (_greaterThan_3) {
          _builder.append("onevent buttons");
          _builder.newLine();
          {
            for(final Event but : buttonlist) {
              String _processConditionButton = this.processConditionButton(but.getConditions(), but.getActions());
              _builder.append(_processConditionButton);
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("end");
              _builder.newLine();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public String processConditionSensor(final List<Condition> lc, final List<Action> la) {
    int count = lc.size();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("when ");
    {
      for(final Condition c : lc) {
        {
          if ((c instanceof Sensor)) {
            {
              int _sensorPos = ((Sensor)c).getSensorPos();
              boolean _lessEqualsThan = (_sensorPos <= 7);
              if (_lessEqualsThan) {
                _builder.append("prox.horizontal[");
                int _sensorPos_1 = ((Sensor)c).getSensorPos();
                int _minus = (_sensorPos_1 - 1);
                _builder.append(_minus, "\t");
                _builder.append("] ");
                {
                  int _processDistance = this.processDistance(((Sensor)c));
                  boolean _equals = (_processDistance == 0);
                  if (_equals) {
                    _builder.append(" <= 1000 ");
                  } else {
                    _builder.append(" >= 2000 ");
                  }
                }
              } else {
                _builder.append("prox.ground.delta[");
                int _sensorPos_2 = ((Sensor)c).getSensorPos();
                int _modulo = (_sensorPos_2 % 8);
                _builder.append(_modulo, "\t");
                _builder.append("]\t");
                {
                  int _processDistance_1 = this.processDistance(((Sensor)c));
                  boolean _equals_1 = (_processDistance_1 == 0);
                  if (_equals_1) {
                    _builder.append("<= 400 ");
                  } else {
                    _builder.append(">= 450\t");
                  }
                }
              }
            }
          }
        }
        {
          int _minusMinus = count--;
          boolean _greaterThan = (_minusMinus > 1);
          if (_greaterThan) {
            _builder.append(" and ");
          }
        }
      }
    }
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      for(final Action a : la) {
        String _processAction = this.processAction(a);
        _builder.append(_processAction, "\t\t\t");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String processConditionButton(final List<Condition> lc, final List<Action> la) {
    int count = lc.size();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("when ");
    {
      for(final Condition c : lc) {
        {
          if ((c instanceof Button)) {
            _builder.append("button.");
            {
              int _processButton = this.processButton(((Button)c));
              boolean _equals = (_processButton == 0);
              if (_equals) {
                _builder.append("forward ");
              } else {
                int _processButton_1 = this.processButton(((Button)c));
                boolean _equals_1 = (_processButton_1 == 1);
                if (_equals_1) {
                  _builder.append("backward ");
                } else {
                  int _processButton_2 = this.processButton(((Button)c));
                  boolean _equals_2 = (_processButton_2 == 2);
                  if (_equals_2) {
                    _builder.append("left ");
                  } else {
                    int _processButton_3 = this.processButton(((Button)c));
                    boolean _equals_3 = (_processButton_3 == 3);
                    if (_equals_3) {
                      _builder.append("right ");
                    } else {
                      _builder.append("center ");
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("== 1");
        {
          int _minusMinus = count--;
          boolean _greaterThan = (_minusMinus > 1);
          if (_greaterThan) {
            _builder.append(" and ");
          }
        }
      }
    }
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      for(final Action a : la) {
        String _processAction = this.processAction(a);
        _builder.append(_processAction, "\t\t\t");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public int processDistance(final Sensor s) {
    Distance _distance = s.getDistance();
    if (_distance != null) {
      switch (_distance) {
        case CLOSE:
          return 0;
        default:
          return 1;
      }
    } else {
      return 1;
    }
  }

  public int processButton(final Button b) {
    ButtonType _button = b.getButton();
    if (_button != null) {
      switch (_button) {
        case FORWARD:
          return 0;
        case BACKWARD:
          return 1;
        case LEFT:
          return 2;
        case RIGHT:
          return 3;
        case CENTER:
          return 4;
        default:
          break;
      }
    }
    return 0;
  }

  public String processAction(final Action a) {
    final int[] note = { 0, 0, 0, 0, 0, 0 };
    final int[] duration = { 0, 0, 0, 0, 0, 0 };
    int pos = 1;
    if ((a instanceof SoundAction)) {
      EList<MusicSetting> _musicsettings = ((SoundAction)a).getMusicsettings();
      for (final MusicSetting m : _musicsettings) {
        {
          int _note = m.getNote();
          boolean _equals = (_note == 1);
          if (_equals) {
            int _pos = m.getPos();
            int _minus = (_pos - 1);
            note[_minus] = 262;
          } else {
            int _note_1 = m.getNote();
            boolean _equals_1 = (_note_1 == 2);
            if (_equals_1) {
              int _pos_1 = m.getPos();
              int _minus_1 = (_pos_1 - 1);
              note[_minus_1] = 311;
            } else {
              int _note_2 = m.getNote();
              boolean _equals_2 = (_note_2 == 3);
              if (_equals_2) {
                int _pos_2 = m.getPos();
                int _minus_2 = (_pos_2 - 1);
                note[_minus_2] = 370;
              } else {
                int _note_3 = m.getNote();
                boolean _equals_3 = (_note_3 == 4);
                if (_equals_3) {
                  int _pos_3 = m.getPos();
                  int _minus_3 = (_pos_3 - 1);
                  note[_minus_3] = 440;
                } else {
                  int _pos_4 = m.getPos();
                  int _minus_4 = (_pos_4 - 1);
                  note[_minus_4] = 524;
                }
              }
            }
          }
          Duration _duration = m.getDuration();
          if (_duration != null) {
            switch (_duration) {
              case MEDIUM:
                int _pos_5 = m.getPos();
                int _minus_5 = (_pos_5 - 1);
                duration[_minus_5] = 7;
                break;
              case LONG:
                int _pos_6 = m.getPos();
                int _minus_6 = (_pos_6 - 1);
                duration[_minus_6] = 14;
                break;
              default:
                int _pos_7 = m.getPos();
                int _minus_7 = (_pos_7 - 1);
                duration[_minus_7] = 0;
                break;
            }
          } else {
            int _pos_7 = m.getPos();
            int _minus_7 = (_pos_7 - 1);
            duration[_minus_7] = 0;
          }
        }
      }
    } else {
      if ((a instanceof LightAction)) {
        LightPos _pos = ((LightAction)a).getPos();
        if (_pos != null) {
          switch (_pos) {
            case BOT:
              pos = 2;
              break;
            default:
              break;
          }
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((a instanceof SoundAction)) {
        _builder.newLineIfNotEmpty();
        _builder.append("call math.copy(notes[0:5], [");
        int _get = note[0];
        _builder.append(_get);
        _builder.append(", ");
        int _get_1 = note[1];
        _builder.append(_get_1);
        _builder.append(", ");
        int _get_2 = note[2];
        _builder.append(_get_2);
        _builder.append(", ");
        int _get_3 = note[3];
        _builder.append(_get_3);
        _builder.append(", ");
        int _get_4 = note[4];
        _builder.append(_get_4);
        _builder.append(", ");
        int _get_5 = note[5];
        _builder.append(_get_5);
        _builder.append("])");
        _builder.newLineIfNotEmpty();
        _builder.append("call math.copy(durations[0:5], [");
        int _get_6 = duration[0];
        _builder.append(_get_6);
        _builder.append(", ");
        int _get_7 = duration[1];
        _builder.append(_get_7);
        _builder.append(", ");
        int _get_8 = duration[2];
        _builder.append(_get_8);
        _builder.append(", ");
        int _get_9 = duration[3];
        _builder.append(_get_9);
        _builder.append(", ");
        int _get_10 = duration[4];
        _builder.append(_get_10);
        _builder.append(", ");
        int _get_11 = duration[5];
        _builder.append(_get_11);
        _builder.append("])");
        _builder.newLineIfNotEmpty();
        _builder.append("note_index = 1");
        _builder.newLine();
        _builder.append("note_count = 6");
        _builder.newLine();
        _builder.append("call sound.freq(notes[0], durations[0])");
        _builder.newLine();
      }
    }
    {
      if ((a instanceof LightAction)) {
        {
          if ((pos == 1)) {
            _builder.append("\t\t\t\t");
            _builder.append("call leds.top(");
            int _red = ((LightAction)a).getRed();
            _builder.append(_red, "\t\t\t\t");
            _builder.append(" , ");
            int _green = ((LightAction)a).getGreen();
            _builder.append(_green, "\t\t\t\t");
            _builder.append(", ");
            int _blue = ((LightAction)a).getBlue();
            _builder.append(_blue, "\t\t\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((pos == 2)) {
            _builder.append("\t\t\t\t");
            _builder.append("call leds.bottom.left(");
            int _red_1 = ((LightAction)a).getRed();
            _builder.append(_red_1, "\t\t\t\t");
            _builder.append(" , ");
            int _green_1 = ((LightAction)a).getGreen();
            _builder.append(_green_1, "\t\t\t\t");
            _builder.append(", ");
            int _blue_1 = ((LightAction)a).getBlue();
            _builder.append(_blue_1, "\t\t\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.append("call leds.bottom.right(");
            int _red_2 = ((LightAction)a).getRed();
            _builder.append(_red_2, "\t\t\t\t");
            _builder.append(" , ");
            int _green_2 = ((LightAction)a).getGreen();
            _builder.append(_green_2, "\t\t\t\t");
            _builder.append(", ");
            int _blue_2 = ((LightAction)a).getBlue();
            _builder.append(_blue_2, "\t\t\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      if ((a instanceof MotorAction)) {
        _builder.append("\t\t\t\t");
        _builder.append("motor.left.target = ");
        int _motorLeft = ((MotorAction)a).getMotorLeft();
        _builder.append(_motorLeft, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("motor.right.target = ");
        int _motorRight = ((MotorAction)a).getMotorRight();
        _builder.append(_motorRight, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
