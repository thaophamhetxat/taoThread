package com.codegym;

public class NumberGenetor implements Runnable {
    private Thread myThread;
    private  String threadName;

    public NumberGenetor(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }




    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("printing the count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
    public void start (){
        System.out.println("start "+myThread);
        if(myThread==null){
            myThread= new Thread(this,threadName);
myThread.start();

        }
    }

}
