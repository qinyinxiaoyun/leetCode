package com.sougou;

public class test1 {
    public int numberofprize (int a, int b, int c) {
        int d = Math.min(a,b);
        int ms = Math.min(d,c);
        d = Math.max(a,b);
        int md = Math.max(d,c);
        int mm = a+b+c-ms-md;
        int i = mm-ms;
        int j = md-ms;
        int ans;
        if (j >= 3*i)ans = ms+i+(j-3*i)/5;
        else ans=ms+(i+j)/4;
        return ans;
    }
}
