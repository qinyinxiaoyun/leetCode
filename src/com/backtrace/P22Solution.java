package com.backtrace;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P22Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        getResult(n,n,result,"");
        return result;
    }

    private void getResult(int lm,int rm,ArrayList<String> result,String temp){
        if (lm == 0){
            if (rm == 0)result.add(new String(temp));
            else {
                temp += ')';
                getResult(lm,rm - 1,result,temp);
            }
        }
        else {
            getResult(lm - 1,rm,result,temp+'(');
            if (lm < rm)getResult(lm,rm - 1,result,temp+')');
        }
    }

    @Test
    public void test(){
        List<String> ans = generateParenthesis(3);
        System.out.println(ans);
    }

}
