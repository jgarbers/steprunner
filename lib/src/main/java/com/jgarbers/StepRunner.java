package com.jgarbers;

import java.util.ArrayList;

/**
 * Created by ECR FTC 11096 on 10/29/2016.
 */

public class StepRunner extends Step {
    public ArrayList<Step> stepList = new ArrayList<>();

    public void start(Robot r) {
        super.start(r);
    }

    public Boolean run() {
        super.run();
        return false;
    }

    public void stop() {
        super.stop();

    }

}
