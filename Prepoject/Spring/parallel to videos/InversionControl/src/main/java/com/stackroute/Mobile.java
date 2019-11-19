package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
//        Airtel airtel = new Airtel();
//        Vodafone vodafone = new Vodafone();

//        vodafone.calling();
//        vodafone.data();

//        airtel.calling();
//        airtel.data();

//        Sim sim = new Vodafone();
//        sim.calling();
//        sim.data();

            ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/stackroute/beans.xml");
            System.out.println("config file loaded");

             Sim sim = context.getBean("sim",Sim.class);
             sim.calling();
             sim.data();

            Airtel air = (Airtel) context.getBean("airtel");
            air.calling();
            air.data();

            Vodafone voda = context.getBean("vodafone",Vodafone.class);
            voda.calling();
            voda.data();


            Sim sim2 = context.getBean("sim2",Sim.class);
            sim2.calling();
            sim2.data();

    }
}
