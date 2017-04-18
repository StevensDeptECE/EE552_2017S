import java.util.*;
import java.util.Map.*;

public class HashExamples {
	
	public static void main(String[] args) {
		HashMap<String, String> nameMap = new HashMap<String,String>();
		nameMap.put("George", "Washington");
		nameMap.put("George", "Bush");
		nameMap.put("Bill", "Clinton");
		nameMap.put("Barack",  "Obama");
		nameMap.put("Donald", "Trump");
		
		for (Iterator<String> i = nameMap.keySet().iterator(); i.hasNext(); ) {
			Object key = i.next();
			System.out.println(key + "==>" + nameMap.get(key));
		}
		System.out.println();

		
		
		
		//faster
		for (Iterator< Entry<String,String> > i = nameMap.entrySet().iterator(); i.hasNext(); ) {
		        Map.Entry<String,String> pair = i.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		    }
		
		
	}
}
