package com.learning.core.day5session1;

class CircularQueueArray {
	private int size = 1000;
	private int front, rear;
	private int[] queueArray = new int[size];

	CircularQueueArray() {
		front = rear = -1;
	}

	boolean isEmpty() {
		return (front == -1 && rear == -1);
	}

	boolean isFull() {
		return ((rear + 1) % size == front);
	}

	boolean enqueue(int x) {
		if (isFull()) {
			System.out.println("Queue Overflow");
			return false;
		} else if (isEmpty()) {
			front = rear = 0;
		} else {
			rear = (rear + 1) % size;
		}
		queueArray[rear] = x;
		return true;
	}

	int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		} else if (front == rear) {
			int x = queueArray[front];
			front = rear = -1;
			return x;
		} else {
			int x = queueArray[front];
			front = (front + 1) % size;
			return x;
		}
	}

	void printQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		int i = front;
		while (i != rear) {
			System.out.print(queueArray[i] + " ");
			i = (i + 1) % size;
		}
		System.out.println(queueArray[rear]);
	}
}

public class D05P09F {
	public static void main(String[] args) {
		CircularQueueArray queue = new CircularQueueArray();
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(32);
		queue.enqueue(22);
		System.out.println("After Adding elements in the Queue:");
		queue.printQueue();

		queue.dequeue();
		System.out.print("After removing first element: ");
		queue.printQueue();
	}
}
