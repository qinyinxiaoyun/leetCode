package com.stack;

import com.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P145Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> num = new Stack<>();
        Stack<TreeNode> trees = new Stack<>();
        trees.push(root);
        while (!trees.isEmpty()){
            TreeNode t = trees.pop();
            if (t!=null){
                num.push(t.val);
                trees.push(t.left);
                trees.push(t.right);
            }
        }
        while (!num.isEmpty()){
            ans.add(num.pop());
        }
        return ans;
    }
}
