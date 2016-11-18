package com.jgarbers;

import java.util.Locale;

/**
 * Created by ECR FTC 11096 on 10/29/2016.
 */
public class Step {

    protected Robot robot;
    private Boolean running = false;
    private long startTime = 0;


    /*
        start: method called when Step begins
     */
    public void start(Robot r) {
        robot = r;
        running = true;
        startTime = robot.currentTimeMillis();
        // QUESTION: Why do we do the log after the other instructions
        // and not before?
        log("start");
    }

    /*
        run: called repeatedly while Step is functioning.
        Subclasses should check for completion and call setDone() if they're done.
     */
    public void run() {
        log("running");
    }

    /*
        isRunning: Returns true if the step wants to continue to run.
     */
    public Boolean isRunning() {
        return running;
    }


    /*
        stop: called after Step's job is done OR to cancel the step. Allows for
        cleanup, etc.
     */
    public void stop() {
        log("stop");
        setDone();
    }

    /*
        Sets us to the not-running state. We encapsulate this
        in case we want to have multiple states in the future.
     */
    protected void setDone() {
        // QUESTION: Why do we check 'running' here?
        if (running) {
            log("done");
            running = false;
        }
    }

    /*
        Returns elapsed time since step start in milliseconds.
        QUESTION: Is this a good name for this method? Should it be shorter,
        like just "elapsed"?
     */
    protected long elapsedTimeMillis() {
        return robot.currentTimeMillis() - startTime;
    }



    /*
        Log a debugging message. Method prefixes message with classname.
        QUESTION: Why is this declared as 'protected' and not 'private'?
     */
    protected void log(String message) {
        String prefix = this.getClass().getSimpleName();
        System.out.println(String.format(Locale.US,
                "%-15s (t=%5d): %s",
                prefix,
                elapsedTimeMillis(),
                message));
        // Log.info(prefix + ":" + message);
    }

}
