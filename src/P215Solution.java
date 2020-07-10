

import org.junit.Test;

import java.util.PriorityQueue;

public class P215Solution {
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> minK = new PriorityQueue<>(k);
        for (int i = 0;i < nums.length;i +=1){
            if (i + 1 <= k){
                minK.add(nums[i]);
            }
            else {
                if (nums[i] > minK.peek()){
                    minK.remove();
                    minK.add(nums[i]);
                }
            }
        }
        return minK.peek();
    }
    @Test
    public void test(){
        int[] al = new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest(al,2));
    }
}
