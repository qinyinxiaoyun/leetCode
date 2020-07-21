package com.tree;

import org.junit.Test;

import java.util.*;

public class P297Solution {
    public String serialize(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        list.add(root);
        while (!list.isEmpty()){
            TreeNode item = list.getFirst();
            if (item != null){
                list.add(item.left);
                list.add(item.right);
                result.add(item.val);
            }
            else result.add(null);
            list.removeFirst();
        }
        String a = result.toString();
        return a;
    }

    public TreeNode deserialize(String data){
        List<String> result = Arrays.asList(data.substring(1,data.length()-1).split(","));

        TreeNode tree = new TreeNode();
        if (result.get(0).equals("null"))return null;
        else tree.val = Integer.parseInt(result.get(0));
        LinkedList<TreeNode> list = new LinkedList<>();
        tree.left = new TreeNode();
        tree.right = new TreeNode();
        list.add(tree.left);
        list.add(tree.right);
        for (int i = 1;i < result.size();i ++){
            TreeNode t = list.getFirst();
            if (result.get(i).equals("null"))t=null;
            else {
                t.val = Integer.parseInt(result.get(i));
                t.left = new TreeNode();
                t.right = new TreeNode();
                list.add(t.left);
                list.add(t.right);
            }
            list.removeFirst();
        }
        return tree;
    }

    @Test
    public void test(){
        String a = "[1,2,3,null,null,4,5]";
        TreeNode t = deserialize(a);
        String r = serialize(t);
        System.out.println(r);
    }
}
