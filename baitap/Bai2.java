package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        //Viết chương trình Java để tìm các phần tử duy nhất trong một mảng và lưu trữ chúng trong một HashMap.
        int [] arr = {1,2,3,5,6,8,9,5,43};
        Map<Integer,Integer> mapCount = new HashMap<>();
        //Duyệt tưnừng phần tử và đếm so lan
        for (int num : arr){
            if (mapCount.containsKey(num)){
                mapCount.put(num, mapCount.get(num)+1);
            }else {
                mapCount.put(num,1);
            }
        }
        // B3: Duyệt qua các phần tử trong HashMap và lưu trữ các phần tử có giá trị bằng 1 vào một ArrayList
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : mapCount.entrySet()){
            if (entry.getValue()==1){
                uniqueList.add(entry.getKey());
            }
        }
        System.out.println(uniqueList);
        //Chuyển ArrayList sang mảng
        int[] uniqueElements = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueElements[i] = uniqueList.get(i);
        }

        // B4: In ra các phần tử duy nhất
        System.out.println("Các phần tử duy nhất trong mảng là: " + Arrays.toString(uniqueElements));

    }
}
