
public class ConstructorGames2 {
	private int x; // x will be zero (no constructor to set it)
	public ConstructorGames2(int x) {}
	
	public static void main(String[] args) {
//ILLEGAL		ConstructorGames2 cg = new ConstructorGames2();
		ConstructorGames2 cg = new ConstructorGames2(2);
		System.out.println(cg);			
	}
}
