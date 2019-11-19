package com.stackroute;

public class Airtel implements Sim {
    // Constructor to check whether object is created or not?
//    public Airtel(){
//        System.out.println("airtel constructor");
//    }

    @Override
    public  void calling(){
        System.out.println("calling using airtel");
    }

    @Override
    public void data() {
        System.out.println("Network using airtel");
    }
}
