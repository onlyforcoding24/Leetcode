package leetcodechallenge.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //System.out.println(getGroupAnagram(str));
        System.out.println(getAna(str));
    }

    // Implementation #1
    public static List<List<String>> getGroupAnagram(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ch = new char[26];
            for(char c : s.toCharArray()){
                ch[c - 'a']++;
            }
            String kStr = String.valueOf(ch);
            if(!map.containsKey(kStr)){
                map.put(kStr, new ArrayList<>());
            }
            map.get(kStr).add(s);
        }

        return new ArrayList<>(map.values());
    }

    // Implementation #2
    public static List<List<String>> getAna(String[] strs){

        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sk = String.valueOf(ch);
            if(!map.containsKey(sk)){
                map.put(sk, new ArrayList<>());
            }
            map.get(sk).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

}