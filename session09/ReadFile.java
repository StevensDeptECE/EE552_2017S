import java.io.*;

public class ReadFile {
	public static void main(String[] args) {
		FileInputStream ifs = null;
		try {
			ifs = new FileInputStream(args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ifs != null)
				try {
					ifs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
