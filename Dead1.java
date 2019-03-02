package com;


public class Dead1 {
    synchronized void death1(Dead2 dead2){
        System.out.println(Thread.currentThread().toString()+" enter method death1");

        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        System.out.println("Try to enter method death2");
        dead2.check();
    }
    synchronized void check(){
        System.out.println("Dead2 enter check()");
    }
}
