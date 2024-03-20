package baitap;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        //khai báo khởi tạo hashmap
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Orange", 3);
        map.put("Banana", 8);
        map.put("Grapes", 2);

        //Tạo danh sách cặp key value từ hashmap
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());

        //Sắp xếp danh sách theo giá trị tăng dần
        Collections.sort(entryList, Map.Entry.comparingByValue());

        System.out.println("Hashmap sau săp xep : ");
        for (Map.Entry<String,Integer> entry : entryList){
            System.out.println(entry.getKey() + ": " +entry.getValue());
        }
    }
}
