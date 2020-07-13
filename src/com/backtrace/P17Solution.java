package com.backtrace;

import org.junit.Test;

import java.util.*;

public class P17Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] album = {"","","abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String item = "";
        if (digits.isEmpty())return result;
        combine(result,album,digits,item);
        return result;
    }

    private void combine(List<String> result,String[] album,String digits,String item){
        if (digits.isEmpty()) {
            result.add(item);
        }
        else {
            int i = digits.charAt(0) - 48;
            for (int j = 0;j<album[i].length();j++){
                 combine(result,album, digits.substring(1),new String(item + album[i].charAt(j)));
            }
        }
    }

    @Test
    public void test(){
        String a = "234";
        System.out.println(letterCombinations(a));
    }

}
