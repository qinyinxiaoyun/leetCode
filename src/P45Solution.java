import org.junit.Test;

public class P45Solution {
    public int jump(int[] nums) {
        int steps = 0;
        int maxIndex = nums[0];
        int mostMaxIndex = nums[0];
        if (nums.length < 2)return 0;
        for (int i = 0;i < nums.length;i = i + 1){
            if (i > maxIndex){
                steps += 1;
                maxIndex = mostMaxIndex;
            }
            if (i + nums[i] > mostMaxIndex){
                mostMaxIndex = i + nums[i];
            }
        }
        return steps + 1;
    }
    @Test
    public void test(){
        int[] nums = {2,3,1,1,4};
        int t = jump(nums);
        System.out.println(t);
    }
}
