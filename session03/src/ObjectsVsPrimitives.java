
public class ObjectsVsPrimitives {
	public static void main(String[] args) {
		int a = 5;
		long b = 12512915219591159L;
		float c = 1.5f;
		double d = 2.5;
		boolean f = false;
		f = true;
		
		Object obj = new Object();
		int a2 = a; // make a copy
		
		a = 3;
		
		Object obj2 = obj; // DOES NOT MAKE A COPY
		
		// obj2 and obj are THE SAME OBJECT
		
		
		String s = "abc";
		String s2 = s;
		System.out.println(s);
		s = s + "def";
		System.out.println(s);		
		System.out.println(s2);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		int[] arr2 = arr;
		arr2[0] = 11;
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
