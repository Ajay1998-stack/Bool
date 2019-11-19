package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TesstArrayList {
    private static Arraylist arraylist;

    @BeforeClass
    public static void setUp(){
        arraylist= new Arraylist();
    }

    @AfterClass
    public static void tearDown(){
        arraylist= null;
    }

    @Test
    public void TestArrayList(){
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        List<String> list2 = new ArrayList<>();
        list2.add("Kiwi");
        list2.add("Grape");
        list2.add("Mango");
        list2.add("Berry");
        assertEquals("",list2,arraylist.update(list,0,"Kiwi",2,"Mango"));
    }
}
