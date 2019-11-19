package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

//        Student student= new Student();
//        student.setStudentName("Ajay");
//        student.displayStudentInfo();
//        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/stackroute/beans.xml");
//        Student ajay = context.getBean("student",Student.class);
////        Student ajay2 = context.getBean("ajay",Student.class);
//        ajay.displayStudentInfo();
//        ajay2.displayStudentInfo();


        //using contrucote
//        Student ajay3 = new Student(3,"John wick");
//        ajay3.displayStudentInfo();

        ApplicationContext context1 = new ClassPathXmlApplicationContext("file:src/main/java/com/stackroute/beans.xml");
       Student stud3 = context1.getBean("student3",Student.class);
        stud3.displayStudentInfo();

    }
}
