public interface class A {
	public void f();
}

public abstract class B implements A {
  private int x;
	public B(int x) { this.x = x; }
	public String toString() { // B x=___
		return "B x=" + x;
	}
}
public interface E {
	public void g();
}

public class C extends B {
	private int y;
  public C(int x, int y) {
		super(x);
		this.y = y;
  }
	public void f() { ... }
}

public abstract class F implements E, A {
	public void g() { System.out.println(); }
}


public class Test {
	public static void main(String[] args) {
		C c1 = new C(5,4);
	}
}
