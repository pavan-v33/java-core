package com.learning.core.day5session1;

class StackArray {
	private int top;
	private final int capacity;
	private String[] stackArray;

	StackArray(int capacity) {
		this.capacity = capacity;
		stackArray = new String[capacity];
		top = -1;
	}

	boolean isEmpty() {
		return (top < 0);
	}

	boolean push(String x) {
		if (top >= (capacity - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			stackArray[++top] = x;
			System.out.println("Element pushed: " + x);
			return true;
		}
	}

	String pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			String x = stackArray[top--];
			return x;
		}
	}

	void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}
}

public class D05P09A {
	public static void main(String[] args) {
		StackArray stack = new StackArray(1000);
		stack.push("Hello");
		stack.push("world");
		stack.push("java");
		stack.push("programming");

		System.out.println("After Pushing The Elements in The Stack:");
		stack.printStack();
		stack.pop();

		System.out.println("After a Pop:");
		stack.printStack();
	}
}
