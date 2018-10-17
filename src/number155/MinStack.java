package number155;

import java.util.Stack;

public class MinStack {
    /**
     * initialize your data structure here.
     */

    public static void main(String[] args){
        MinStack stack1 = new MinStack();
        stack1.push(0);
        stack1.push(1);
        stack1.push(0);
        System.out.println(stack1.getMin());
        stack1.pop();
        System.out.println(stack1.getMin());
    }

    Stack<Integer> stack;
    Stack<Integer> stackMin;

    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (stackMin.empty() || stackMin.peek() >= x) {
            stackMin.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x == stackMin.peek()) {
            stackMin.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}
