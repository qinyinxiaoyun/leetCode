public class P42Solution {
    public int trap(int[] height) {
        int l = 0,r = height.length - 1;
        int lm = 0,rm = 0,res = 0;
        while (l <= r){
            if (height[l] < height[r]){
                if (height[l] > lm)lm = height[l];
                else res += (lm - height[l]);
                l++;
            }
            else {
                if (height[r] > rm)rm = height[r];
                else res += (rm - height[r]);
                r--;
            }
        }
        return res;
    }
}
