package com.xhs;

import java.util.Arrays;
import java.util.Comparator;

public class test2 {
    static int maxBoxes(int[][] boxes) {
        if (0 == boxes.length)return 0;
        if (1 == boxes.length)return 1;
        Arrays.sort(boxes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int a = 0;
        int[] c = new int[boxes.length];
        for (int i = 1;i < boxes.length;i++){

            for (int j = 0;j<i;j++){
                if (boxes[i][1] > boxes[j][1] && boxes[i][0] > boxes[j][0]){
                    c[i] = Math.max(c[i],c[j]+1);
                }
            }
        }
        for (int t:c){
            a = Math.max(a,t);
        }
        return a+1;
    }
}
