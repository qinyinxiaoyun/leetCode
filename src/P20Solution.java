import org.junit.Test;

import java.util.Stack;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Note that an empty string is also considered valid.
public class P20Solution {
    public boolean isValid(String s){
        Stack<Character> test = new Stack<Character>();
        for (int i = 0; i < s.length(); i += 1){
            char a = s.charAt(i);
            test.push(a);
            if (i+1==s.length()){
                return false;
            }
            while ((test.peek() == '(' && s.charAt(i + 1)==')') || (test.peek()=='['&&s.charAt(i+1)==']')||(test.peek()=='{'&&s.charAt(i+1)=='}')){
                test.pop();
                i += 1;
                if (test.empty()){
                    break;
                }
                if (i+1==s.length()){
                    return false;
                }
            }
        }
        if (test.empty()){
            return true;
        }
        else {
            return false;
        }
    }
    @Test
    public void testcase(){
        String s = "()";
        isValid(s);
    }
}
