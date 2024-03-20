package baitap;

import baitap.baitap6.TreeNode;

import java.util.TreeMap;

public class Bai11 {
    public static void main(String[] args) {
        int [ ] arr = {1,2,3,4,5,423,5,643,5,35,5,6};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        //Đưa phần tử của mảng vào treeMap
        for (int num : arr){
                treeMap.put(num,0);

        }
        System.out.println("Các phâần tử trong treeMap sau sx là " + treeMap.keySet());

    }
}
