package com.jgarbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ECR FTC 11096 on 10/29/2016.
 *
 * Runs a set of steps one at a time.
 */

public class StepRunner extends Step {
    protected List<Step> stepList;
    protected Integer currentStep = 0;

    public StepRunner(List<Step> theStepList) {
        stepList = theStepList;
    }

    /* When StepRunner starts, it starts the first step in its list. */

    public void start(Robot r) {
        super.start(r);

        // If we don't have an empty list, start the first step.
        //  QUESTION: Why do we have to pass the Robot parameter to
        //  the Step in our list?
        if (!atEnd()) {
            stepList.get(currentStep).start(r);
        }

    }

    /* When StepRunner runs, it runs the current step in its list. If that
        step is done, it starts the next step -- if there is one. */

    public void run() {
        super.run();
        // QUESTION: Do we need to check for atEnd or isRunning here?

        Step s = stepList.get(currentStep);
        if (s.isRunning()) {
            s.run();
        } else {
            s.stop();
            currentStep++;
            if (!atEnd()) {
                stepList.get(currentStep).start(robot);
            }
        }
    }

    /* When StepRunner is told to stop, stop our current Step if it's
        running, and stop ourselves.
     */

    public void stop() {
        super.stop();
        if (!atEnd()) {
            Step s = stepList.get(currentStep);
            if (s.isRunning()) {
                s.stop();
            }
        }
    }


    /*
        Check to see if we're out of steps to run. If so,
        set running to false and return true.
    */
    protected Boolean atEnd() {
        if (currentStep >= stepList.size()) {
            setDone();
            return true;
        }
        return false;
    }

}
