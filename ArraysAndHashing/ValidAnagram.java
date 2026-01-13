package ArraysAndHashing;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(isAnagram("anagra", "nagaram"));
    }
    //My first approach not efficient
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> myMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(myMap.containsKey(s.charAt(i))){
                myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1);
            }
            else{
                myMap.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(myMap.containsKey(t.charAt(i))){
                myMap.put(t.charAt(i),myMap.get(t.charAt(i)) - 1);
            }
            else{
                return false;
            }
        }
        Integer[] myArr =  myMap.values().toArray(new Integer[0]);
        for(int i = 0; i < myArr.length; i++){
            if(myArr[i] != 0){
                return false;
            }
        }
        return true;
    }
    //Second Approach using 2 hashmap
    public static boolean isAnagram2(String s, String t){
        HashMap<Character, Integer> myMapS = new HashMap<>();
        HashMap<Character, Integer> myMapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!myMapS.containsKey(s.charAt(i))){
                myMapS.put(s.charAt(i), 1);
            }
            else{
                myMapS.put(s.charAt(i), myMapS.get(s.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(!myMapT.containsKey(t.charAt(i))){
                myMapT.put(t.charAt(i), 1);
            }
            else{
                myMapT.put(t.charAt(i), myMapT.get(t.charAt(i)) + 1);
            }
        }

        for(Character c : myMapT.keySet()){
            if(!myMapT.containsKey(c)){
                return false;
            }else{
                if(myMapT.get(c) != myMapS.get(c)){
                    return false;
                }
            }
        }
        return true;

    }
}
