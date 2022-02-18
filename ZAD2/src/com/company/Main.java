package com.company;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        usunPrzedostatni(set);
        for (Integer m:set){
            System.out.println(m);
        }
    }
    public static <T>void usunPrzedostatni(LinkedHashSet<T> set){
        Iterator<T> it1= set.iterator();
        int i=0;
        T e=null;
        while (it1.hasNext()){
            T x= it1.next();
            if(i== set.size()-2){
                e=x;
            }
            i++;
        }
        set.remove(e);
    }
}