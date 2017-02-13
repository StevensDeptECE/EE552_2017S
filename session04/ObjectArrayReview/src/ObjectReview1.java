
public class ObjectReview1 {
	public static void main(String[] args) {
		Object obj = null;
		obj = new Object();
		System.out.println(obj);
		int x = 5;
		int y = x; // make a copy
		Object obj2 = obj; // both point to the SAME OBJECT
		System.out.println(obj2);
		
		int[] a = {5, 4, 3};
		int[] b = new int[10]; // what are the values? 0, 0, 0
//		char c; // letter whose code = 0
		
		int[] d = a;
		System.out.println(d[0]); // 5
		d[0] = 19;
		System.out.println(a[0]); // 19 (d is NOT a copy of a, points at same object)
	}
}
