package com.jgarbers;

/**
 * Created by Afterburner 2 on 10/29/2016.
 */
public class Step {

    Robot robot;

    public void start(Robot r) {
            log("Start");
        robot = r;
    }

    ;

    public  void stop(Robot r){

        log("stop");
        robot = r;
    };


      public Boolean run(long elapsed) {
        log("Running");
        return false;
    }

    ;

//    public Boolean motorStep(int elapsed){
//        robot.straight();
//        log("Running Straight");
//        return false;
//    };

//    public Boolean shortstep(int elapsed){
//        robot.straight();
//        log("Running short");
//        return false;
//    };



    private void log(String message) {
        System.out.println(this.getClassName() + ": " + message);
    }

    public String getClassName(){
        return this.getClass().getSimpleName();
    }

}
