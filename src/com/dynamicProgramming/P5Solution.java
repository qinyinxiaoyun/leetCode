package com.dynamicProgramming;

import org.junit.Test;

public class P5Solution {
    public String longestPalindrome(String s) {
        if (s.length()<=1)return s;
        int max = 1,index = 0;
        for (int i = 0;i<s.length();i++){
            int j = i+1;
            int k = i;
            int len = 0;
            while (k >= 0 && j < s.length()){
                if (s.charAt(k) == s.charAt(j)){
                    len += 2;
                }
                else break;
                k--;
                j++;
            }
            if (max < len){
                max = len;
                index = i;
            }
            j = i+1;
            k = i-1;
            len = 1;
            while (k >= 0 && j < s.length()){
                if (s.charAt(k) == s.charAt(j)){
                    len += 2;
                }
                else break;
                k--;
                j++;
            }
            if (max < len){
                max = len;
                index = i;
            }
        }
        return s.substring(index-(max-1)/2,index+max/2+1);
    }

    @Test
    public void test(){
        String s = longestPalindrome("ababc");
        System.out.println(s);
    }

}
