
public class D implements A {
	private int x,y; // zero by default
	public D(int a, int b) { x = a; y = b; }
	public void f() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		B b1;
		A a1;
		A a2 = new A();
		B b2 = new B();
		D c1 = new D(1,2);
		System.out.println(c1.x);
	}
}
