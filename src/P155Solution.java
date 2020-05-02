import java.util.Stack;

import static java.lang.Integer.min;

public class P155Solution {
    class MinStack{
        Stack<Integer> data = new Stack<Integer>();
        Stack<Integer> minStack= new Stack<Integer>();
        int m;
        public MinStack(){}
        public void push(int x){
            if (data.empty()){
                m = x;
                data.push(x);
                minStack.push(x);
            }
            else {
                m = min(minStack.peek(), x);
                data.push(x);
                minStack.push(m);
            }
        }
        public void pop(){
            data.pop();
            minStack.pop();
        }
        public int top(){
            return data.peek();
        }
        public int getMin(){
            return minStack.peek();
        }
    }
}
