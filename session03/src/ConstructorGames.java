
public class ConstructorGames {
	private int x; // x will be zero (no constructor to set it)
	//	public ConstructorGames() {}
	
		public static void main(String[] args) {
			ConstructorGames cg = new ConstructorGames();
			
			// if you call a constructor with no parameters but don't write any
			// the system automatically builds a default constructor for you
			System.out.println(cg);
			
			
		}
}
