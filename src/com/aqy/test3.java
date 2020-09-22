package com.aqy;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] a = s.split(" ");
        int n = a.length;
        int[] t = new int[n];
        for (int i = 0; i <n ; i++) {
            t[i] = Integer.parseInt(a[i]);
        }

        Arrays.sort(t);
        ArrayList<int[]> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = n-1; i >=0 ; i--) {
            map.put(-t[i],i);
        }
        for (int i = 0; i <n ; i++) {
            if (i!= 0 && t[i]==t[i-1])continue;
            for (int j = i+1; j <n ; j++) {
                if (t[j] == t[j-1] && j!= i+1)continue;
                if (map.containsKey(t[i] + t[j])){
                    int k = map.get(t[i]+t[j]);
                    if (k < i) ans.add(new int[]{t[k], t[i], t[j]});
//                    if (k!=i && k!=j) {
//                        if (k < i) ans.add(new int[]{t[k], t[i], t[j]});
//                        else if (k > j) ans.add(new int[]{t[i], t[j], t[k]});
//                        else ans.add(new int[]{t[i], t[k], t[j]});
//                    }
                }
            }
        }
        int[][] re = ans.toArray(new int[ans.size()][]);
        Arrays.sort(re, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0])return o1[0] - o2[0];
                else if (o1[1] != o2[1])return o1[1] - o2[1];
                else return o1[2] - o2[2];
            }
        });
        for (int[] item:re){
            for (int i :item){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
