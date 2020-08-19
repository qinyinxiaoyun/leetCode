package com.shopee;

public class test3 {
    public String addStrings (String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int a = num1.length();
        int b = num2.length();
        int token = 0;
        for (;a>0&&b>0;a--,b--){
            char c1 = num1.charAt(a-1);
            char c2 = num2.charAt(b-1);
            int a1 = c1-'0';
            int a2 = c2-'0';
            int sum = (a1 + a2 + token)%10;
            token = (a1 + a2 + token)/10;
            ans.append(sum);
        }
        while (a > 0){
            char c1 = num1.charAt(a-1);
            int a1 = c1-'0';
            int sum = (a1 + token)%10;
            token = (a1 + token)/10;
            ans.append(sum);
            a--;
        }
        while (b > 0){
            char c2 = num2.charAt(b-1);
            int a2 = c2-'0';
            int sum = (a2 + token)%10;
            token = (a2 + token)/10;
            ans.append(sum);
            b--;
        }
        if (a == 0&& b==0&&token==1)ans.append(token);
        ans.reverse();
        String t = ans.toString();
        return t;
    }
}
