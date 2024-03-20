package baitap;

import javax.swing.*;
import java.util.TreeMap;

public class Bai15 {
    public static void main(String[] args) {
        TreeMap<Integer,String>  treeMap = new TreeMap<>();
        treeMap.put(1,"One");
        treeMap.put(2,"Two");
        treeMap.put(3,"Three");
        treeMap.put(4,"Four");
        System.out.println(treeMap);
        treeMap.remove(2);
        System.out.println(treeMap);
    }
}
