package com.nvdia;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] a = s.split(" ");
        if (a.length != 4) System.out.println("ERROR");
        ArrayList<Integer> list = new ArrayList<>();
        for (String i :a){
            char c = i.charAt(0);
            if (c>='2' && c<='9')list.add(c-'0');
            if (c=='1')list.add(10);
            if (c=='A')list.add(1);
            if (c=='j'){
                System.out.println("ERROR");
                return;
            }
            if (c=='J'&&i.length()==1)list.add(11);
            if (c=='J'&&i.length()!=1){
                System.out.println("ERROR");
                return;
            }
            if (c=='Q')list.add(12);
            if (c=='K')list.add(13);
        }
        String ans = "";
        ArrayList<Integer> item = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            
        }
        System.out.println("NONE");
    }
}
