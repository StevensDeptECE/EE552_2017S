/**
 * A bean is an object that obeys certain conventions on interface
 * 
 * @author dkruger
 *
 */
import java.util.*;

public class PersonBean {
	private String firstName;
	private String lastName;
	private int age;
	private ArrayList<String> children;
	
	// must either have a constructor with no arguments
	// or be able to read from disk (Serializable)
	public PersonBean() {
		children = new ArrayList<String>();
	}
	public PersonBean(String fName, String lName, int age) {
		
	}
	public void setFirstName(String name) { firstName = name; }
	public String getFirstName() { return firstName; }

	public void setLastName(String name) { lastName = name; }
	public String getLastName() { return lastName; }

	public void setAge(int x) { age = x; }
	public int getAge() { return age; }

	public boolean isReadyToRetire() {
		return age > 65;
	}
}
