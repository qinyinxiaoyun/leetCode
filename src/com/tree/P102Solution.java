package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P102Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (null == root)return result;
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> item = new ArrayList<>();
            int num = queue.size();
            for (int i = 0;i < num;i++){
                TreeNode t = queue.peek();
                item.add(t.val);
                queue.remove();
                if (t.left != null)queue.offer(t.left);
                if (t.right != null)queue.offer(t.right);
            }
            result.add(item);
        }
        return result;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
