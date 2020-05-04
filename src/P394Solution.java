import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

//Given an encoded string, return its decoded string.
//
//        The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being
//        repeated exactly k times. Note that k is guaranteed to be a positive integer.
public class P394Solution {
    public String decodeString(String s){
        Stack<Integer> num = new Stack<>();
        Stack<Character> chars = new Stack<>();
        Stack<Character> tmp = new Stack<>();
        ArrayList<Character> list = new ArrayList<>();
        String result = "";
        for (int i = 0;i < s.length();i += 1){
            char c = s.charAt(i);
            if (c >= '0'&&c <='9'){
                int a = 0;
                int t = i;
                for (;s.charAt(t)>='0'&&s.charAt(t)<='9';t+=1){
                    a = a * 10 + (s.charAt(t) - '0');
                }
                i = t - 1;
                num.add(a);
            }
            else if (c == '[' || (c >='a'&&c<='z') || (c >='A'&&c<='Z')){
                chars.add(c);
            }
            else if (c == ']'){
                while (chars.peek() != '['){
                    tmp.add(chars.peek());
                    chars.pop();
                }
                chars.pop();
                while (!tmp.empty()){
                    list.add(tmp.pop());
                }
                for (int j = 0;j < num.peek();j += 1){
                    for (int k = 0;k < list.size();k+=1){
                        chars.add(list.get(k));
                    }
                }
                num.pop();
                list.clear();
            }
        }
        tmp.clear();
        while (!chars.empty()){
            tmp.add(chars.pop());
        }
        while (!tmp.empty()){
            result += tmp.pop();
        }
        return result;
    }
    @Test
    public void test(){
        String s = "10[a]";
        String a = decodeString(s);
        System.out.println(a);
    }
}
