public class InverseSquares {
	public static int inverseSquare(long num, int i, long den, int n) {
		return inverseSquare(num * i*i + 1, i+1, den*i*i, n) +
			inverseSquare(num, i+1, den, n);
	}

	public static void main(String[]args ) {

			// 0/1  + 1/4
		System.out.println(inverseSquare(0, 2, 1, 80))
	}
