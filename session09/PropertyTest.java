import java.util.*;

public class PropertyTest {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.load("market.conf");
		System.out.println(p.getAttribute("delay"));
		int delay = Integer.parseInt(p.getAtribute("delay"));
		

		
	}
}
