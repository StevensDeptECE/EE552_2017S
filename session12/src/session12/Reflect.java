package session12;
import java.lang.reflect.*;
import java.util.Scanner;

public class Reflect {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		try {
			Class c = Class.forName(name);
			Method[] methods = c.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println(m.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
