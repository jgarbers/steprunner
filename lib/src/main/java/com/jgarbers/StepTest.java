package com.jgarbers;

public class StepTest {
    public static void main(String[] args) {
        System.out.println("Starting Step Test");
        Robot r = new Robot();

        MotorStep mStep = new MotorStep();

        mStep.start(r);
        mStep.run();
        mStep.stop();

        WaitStep wStep = new WaitStep();

        wStep.start(r);
        wStep.run();
        wStep.stop();

    }
}


