package baitap;

import java.util.HashMap;
import java.util.Map;

public class Bai9 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ha", 1);
        map.put("Hi", 2);
        map.put("Ho", 3);

        //B2: Sử dụng phương thức containsKey() Kiểm tra pần tử ton tại trong Hashmap ko
        String keyToCheck = "Hi1";
        if (map.containsKey(keyToCheck)){
            System.out.println("Phần tử " +keyToCheck + " có tồn tại");
        }else {
            System.out.println("Phần tử " +keyToCheck + " ko tồn tại");
        }

    }
}
