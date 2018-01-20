package com.chandrakanth.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsClass {

	public CollectionsClass() {
		super();
	}

	static {

		System.out.println(
				"This class is primarily developed for basic understanding " + "of Collections and their uses");
	}

	@SuppressWarnings("unchecked")

	public static <K,V,E> void main(String[] args) {

		// HashSet manipulation
		Set<E> hashSet = new HashSet<E>();

		hashSet.add((E) Arrays.asList(1, 2, null));
		hashSet.add((E) Arrays.asList("abc", "def"));

		System.out.println("\n" + hashSet);

		// LinkedHashSet Implementation

		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();

		// TreeSet Manipulation
		System.out.println("\nSortedSet - TreeSet Manipulation");
		SortedSet<E> sortedSet = new TreeSet<E>();

		sortedSet.addAll((Collection<? extends E>) Arrays.asList("abc", "ghi", "def"));
		System.out.println(sortedSet.headSet((E) "def"));
		System.out.println(sortedSet);

		
		NavigableSet<Integer> navigSet = new TreeSet<>();
		navigSet.add(2);
		navigSet.add(0);
		navigSet.add(7);

		System.out.println("\n Elements in NavigSet" + navigSet);
		System.out.println(
				"\nNavigable Set Implementation\nCeiling - Returning least element greater than the given element in the ceiling method: \t"
						+ navigSet.ceiling(4)
						+ "\nFloor - Returning greatest element less than or equal to element specified in Floor method:\t"
						+ navigSet.floor(7));
		System.out.println("\n" + navigSet.pollFirst());
		System.out.println(navigSet.descendingSet());

		// List Manipulation
		List<E> list = new ArrayList<E>();

		list.add((E) Arrays.asList(1, 2, null));
		list.add((E) Arrays.asList("a", "b", "c"));

		// ListIterator Manipulation
		ListIterator<E> lItr = list.listIterator();

		System.out.println("\nList Iterator Iteration - Forward");

		while (lItr.hasNext()) {
			System.out.println(lItr.next());
		}

		// List Iterator - to traverse in the reverse direction in the list
		System.out.println("\nList Iterator Iteration - Reverse");

		while (lItr.hasPrevious()) {
			System.out.println(lItr.previous());
		}

		// LinkedList Implementation
		LinkedList<E> linkedList = new LinkedList<E>();

		System.out.println("\nLinkedList Manipulation");

		linkedList.addFirst((E) "add the elemenent");
		linkedList.addFirst((E) "abc");

		linkedList.addLast((E) "element at the last");
		linkedList.add((E) "fkasdkfjdkf");

		System.out.println(linkedList);

		Vector<E> vector = new Vector<E>();
		vector.add((E) "Vector Element 1");
		vector.addElement((E) "Vector Element 2");

		// Stack - LIFO
		System.out.println("\n Stack Implementation");
		Stack<E> stack = new Stack<E>();

		stack.push((E) "abc");
		stack.push((E) "def");

		System.out.println("\n Looking top most object in stack\t" + stack.peek());
		System.out.println(stack);
		System.out.println("\nPop operation\t" + stack.pop());

		System.out.println("\nQueue Manipulation - FIFO");

		Queue<E> queue = new LinkedList<>();

		queue.add((E) "queue element 1");
		queue.offer((E) "Queue Element 2");
		System.out.println(queue);
		System.out.println(queue.poll() + "\nRest of the queue after removal of element" + queue);

		Deque<E> deQue = new LinkedList<E>();

		deQue.add((E) "Doble Ended Queue - Element 1 added");
		deQue.addFirst((E) "Double Ended Queue - Element 2 added");
		deQue.push((E) "DOuble Ended Queue - First element pushed");

		System.out.println(deQue);

		PriorityQueue<E> priorityQue = new PriorityQueue<E>();

		System.out.println("\nPriority Queue - Manipulation");
		priorityQue.add((E) "priorityQue element 1");

		System.out.println(queue.peek());
		
		Map<K,V> map = new HashMap<K,V>();
		

	}
}
