import java.io.*;
/*
 * J2EE
 * 
 * Java Beans (Generic objects that can be processed by other code)
 * RMI (Remote Method Invokation)
 * 	move objects from computer to computer
 *  call methods on objects on a remote computer
 *  CORBA
 *  
 *  The big problem that killed widespread use of RMI/CORBA "version control"
 */

public class LoadObject {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vector.ser"));
		Object obj = ois.readObject();
		SerialVector v = (SerialVector)obj;
		System.out.println(v);
		ois.close();
		
	}
}
