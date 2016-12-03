package com.jgarbers;

import java.util.List;

/**
 * Created by by ECR FTC 11096  on 12/2/16.
 */

public class UntilAllDoneStep extends ParallelStep {

    public UntilAllDoneStep() {
        super();
    }
    public UntilAllDoneStep(List<Step> theStepList) {
        super(theStepList);
    }
    protected boolean untilAllDone() {
        return true;
    }
}
