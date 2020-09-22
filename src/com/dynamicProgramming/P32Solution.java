package com.dynamicProgramming;

/**
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 * Input: ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()"
 */
public class P32Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        if (n==0 || n==1)return 0;
        int[] a = new int[n];
        int m = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')' && i-1-a[i-1] >=0 && s.charAt(i-1-a[i-1])=='('){
                if (i - 2 - a[i-1] >= 0){
                    a[i] = 2 + a[i-1] + a[i-2-a[i-1]];
                }
                else a[i] = 2 + a[i-1];
            }
            m = Math.max(m,a[i]);
        }
        return m;
    }
}
