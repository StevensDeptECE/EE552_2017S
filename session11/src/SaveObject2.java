import java.io.*;
import java.util.zip.GZIPOutputStream;

public class SaveObject2 {
	public static void main(String[] args) throws Exception {
		SerialVector v = new SerialVector(0,0,0);
		ObjectOutputStream oos = new ObjectOutputStream(
				new GZIPOutputStream(new FileOutputStream("vector.ser")));
		oos.writeObject(v);
		SerialVector arrayv[] = new SerialVector[100];
		for (int i = 0; i < arrayv.length; i++)
			arrayv[i] = new SerialVector(1,2,3);
		oos.writeObject(arrayv);
		oos.close();
		
	}
}
