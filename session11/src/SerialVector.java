import java.io.*;

public class SerialVector  implements Serializable {
	private static long serialVersionUID = 1;
	private double x,y,z;

	public SerialVector() {
	}
	public SerialVector(double x, double y, double z) {
		this.x = x; this.y = y; this.z = z;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public String toString() {
		return x + "," + y + "," + z;
	}
}
