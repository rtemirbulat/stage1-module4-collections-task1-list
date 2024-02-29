package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newArr = new ArrayList<>();
        for (String i: sourceList) {
            if((sourceList.indexOf(i)+1)%3==0){
                newArr.add(i);
                newArr.add(i);
            }
        }
        return newArr;
    }
}
