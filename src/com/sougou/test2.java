package com.sougou;

public class test2 {
    public int getHouses (int t, int[] xa) {
        int a = 2;
        for (int i = 0;i < xa.length-3;i+=2){
            if (xa[i+2] - xa[i] == (xa[i+1] + xa[i+3])/2 + t)a++;
            if (xa[i+2] - xa[i] > (xa[i+1] + xa[i+3])/2 + t)a += 2;
        }
        return a;
    }
}
