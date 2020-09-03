package com.shopee2;

import java.util.*;

public class test2 {
    public static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        List<Integer> item = new ArrayList<>();
        pre(result,n,m,item,sum);
        int[][] ans = new int[result.size()][];
        for (int k = 0;k<result.size();k++){
            int[] t = new int[result.get(k).size()];
            for (int i = 0;i<result.get(k).size();i++){
                t[i] = result.get(k).get(i);
            }
            Arrays.sort(t);
            ans[k] = t;
        }
        Arrays.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i <ans.length ; i++) {
            int[] c = ans[i];
            for (int j = 0; j <c.length ; j++) {
                System.out.print(c[j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    private static void pre(List<List<Integer>> r,int n,int m,List<Integer> item,int sum){

        if (sum == m){
            r.add(new ArrayList<>(item));
            return;
        }
        if (n < 1)return;
        if (n <= m-sum){
            item.add(n);
            pre(r,n-1,m,item,sum+n);
            item.remove(item.size()-1);
            pre(r,n-1,m,item,sum);
        }
        else {
            pre(r,n-1,m,item,sum);
        }
    }
}
