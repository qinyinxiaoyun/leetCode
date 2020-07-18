package com.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P230Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        ArrayList<Integer> nums = new ArrayList<>();
        num(root,nums);
        for (int i=0;i<nums.size();i++){
            if (i<k)queue.add(nums.get(i));
            else {
                if (nums.get(i)<queue.peek()){
                    queue.poll();
                    queue.add(nums.get(i));
                }
            }
        }
        return queue.peek();
    }
    private void num(TreeNode t,ArrayList<Integer> nums){
        if (t != null){
            nums.add(t.val);
            num(t.left,nums);
            num(t.right,nums);
        }
    }
}
