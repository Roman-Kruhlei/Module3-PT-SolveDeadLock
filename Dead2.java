package com;

public class Dead2 {
    synchronized void death2(Dead1 dead1){
        System.out.println(Thread.currentThread().toString()+" enter method death2");

        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        System.out.println("Try to enter method death1");
        dead1.check();
    }
    synchronized void check(){
        System.out.println("Dead1 enter check()");
    }
}
