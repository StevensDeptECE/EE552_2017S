
public class C implements A {
	private int x,y; // zero by default
// default constructor is automatically written	public C() {}
	public void f() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		B b1;
		A a1;
		A a2 = new A();
		B b2 = new B();
		C c1 = new C();
		System.out.println(c1.x);
	}
}
