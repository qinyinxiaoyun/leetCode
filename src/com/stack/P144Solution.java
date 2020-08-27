package com.stack;

import com.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P144Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()){
            TreeNode t = stack.pop();
            if (t!=null){
                ans.add(t.val);
                stack.push(t.right);
                stack.push(t.left);
            }
        }
        return ans;
    }
}
