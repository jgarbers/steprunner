package com.jgarbers;

/**
 * Created by Afterburner 2 on 10/31/2016.
 */
public class MotorStep extends  Step {

    public void start(Robot r) {
        super.start(r);
    }

    ;

    public  void stop(Robot r){
        super.stop(r);
    };


    public Boolean run(long elapsed) {
        for (int i = 0; i < elapsed; i++)
           super.run(elapsed);
        return true;
    }
}
