package baitap;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Bai14 {
    public static void main(String[] args) {
//Viết chương trình Java để sắp xếp các phần tử trong TreeMap theo thứ tự giảm dần của giá trị của chúng.
        TreeMap<Integer,Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(2,2);
        treeMap.put(4,2);
        treeMap.put(25,2);
        treeMap.put(24,2);
        treeMap.put(3,2);
        treeMap.put(1,2);
        System.out.println(treeMap);
    }

}
