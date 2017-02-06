
public class ConstructorGames3 {
	private int x; // x will be zero (no constructor to set it)
	private ConstructorGames3(int x) {}
	
	public static void main(String[] args) {
		ConstructorGames3 cg = new ConstructorGames3(2);
		System.out.println(cg);			
	}
}
