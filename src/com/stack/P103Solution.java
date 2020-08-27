package com.stack;

import com.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P103Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> t = new ArrayList<>();
        t.add(root);
        int flag = 1;
        while (!t.isEmpty()){
            int n = t.size();
            List<Integer> item = new ArrayList<>();
            for (int i = 0;i<n;i++){
                TreeNode s = t.remove(0);
                if (s!=null){
                    item.add(s.val);
                    t.add(s.left);
                    t.add(s.right);
                }
            }
            if (flag==-1){
                List<Integer> temp = new ArrayList<>();
                for (int j = 0;j<item.size();j++){
                    temp.add(item.get(item.size()-1-j));
                }
                item = temp;
            }
            if (item.size()!=0)result.add(item);
            flag = -flag;
        }
        return result;
    }
}
