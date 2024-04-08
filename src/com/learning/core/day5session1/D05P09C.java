package com.learning.core.day5session1;

import java.util.Stack;

public class D05P09C {
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char prevOperator = '+';
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if (!Character.isDigit(c) && c != ' ' || i == expression.length() - 1) {
                if (prevOperator == '+') {
                    stack.push(num);
                } else if (prevOperator == '-') {
                    stack.push(-num);
                } else if (prevOperator == '*') {
                    stack.push(stack.pop() * num);
                } else if (prevOperator == '/') {
                    stack.push(stack.pop() / num);
                }
                prevOperator = c;
                num = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}
