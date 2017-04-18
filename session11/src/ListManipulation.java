import java.util.*;

public class ListManipulation {

	public static void main(String[] args) {
		final int n = 10;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i);
		ListIterator<Integer> first = list.listIterator();
		first.add(-1);
/*
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i));
*/
		for (ListIterator<Integer> i = list.listIterator(); i.hasNext(); ) {
			if (i.next() == 7)
				i.add(8);
		}

		
		for (ListIterator<Integer> i = list.listIterator(); i.hasNext(); ) {
			System.out.print(i.next() + " ");
		}
		
		
		ArrayList<Character> letters = new ArrayList<Character>();
		for (int i = 0; i < 26; i++)
			letters.add((char)('A' + i));
		ListIterator<Character> pick =  letters.listIterator(10);
		pick.add('X');
		System.out.println();
		for (int i = 0; i < letters.size(); i++)
			System.out.print(letters.get(i) + " ");
		System.out.println();
		
		letters.listIterator(0).add('Q');
		for (Character c : letters) {
			System.out.print(c + " ");			
		}
		System.out.println();
		
		
	}
}
