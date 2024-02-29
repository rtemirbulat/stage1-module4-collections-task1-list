package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator newListComp = new ListComparator();
        sourceList.sort(newListComp);
    }
}

class ListComparator implements Comparator<String> {
    public int givenFunction(String str){
        return 5* Integer.valueOf(str)*Integer.valueOf(str) + 3;
    }

    @Override
    public int compare(String a, String b) {
        if(Integer.compare(givenFunction(a),givenFunction(b))==0 && (Integer.valueOf(a)<0 || Integer.valueOf(b)<0)){
            if(Integer.valueOf(a)>Integer.valueOf(b)){
                return 1;
            }
            else return -1;
        }
        return Integer.compare(givenFunction(a),givenFunction(b));
    }
}
