package com.hashSet;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P49Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for (String str:strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String r = Arrays.toString(a);
            if (!hashMap.containsKey(r))hashMap.put(r, new ArrayList<String>());
            hashMap.get(r).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        result.addAll(hashMap.values());
        return result;
    }

    @Test
    public void test(){
        String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagrams(a);
        System.out.println(ans);
    }
}
