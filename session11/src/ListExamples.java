import java.util.*;

public class ListExamples {
	public static void buildArrayList1(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i);  // autoboxing
	}
	public static void buildArrayList2(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++)
			list.add(i);  // autoboxing
	}

	// BAD IDEA! DO NOT DO THIS!
	// adding to the end of a linked list is O(n^2)
	public static void buildLinkedList1(int n) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i);  // autoboxing
	}

	public static void buildLinkedList2(int n) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> it = list.listIterator();
		for (int i = 0; i < n; i++) {
			it.add(i);
			it.next();
		}
	}

	public static void testIteration(int n) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i);

		for (ListIterator<Integer> it = list.listIterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}

	
	public static void main(String[] args) {
		final int n = 2000000;
		for (int i = 0; i < 10; i++)
			buildLinkedList1(10000);
		
//		long t0 = System.currentTimeMillis();
		long t0 = System.nanoTime();
		buildLinkedList1(n);
//		long t1 = System.currentTimeMillis();
		long t1 = System.nanoTime();
		System.out.println((t1-t0) / 1000.0);

		testIteration(1000);
	}
}
