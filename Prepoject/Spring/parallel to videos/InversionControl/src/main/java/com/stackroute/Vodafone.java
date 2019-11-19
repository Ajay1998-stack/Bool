package com.stackroute;

public class Vodafone implements Sim {

       @Override
        public  void calling(){
            System.out.println("calling using vodafone");
        }

        @Override
        public void data() {
            System.out.println("Network using vodafone");
        }
    }
