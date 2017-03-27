import java.io.*;

public class ReadFile3 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("matrix.dat");
		char[] array = new char[1024];
		while ( fr.read(array, 0, array.length) > 0) {
			System.out.print(array);
		}
		
		fr.close();
	}

}
