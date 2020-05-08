public class P55Solution {
    public boolean canJump(int[] nums) {
        int maxNum = 0;
        for (int i = 0;i < nums.length;i += 1){
            if (maxNum < 0)return false;
            if (maxNum < nums[i]){
                maxNum = nums[i];
            }
            maxNum -= 1;
        }
        return true;
    }
}
