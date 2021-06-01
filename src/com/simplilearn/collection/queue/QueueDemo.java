package com.simplilearn.collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		// Queue is a data structure which works in first in first out order.
		// ArrayDeque : is a double ended queue.
		Queue<String> dqueu = new ArrayDeque<String>();
		dqueu.add("John");
		dqueu.add("Smith");
		dqueu.add("William");
		dqueu.add("Parul");
		dqueu.add("Jeet");
		dqueu.add("Alisha");

		// peek an element form head
		System.out.println("Head :-> " + dqueu.peek());
		System.out.println("Head :-> " + dqueu.element());

		// print and remove element from queue -> poll
		System.out.println("Head :-> " + dqueu.poll());

		// iterate over queue
		for (String element : dqueu) {
			System.out.println(element);
		}

		System.out.println("-----------------------");

		// PriorityQueue does not maintain any FIFO.
		
		PriorityQueue<String> bankQueue = new PriorityQueue<String>();
		bankQueue.add("John");
		bankQueue.add("Smith");
		bankQueue.add("William");
		bankQueue.add("Parul");
		bankQueue.add("Jeet");
		bankQueue.add("Mike");

		// iterate over queue
		for (String element : bankQueue) {
			System.out.println(element);
		}
	}

}
