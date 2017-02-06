
public class Fraction {
	private int num, den;
	
	// constructor (automatically called whenever new
	// initializes the object
	public Fraction(int n, int d) {
		num = n; den = d;
	}
	
	public Fraction(int n) {
		num = n;	den = 1;
	}

	// store 0/1
	public Fraction() {
		num = 0; den = 1;
	}

/*
 	public Fraction neg() {
		Fraction ans = new Fraction();
		ans.num = -num;
		ans.den = den;
		return ans;
	}
*/
/*
	public Fraction neg() {
		Fraction ans = new Fraction(-num, den);
		return ans;
	}
*/
	public Fraction neg() {
		return new Fraction(-num, den);
	}
	final int four = 4;
	final double PI = 3.14159265358979;
	/*
	public Fraction plus(Fraction right) {
		// left size is called "this", right side is "right"
		// 1/2 + 1/3
//		int n = this.num * right.den + right.num * this.den;
//		int d = this.den * right.den;
		return new Fraction(this.num * right.den + right.num * this.den,
							this.den * right.den);
	}
	*/

	public Fraction plus(Fraction right) {
		return new Fraction(num * right.den + right.num * den,
							den * right.den);
	}

	
	public String toString() {
		return num + "/" + den; // "1/2"
	}
	
	public static void main(String[] args) {
		// principle of least surprise
		
		// if everything works a certain way, make your new object
		// work the same way
		
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3);  // 3/1
		Fraction f3 = new Fraction();	//  0/1
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f1.neg());
		
		// c = a + b; x = 3 + 4
		Fraction f4 = f1.plus(f2);
//		Fraction f5 = f1.times(f2);
//		System.out.println(f5);
	}
}
