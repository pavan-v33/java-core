package com.learning.core.day5session1;

class Node {
	double data;
	Node next;

	Node(double d) {
		data = d;
		next = null;
	}
}

class StackLinkedList {
	private Node top;

	StackLinkedList() {
		top = null;
	}

	void push(double d) {
		Node newNode = new Node(d);
		newNode.next = top;
		top = newNode;
	}

	double pop() {
		if (top == null) {
			System.out.println("Stack Underflow");
			return -1;
		}
		double d = top.data;
		top = top.next;
		return d;
	}

	void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}

public class D05P09B {
	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		stack.push(10.0);
		stack.push(20.0);
		stack.push(30.0);
		stack.push(40.0);

		System.out.println("The elements of the stack are: ");
		stack.printStack();

		stack.pop();
		stack.pop();

		System.out.println("After popping twice: ");
		stack.printStack();
	}
}
