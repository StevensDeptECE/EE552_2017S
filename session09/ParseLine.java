public class ParseLine {
	public static void main(String[] args) {
		String line = "3 4 1.5 1.6 -1.9 hello 2.5";
		String[] tokens = line.split(" ");
		int rows = Integer.parseInt(tokens[0]); // get row number
		int cols = Integer.parseInt(tokens[1]); //
		double x = Double.parseDouble(tokens[2]);
		double y = Double.parseDouble(tokens[3]);
		double z = Double.parseDouble(tokens[4]);
		String s = tokens[5];
		
		//		for (String t : tokens) {
			
		//		}
		//		for (int i = 0; i < tokens.length; ++i)
		//			tokens[i]
