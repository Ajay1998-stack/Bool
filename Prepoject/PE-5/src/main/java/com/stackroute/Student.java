package com.stackroute;

import java.util.Comparator;

public class Student {
    public class student{
        private int id;
        private String name;
        private int age;

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

    public class StudentSorter implements Comparator<student>{
        public class  MainTest {
            Student studObj = new Student();
            Student studObj2 = new Student();
            Student studObj3 = new Student();
            Student studObj4 = new Student();
            Student studObj5 = new Student();

        }

        @Override
        public int compare(student o1, student o2) {
            return 0;
        }
    }


}


