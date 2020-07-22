package com.hashSet;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class P76Solution {
    /**
     * mysolution
     * this question is unclear for whether the number of same character should take into count
     * the shortest substring of s must contain all the chars of t, including the repeat chars
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        StringBuilder minW = new StringBuilder();
        int m = s.length()+1;
        String result = "";
        for (int i = 0;i<t.length();i++){
            int k = tMap.getOrDefault(t.charAt(i),0);
            tMap.put(t.charAt(i),k + 1);
        }
        for (int end = 0,begin=0;end<s.length();end++){
            sMap.put(s.charAt(end),sMap.getOrDefault(s.charAt(end),0)+1);
            minW.append(s.charAt(end));
            while ((!tMap.containsKey(s.charAt(begin))||sMap.get(s.charAt(begin))>tMap.get(s.charAt(begin))) && begin<end){
                sMap.put(s.charAt(begin),sMap.get(s.charAt(begin))-1);
                minW.deleteCharAt(0);
                begin++;
            }
            Set<Character> l = tMap.keySet();
            int a = 1;
            for (char i:l){
                if (!sMap.containsKey(i) || sMap.get(i)<tMap.get(i)) {
                    a = 0;
                    break;
                }
            }
            if (a==1 && minW.length()<m) {
                m = minW.length();
                result = minW.toString();
            }
        }
        return result;
    }

    @Test
    public void test(){
        String s = "aa";
        String t = "a";
        System.out.println(minWindow(s,t));
    }
}
