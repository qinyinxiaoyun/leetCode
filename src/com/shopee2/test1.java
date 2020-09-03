package com.shopee2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        while (in.hasNextInt()){
            a.add(in.nextInt());
        }
        if (a.isEmpty()){
            System.out.println();
            return;
        }
        int[] s = new int[a.size()];
        for (int i = 0; i <a.size() ; i++) {
            s[i] = a.get(i);
        }
        treeNode t = new treeNode(s[0]);
        treeNode root = t;
        for (int j = 1;j<a.size();j++){
            while (t != null){
                if (s[j] < t.val)t = t.left;
                else t = t.right;
            }
            t = new treeNode(s[j]);
            t = root;
        }
        t = root;
        while (t != null){

        }
        Arrays.sort(s);
        for (int i:s) {
            System.out.print(i);
            System.out.print(' ');
        }
    }

}
class treeNode{
    treeNode left;
    treeNode right;
    int val;
    treeNode(int a){
        val = a;
    }
}
