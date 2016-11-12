package com.jgarbers;





    public class StepTest {
        public static void main(String[] args) {
            System.out.println("Starting Step Test");
            Robot r = new Robot();

            MotorStep mStep = new MotorStep();

            mStep.start(r);
            mStep.run(15);
            mStep.stop(r);


            WaitStep wStep = new WaitStep();

            wStep.start(r);
            wStep.run(5);
            wStep.stop(r);

//            StepRunner foo = new StepRunner();
//            foo.stepList.add(new Step());

//            foo.start(r);
//
//            int[] array = new int[]{3,3,3};
//            for (int k = 0; k < array.length; k++) {
//
//                switch(array[k]) {
//                    case 3 :
//                        System.out.println("GOT THREE!");
//                        break;
//                    System.out.print(array[k] + " ");
//                    case 2 :
//                        System.out.println("GOT TWO!");
//                        break;
//                        System.out.print(array[k] + " ");
//            }
//
//            for(int i = 0; i < 10; i++){
//                foo.run(i);
//            }
//
//
//
//            for(int i = 0; i < 5; i++){
//                foo.motorstep1(i);
//            }
//
//            foo.stop(r);
//
//        }
        }
    }


