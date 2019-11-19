package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public List<String> update(List<String> list, int index, String update,int ind2,String up2){
        list.set(index,update);
        list.set(ind2,up2);
//        list.clear();
        return list;
    }
}
