package com.tree;


public class P337Solution {
    public int rob(TreeNode root) {
        if (null == root)return 0;
        int l=0;
        int r = 0;
        if (null != root.left)l=rob(root.left.left)+rob(root.left.right);
        if (null != root.right)r = rob(root.right.left)+rob(root.right.right);
        int num = l+r;
        return Math.max(rob(root.left)+rob(root.right),root.val+num);
    }
}
