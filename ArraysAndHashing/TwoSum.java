package ArraysAndHashing;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){

    }

    public int[] twoSum(int[] nums, int target){
        int[] arr;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] myArr = null;
        for(int i = 0; i < nums.length; i++){
            myMap.put(nums[i], i);
        }
        for(Integer myInt : myMap.keySet()){
            if(myMap.containsKey(target - myInt)){
                myArr = new int[2];
                myArr[0] = myMap.get(myInt);
                myArr[1] = myMap.get(target - myInt);
            }
        }
        return myArr;
    }

}
