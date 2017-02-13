
public class Question {
	void f() {
		
		
	}
	
	static void g() {
		
	}
	
	void h(int x) {
	}
	static void h(int x, int y) {}
	
	public static void main(String[] args) {
		Question q = new Question();
		q.f();
		g();
		
		q.h(1);
		h(1,2);
	}
}
