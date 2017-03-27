import java.io.*;

public class ReadFile4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("matrix.dat"));
		String line;
		while ( (line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}

}
