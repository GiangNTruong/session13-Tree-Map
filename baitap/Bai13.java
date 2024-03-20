package baitap;

import java.util.TreeMap;

public class Bai13 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(2,"Two");
        treeMap.put(3,"Three");
        treeMap.put(1,"One");
        treeMap.put(5,"Five");
        //Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng cách sử dụng phương thức firstEntry() của đối tượng TreeMap.

        System.out.println( treeMap.firstEntry());
    }
}
