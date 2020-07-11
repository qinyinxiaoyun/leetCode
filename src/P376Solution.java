public class P376Solution {
    public int wiggleMaxLength(int[] nums) {
        int status = 0;
        int result = 1;
        if (nums.length < 2)return nums.length;
        for (int i = 1;i < nums.length;i +=1){
            switch (status){
                case 0:
                    if (nums[i] > nums[i - 1]){
                        status = 1;
                        result += 1;
                    }
                    if (nums[i] < nums[i - 1]){
                        status = -1;
                        result += 1;
                    }
                    break;
                case 1:
                    if (nums[i] < nums[i - 1]){
                        status = -1;
                        result += 1;
                    }
                    break;
                case -1:
                    if (nums[i] > nums[i - 1]){
                        status = 1;
                        result += 1;
                    }
                    break;
            }
        }
        return result;
    }
}
