package baitap;

import java.util.HashMap;

public class Bai7 {
    //Khai bao và khởi tạo HashMap goc và tạo dữ liệu
    public static void main(String[] args) {
        HashMap<String,Integer> originaMap = new HashMap<>();
        originaMap.put("One" ,1);
        originaMap.put("Two" ,2);
        originaMap.put("Three" ,3);

        //Khai báo một HashMap mới và sử dụng phương thức putAll() để sao chép tất cả các phần tử từ HashMap gốc vào HashMap mới.
        HashMap<String, Integer> copieMap = new HashMap<>();
        copieMap.putAll(originaMap);

        //-	B3: Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa.
        System.out.println("Hashmap gốc : " +originaMap);
        System.out.println("HashMap đã sao chép: " + copieMap);
    }

}
