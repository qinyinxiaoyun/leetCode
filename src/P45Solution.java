public class P45Solution {
    public int jump(int[] nums) {
        int steps = 0;
        int maxIndex = 0;
        if (nums.length < 2)return 0;
        for (int i = 0;nums[maxIndex] < nums.length;i = maxIndex){
            while (i < nums[maxIndex]){
                if (i + nums[i] > nums[maxIndex]){

                }
            }
        }
        return steps + 1;
    }
}
