package com.learning.core.day5session1;

class QueueArray {
	private int front, rear;
	private int size = 10;
	private int[] queueArray;

	QueueArray() {
		front = rear = -1;
		queueArray = new int[size];
	}

	boolean isEmpty() {
		return (front == -1 && rear == -1);
	}

	boolean isFull() {
		return (rear == queueArray.length - 1);
	}

	boolean enqueue(int x) {
		if (isFull()) {
			resize();
		}
		if (isEmpty()) {
			front = rear = 0;
		} else {
			rear++;
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
			return queueArray[front++];
		}
	}

	void printQueue() {
		for (int i = front; i <= rear; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.println();
	}

	private void resize() {
		int newCapacity = queueArray.length * 2;
		int[] newArray = new int[newCapacity];
		System.arraycopy(queueArray, 0, newArray, 0, queueArray.length);
		queueArray = newArray;
	}
}

public class D05P09D {
	public static void main(String[] args) {
		QueueArray queue = new QueueArray();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		System.out.println("After Enqueue: ");
		queue.printQueue();

		queue.dequeue();
		System.out.println("After removing first element: ");
		queue.printQueue();
	}
}
