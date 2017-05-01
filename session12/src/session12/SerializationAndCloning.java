package session12;

import java.io.*;
import java.util.zip.*;

public class SerializationAndCloning {
	public static void main(String[] args) throws Exception {
//		ObjectOutputStream oos = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("test.dat.gz")));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.dat"));
		B b1 = new B(3,4,5);
		oos.writeObject(b1);
		oos.close();
	}
}

class A implements Serializable {
	private int x,y;
	public A(int x, int y) {
		this.x = x; this.y = y;
	}
}

class B extends A implements Serializable {
	private int z;
	public B(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
}

