package com.jgarbers;

import java.util.Arrays;

public class StepTest {
    public static void main(String[] args) {
        System.out.println("Starting Step Test");
        Robot r = new Robot();

        StepRunner main = new StepRunner(Arrays.asList(
            new WaitStep(50),
            new WaitStep(25)
        ));

        main.start(r);
        while(main.isRunning()) {
            main.run();
        }
        main.stop();


    }
}


