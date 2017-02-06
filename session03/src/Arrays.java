
public class Arrays {
	// print out every element in x separated by a space then one newline
	public static void print(int[] x) { // real name is Arrays.print
		// print out x
		
	}
	
	public static int sum(int[] a) {
		
		return 0;
	}

	public static double mean(int[] a) {
		
		return 0;
	}

	// multiply all the elements in a and return that value
	public static int prod(int[] a) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// ILLEGAL: int[] b = new int[50]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		print(a); // should print 1 2 3 4 5 6 7 8 9 10 (and go to next line)
		System.out.println(sum(a));
		System.out.println(prod(a));
		System.out.println(mean(a));
	}
}
