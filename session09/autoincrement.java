public class autoincrement {
	public static void main(String[] args) {
		int x = 0;
		x = x + 1;
		System.out.println(x);
		x += 1;
		System.out.println(x);
		x++;
		System.out.println(x); // x = 3
		++x;
		System.out.println(x); // x = 4

		int y = x++; // y = 4 (copy x) and THEN x = 5
		int z = ++x; // x = 6, THEN z = x (6)
	}
}





		

	}
}
