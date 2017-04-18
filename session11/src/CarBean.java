import java.util.*;
import java.awt.*;
public class CarBean {
	private Color c;
	
	// must either have a constructor with no arguments
	// or be able to read from disk (Serializable)
	public CarBean() {
	}
	public void setColor(Color c) { this.c = c; }
	public Color getColor() { return c; }	
}
