# RobotDsl #
A DSL (Domain Specific Language) that can generate Thymio Robot code. This DSL is developed in Eclipse Modeling Tools using Xtext and Xtend and also implements validator, type checker, auto-completion, and quick fix functions. The main concept of this DSL is modularity, allowing for the easy definition and use of conditions and actions.
# Example: Follow White Line
```
Condition:
  -Sensor bottomLeftNo
    sensorPosition 8
    detectObstacle NOOBSTACLE
  -Sensor bottomRightNo
    sensorPosition 9
    detectObstacle NOOBSTACLE
  -Sensor bottomLeft
    sensorPosition 8
    detectObstacle OBSTACLE
  -Sensor bottomRight
    sensorPosition 9
    detectObstacle OBSTACLE
  -Button center CENTER
Action:
  -MotorAction stop
  -MotorAction gofront motorLeft 300 motorRight 200+100
  -MotorAction turnLeft motorLeft 200+100 motorRight -150
  -MotorAction turnRight motorLeft -150 motorRight 300
  - LightAction lightred position:TOP red:32
  - LightAction lightblue position:TOP blue:32
  - LightAction lightgreen position:BOT green:32
Event goforward conditions: bottomLeft and bottomRight actions: gofront, lightblue
Event event2 conditions: bottomLeft and bottomRightNo actions: turnRight, lightgreen
Event event3 conditions: bottomLeftNo and bottomRight actions: turnLeft, lightred
Event event4 conditions: center actions: stop

```
