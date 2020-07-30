import org.junit.Test;

import java.util.Arrays;

public class P338Solution {
    public int[] countBits(int num) {
        if (0 == num)return new int[]{0};
        if (1 == num)return new int[]{0,1};
        int[] ans = new int[]{0,1};
        for (int i = 2;i < num * 2;i *= 2){
            int[] t = new int[ans.length*2];
            for (int j = 0;j<ans.length;j++){
                t[j] = ans[j];
                t[j+ans.length] = ans[j] + 1;
            }
            ans = t;
        }
        return Arrays.copyOf(ans,num+1);
    }

    @Test
    public void test(){
        System.out.println(Arrays.toString(countBits(8)));
    }

}
