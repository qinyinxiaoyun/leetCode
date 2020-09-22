package com.baidu;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        LinkedList<Integer>[] q = new LinkedList[n];
        Set<Integer>[] sets = new HashSet[n];
        for (int i = 0; i < n; i++) {
            q[i] = new LinkedList<>();
            q[i].add(i);
            sets[i].add(i);
        }
        in.nextLine();
        for (int i = 0; i < m; i++) {
            String s = in.nextLine();
            String[] t = s.split(" ");
            int a = Integer.parseInt(t[1]);
            int b = Integer.parseInt(t[2]);
            if (t[0].charAt(0) == 'C') {
                q[b - 1].addAll(q[a - 1]);
                sets[b-1].addAll(sets[a-1]);
                sets[a-1].clear();
            }
            if (t[0].charAt(0) == 'Q'){
                int f = 0;
                for (int h = 0;h<sets.length;h++){
                    if (sets[h].contains(a) && sets[h].contains(b)){
                        f = 1;
                        int o=0,p=0;
                        for (int j = 0; j < q[h].size(); j++) {
                            if (q[h].get(j) == a)o=j;
                            if (q[h].get(j)==b)p=j;
                        }
                        System.out.println(Math.abs(o-p));
                        break;
                    }
                }
                if (f==0) System.out.println(-1);
            }
        }
    }
}
