/*
Problem: 232. Implement Queue using Stacks
Platform: LeetCode
Difficulty: Easy
Pattern: Stack Simulation

Time Complexity:
push → O(1)
pop → Amortized O(1)

Space Complexity: O(n)
*/

import java.util.Stack;

class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {

        peek(); // ensure output stack has elements
        return output.pop();
    }

    public int peek() {

        if(output.isEmpty()) {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
