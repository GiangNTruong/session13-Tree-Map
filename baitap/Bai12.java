package baitap;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

public class Bai12 {
    public static void main(String[] args) {
//        Cách 1
//        Random random = new Random();
//        random.nextInt(200);
//        int[] arr = new int[100];
//        for (int i = 0; i < 100; i++) {
//
//        }
//        //Khai báo TreeMap để lưu trữ dữ liệu
//        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
//
//        //Đưa phần tử của mảng vào TreeMap
//        for (int num : arr){
//            treeMap.put(num,0);
//        }
//        //lấy max phần tuwrr trong treemap
//        int largerstElement = treeMap.lastKey();
//
//        treeMap.remove(largerstElement);
//        int secondLargestElement = treeMap.lastKey();
//        System.out.println("Mảng ban đầu " + Arrays.toString(arr));
//        System.out.println("MAx 2 trong mảng : "+secondLargestElement);

        //cách 2 phương thức
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=random.nextInt(100);
        }
        //Khai báo TreeMap để lưu trữ dữ liệu
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        //Đưa phần tử của mảng vào TreeMap
        for (int num : arr){
            if (treeMap.containsKey(num)){
                treeMap.put(num,treeMap.get(num)+1);
            }else {
                treeMap.put(num,1);
            }
        }
        System.out.println(treeMap);
        //lấy max phần tuwrr trong treemap
        int largerstElement = treeMap.lastKey();
        int secondLargestElement = treeMap.lowerKey(largerstElement);
        System.out.println("Mảng ban đầu " + Arrays.toString(arr));
        System.out.println("MAx 2 trong mảng : "+secondLargestElement);
    }
}
