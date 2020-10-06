package com.math;

import java.util.Stack;

/**
 * Implement a basic calculator to evaluate a simple expression string.
 *
 * The expression string may contain open ( and closing parentheses ),
 * the plus + or minus sign -, non-negative integers and empty spaces .
 * Input: "(1+(4+5+2)-3)+(6+8)"
 * Output: 23
 */
public class P224Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int result = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))num = num*10 + (c-'0');
            if (c=='+'){
                result = result + sign*num;
                sign = 1;
                num = 0;
            }
            if (c=='-'){
                result = result + sign*num;
                sign = -1;
                num = 0;
            }
            if (c=='('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            if (c==')'){
                result = result + sign*num;
                num = 0;
                sign = stack.pop();
                int t = stack.pop();
                result = t + sign*result;
            }
        }
        result = result + sign*num;
        return result;
    }
}
