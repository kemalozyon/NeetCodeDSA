package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] test1 = {1,2,3,1};
        int[] test2 = {1,2,3,4};
        int[] test3 = {1,1,1,3,3,4,3,2,4,2};

        boolean k = containsDuplicate1(test2);
        System.out.println(k);

        k = containsDuplicate1(test3);
        System.out.println(k);

        k = containsDuplicate3(test2);
        System.out.println(k);

    }
    //First Approach: Brute Force O(n^2)
    public static boolean containsDuplicate1(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Second Approach: Sorted Version
    public static boolean containsDuplicate2(int[] nums){
        //If we sort
        Arrays.sort(nums); //Sorted Version of nums
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    //Final Version: With HashSet
    public static boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (mySet.contains(nums[i])) {
                return true;
            }
            mySet.add(nums[i]);
        }
        return false;
    }
}