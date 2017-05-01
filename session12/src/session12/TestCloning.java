package session12;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;

public class TestCloning {
	public static ArrayList<Sheep> deepCopy(ArrayList<Sheep> orig) throws CloneNotSupportedException {
		ArrayList<Sheep> copy = new ArrayList<Sheep>(orig.size());
		for (int i = 0; i < orig.size(); i++)
			copy.add(orig.get(i).clone());
		return copy;
	}
	public static void main(String[] args) throws Exception {
		Sheep s1 = new Sheep("Dolly");
		Sheep s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		s2.setName("Fred");
		System.out.println(s2);
		System.out.println(s1);
		Sheep s3 = s2.clone();
		s2.setName("Alice");
		System.out.println(s3);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
		list.set(0, 5);
		for (int x : list2)
			System.out.println(x);
		
		ArrayList<Sheep> list3 = new ArrayList<Sheep>();
		list3.add(new Sheep("A"));
		list3.add(new Sheep("B"));
		list3.add(new Sheep("C"));
		
		ArrayList<Sheep> list4 = (ArrayList<Sheep>)list3.clone();
		ArrayList<Sheep> list5 = deepCopy(list3);
		Sheep bah = list3.get(0);
		bah.setName("X");

		System.out.println("Shallow Copy");

		// list4 is a SHALLOW COPY of list3.  The list is copied, but not the objects
		for (Sheep s : list4) {
			System.out.println(s);
		}
		
		
		System.out.println("Deep Copy");
		// list5 is a DEEP (full) copy of list3.  The list is copied, but not the objects
		for (Sheep s : list5) {
			System.out.println(s);
		}
		
		
	}
}

class Sheep implements Cloneable {
	private String name;
	public Sheep(String n) { name = n; }
	public String toString() { return "I'm a sheep.  My name is " + name; }
	public void setName(String n) { name = n; }
	public Sheep clone() throws CloneNotSupportedException {
		return (Sheep)super.clone();
	}
}