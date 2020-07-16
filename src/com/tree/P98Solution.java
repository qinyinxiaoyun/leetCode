package com.tree;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class P98Solution {
    public boolean isValidBST(TreeNode root) {
        return isBST(root);
    }

    private boolean isBST(TreeNode root){
        if (root == null)return true;
        if (root.left != null){
            for (int i:nums(root.left)){
                if (i >= root.val)return false;
            }
        }
        if (root.right != null){
            for (int i:nums(root.right)){
                if (i <= root.val)return false;
            }
        }
        return isBST(root.left)&&isBST(root.right);
    }

    private ArrayList<Integer> nums(TreeNode root){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root != null){
            arrayList.add(root.val);
            arrayList.addAll(nums(root.left));
            arrayList.addAll(nums(root.right));
        }
        return arrayList;
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
  @Test
    public void test(){
        TreeNode t = new TreeNode(5,new TreeNode(1,null,null),new TreeNode(4,new TreeNode(3),new TreeNode(6)));
        System.out.println(isValidBST(t));
  }
}
