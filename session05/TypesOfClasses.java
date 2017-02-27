public class TypesOfClasses {
	public static void main(String[] args) {
		TypesOfClasses obj = new TypesOfClasses(); // instantiate the class to create an object
		//Shape s = new Shape(10,20); // abstract class -- can't instantiate
		Circle c = new Circle(100,200, 50); // circle must implement draw() or it is abstract also

		
	}
}

// abstract = you cannot create an object of this type
abstract class Shape {
	private double x,y;
	public Shape(double x, double y) { this.x = x; this.y = y; }
	public abstract void draw();
}

class Circle extends Shape { // Circle IS_A kind of Shape
	private double r;
	public Circle(double x, double y, double r) {

	}
	public void draw() {

	}
}
class Rect extends Shape {
	private double w,h;
	public Rect(double x, double y, double w, double h) {

	}
	public void draw() {

	}
}

interface Comm {
	public void send(bytes[] data);
	public void receive(bytes[] data);
}

class TCPIP implements Comm {
	public void send(bytes[] data) {


	}
	public void receive(bytes[] data) {

	}
}


class A extends B implements Runnable, Cloneable, Serializable {

}

//Beef, Chicken, Shrimp
//Mushu, Garlic
//class MushuBeef implement Beef, Mushu {















