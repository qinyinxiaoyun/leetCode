import org.junit.Test;

import java.util.Stack;

public class P402Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for (int i = 0;i < num.length();i += 1){
            while (s.size() > 0&&k > 0&&s.peek() > num.charAt(i)){
                s.pop();
                k -= 1;
            }
            if (s.size() != 0||num.charAt(i) != '0'){
                s.add(num.charAt(i));
            }
        }
        while (s.size() > 0&&k > 0){
            s.pop();
            k -= 1;
        }
        String result = "";

        while (s.size() != 0){
            result = s.peek().toString().concat(result);
            s.pop();
        }
        if (result == "")return "0";
        return result;
    }
    @Test
    public void test(){
        String s = "12352";
        String l = removeKdigits(s, 2);
        System.out.println(l);
    }
}
