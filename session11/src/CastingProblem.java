
public class CastingProblem {
	static class Elephant {
	}
	public static void main(String[] args) {
		Object[] x = { 5, "abc", new Elephant() };
		for (Object o : x) {
			System.out.println(o);
		}
		
		Object[] y = { 1, 2, 3, new Elephant()};
		int sum = 0; 
		for (int i  = 0; i < y.length; i++) {
			sum += (Integer)y[i];
		}

		Integer[] z = { 1, 2, 3};
		int sum2 = 0; 
		for (int i  = 0; i < z.length; i++) {
			sum2 += z[i];
		}

		for (int i : z) {
			sum2 += i;
		}

	
	}
}
