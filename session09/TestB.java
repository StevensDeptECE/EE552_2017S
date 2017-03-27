public abstract class A{
	protected int x;
	public abstract void f();
}

public class B extends A {
	public void f() { ... }
	public B(int x) {}
	public String toString() { // B x=5
		return "B x=" + x;
	}
}
public interface E {
	public void g();
}

public class C extends B implements E {
	public C(int x) { super(x); }
