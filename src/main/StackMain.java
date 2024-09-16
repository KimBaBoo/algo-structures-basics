package main;
import linkedList.MyStack;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("================= 첫 번째 출력 ==================");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("================= 두 번째 출력 ==================");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("Stack의 크기가 비었는거? : " + stack.empty());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Stack의 크기가 비었는거? : " + stack.empty());

        System.out.println(stack.pop());
    }
}
