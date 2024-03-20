package baitap;

import java.util.HashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
        //: Viết chương trình Java để đếm số lần xuất hiện của mỗi phần tử trong một mảng và lưu trữ kết quả trong HashMap.
        int [] array = {1,2,4,5,6,7,5,4,3,2};
        Map<Integer,Integer> countMap = new HashMap<>();
        //Duyệt tưnừng phần t và dem so lan
        for (int num : array){
            if (countMap.containsKey(num)){
                countMap.put(num,countMap.get(num)+1);
            }else {
                countMap.put(num,1);
            }
        }
        for (Map.Entry<Integer,Integer>entry:countMap.entrySet()){
            System.out.println("Phần tu " +entry.getKey() + "Count "+entry.getValue());
        }
    }
}
