package com.jgarbers;

import java.util.ArrayList;

/**
 * Created by Afterburner 2 on 10/29/2016.
 */
public class StepRunner extends Step {
   public ArrayList<Step> stepList = new ArrayList<>();
    public void start(Robot r) {
        super.start(r);
    }

    ;

    public Boolean run(long elapsed) {
        super.run(elapsed);
       // robot.ping();
        return false;
    }
;
    public Boolean motorstep1(int elapsed) {
        //super.motorStep(elapsed);

        // robot.ping();
        return false;
    }
    ;

    public void stop(Robot r){
        super.stop(r);

    }

    ;
}
