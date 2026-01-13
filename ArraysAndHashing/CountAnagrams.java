package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;

public class CountAnagrams {
    public static void main(String[] args){

    }
    public int countAnagrams(String s) {
        String[] myArr = s.split(" ");
        HashMap<Character, Integer> myMap;
        ArrayList<HashMap<Character, Integer>> myArrayList = new ArrayList<>();
        for(int i = 0; i < myArr.length; i++){
            myMap = new HashMap<>();
            for(int j = 0; j < myArr[i].length(); j++){
                if(myMap.containsKey(myArr[i].charAt(j))){
                    myMap.put(myArr[i].charAt(j), myMap.get(myArr[i].charAt(j))+1);
                }
                else{
                    myMap.put(myArr[i].charAt(j), 1);
                }
            }
            myArrayList.add(myMap);
        }
        return 1;
    }

}
