package com;

public class Main implements Runnable {

    Dead1 dead1 = new Dead1();
    Dead2 dead2 = new Dead2();

    Main(){
        try {
            Thread thread = new Thread(this);
            thread.start();
            /**
             * To solve deadlock problem we can use 'join'
             * another thread will wait
             */
            thread.join();

            dead1.death1(dead2);
        }catch (InterruptedException e){
            System.out.println("Exception "+e);
        }
    }
    public static void main(String[] args) {
        new Main();
    }
    public void run(){
        dead2.death2(dead1);
    }
}
