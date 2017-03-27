import java.util.*;

public class ListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//		for (int i = 2; i <= 100; i++)
		//			numbers.add(new Integer(i));
		for (int i = 2; i <= 100; i++) // autoboxing
			numbers.add(i);

		int sum = 0;
		for (Integer x : numbers)
			sum = sum + x;
		System.out.println(sum);

		for (int i = 0; i < numbers.size(); ++i)
			numbers.set(i, numbers.get(i)+1);


		ArrayList<Vehicle> vehicles; // add any object that IS_A Vehicle (extends Vehicle)
		
		ArrayList genericlist; // anyone who IS_A Object (any class)

	}
}
