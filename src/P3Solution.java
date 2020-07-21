import org.junit.Test;

public class P3Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sub = new StringBuilder();
        int n = 0;
        for (int i = 0;i < s.length();i ++){
            if (sub.toString().contains(s.substring(i,i+1))) {
                int index = sub.indexOf(s.substring(i,i+1));
                n = Math.max(sub.length(),n);
                sub = new StringBuilder(sub.substring(index + 1));
            }
            sub.append(s.substring(i, i + 1));
        }
        return Math.max(n,sub.length());
    }

    @Test
    public void test(){
        String s = "abdcabca";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
