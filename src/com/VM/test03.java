package com.VM;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += in.nextInt();
        }
        while (in.hasNextInt()){
            s += in.nextInt();
        }
        if (s % m == 0) System.out.println(s/m);
        else System.out.println(s/m + 1);
    }
}
