package ArraysAndHashing;

import java.util.*;

public class TopKFreaquentElements {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int[] arr = topKFrequent(nums, 2);
        for(int a : arr){
            System.out.println(a);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr;
        ArrayList<Integer> myArrList = new ArrayList<>();
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(myMap.containsKey(nums[i])){
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            }else{
                myMap.put(nums[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(myMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for(Map.Entry<Integer, Integer> entry : list){
            if(k == 0) break;
            myArrList.add(entry.getKey());
            k--;
        }
        arr = myArrList.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
