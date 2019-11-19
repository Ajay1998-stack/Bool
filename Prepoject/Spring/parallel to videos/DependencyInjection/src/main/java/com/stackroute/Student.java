package com.stackroute;

public class Student {
    private String studentName;
    private int id;

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }

    public  Student(int id,  String studentName){
//        super();
        this.id=id;
        this.studentName= studentName;
    }


    public void displayStudentInfo(){
        System.out.println("student Name is "+studentName+"  and the  ID no is " + id);
    }

}
