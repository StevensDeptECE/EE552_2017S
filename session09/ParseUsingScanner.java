import java.util.*;

public class ParseUsingScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		double[][] m = new double[rows][cols];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				m[i][j] = s.nextDouble();


		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				System.out.print(m[i][j] + "\t");
			System.out.println();
		}

	}


}
