package com.jgarbers;

import java.util.Arrays;

public class StepTest {
    public static void main(String[] args) {
        System.out.println("Starting Step Test");
        Robot r = new Robot();

//        SequenceStep main = new SequenceStep(Arrays.asList(
//            new WaitStep(50),
//            new WaitStep(25)
//        ));

        UntilOneDoneStep main = new UntilOneDoneStep(Arrays.asList(
            new WaitStep(500),
            new WaitStep(200)
        ));

        main.start(r);
        while(main.isRunning()) {
            main.run();
        }
        main.stop();


    }
}


