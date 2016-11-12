package com.jgarbers;

/**
 * Created by ECR FTC 11096 on 10/29/2016.
 */
public class Step {

    Robot robot;

    /*
        start: method called when Step begins
     */
    public void start(Robot r) {
        robot = r;
        log("start");
    }

    /*
        run: method called repeatedly while Step is functioning.
        Returns false when Step's job is done.
     */
    public Boolean run() {
        log("running");
        return false;
    }

    /*
        stop: method called after Step's job is done. Allows for
        cleanup, etc.
     */
    public void stop() {
        log("stop");
    }

    /*
        Log a debugging message. Method prefixes message with classname.
     */
    private void log(String message) {
        String prefix = this.getClass().getSimpleName();
        System.out.println(prefix + ":" + message);
        // Log.info(prefix + ":" + message);
    }

}
