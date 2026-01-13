package ArraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<Integer>> strArr = new HashMap<>();
        List<List<String>> returnValue = new LinkedList<>();
        int i = 0;
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!strArr.containsKey(sorted)){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                strArr.put(sorted, arr);
            }
            else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr = strArr.get(sorted);
                arr.add(i);
                strArr.put(sorted, arr);
            }
            i++;
        }
        for(String s : strArr.keySet()){
            List<String> myList = new LinkedList<>();
            for(Integer a : strArr.get(s)){
                myList.add(strs[a]);
            }
            returnValue.add(myList);
        }
        return returnValue;
    }

}
