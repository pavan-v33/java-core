package com.learning.core.day5session1;

class Node2 {
	int data;
	Node2 next;

	Node2(int d) {
		data = d;
		next = null;
	}
}

class QueueLinkedList {
	private Node2 front, rear;

	QueueLinkedList() {
		front = rear = null;
	}

	boolean isEmpty() {
		return (front == null);
	}

	void enqueue(int x) {
		Node2 newNode = new Node2(x);
		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		int x = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		return x;
	}

	void printQueue() {
		Node2 temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class D05P09E {
	public static void main(String[] args) {
		QueueLinkedList queue = new QueueLinkedList();
		queue.enqueue(89);
		queue.enqueue(99);
		queue.enqueue(109);
		queue.enqueue(209);
		queue.enqueue(309);

		System.out.print("Elements in queue: ");
		queue.printQueue();

		queue.dequeue();
		queue.dequeue();
		System.out.print("After removing two elements: ");
		queue.printQueue();
	}
}
