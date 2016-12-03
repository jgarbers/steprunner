# Notes Meeting 2016-11-27

## Milestones
- M0
        ParallelStep (better name? AND/OR?)
- M1
    - drive forward 3 seconds
        DriveStep
- M2
    - drive in a 2' square
        TurnStep
        DistanceStep

- M3
    - shoot two balls
        SpinUpShooterStep()
        FireStep()
        SpinDownShooterStep()

- M4
    - drive to and push beacon
        ServoStep(which servo, what reading (0-255))
        PushbuttonStep(which servo)
        ColorStep

## New Step classes

### WaitStep(time)

### SequenceStep(list of steps)

### ParallelStep(list of steps)
    UntilAllDoneStep(List<Step> theStepList)
    UntilOneDoneStep(List<Step> theStepList)


### DriveStep(speed (inches/sec?), heading... distance?)

### TurnStep(speed (degrees/sec? use gyro?)

### SensorStep(sensor reading?)

### ColorStep(desired color, threshold, sensor id)?

### DistanceStep(in)

### EncoderStep(encoder reading?)

### ServoStep(which servo, what reading (0-255))

### PushbuttonStep(which servo)

### SpinUpShooterStep()

### FireStep()

### SpinDownShooterStep()




