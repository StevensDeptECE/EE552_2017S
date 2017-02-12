
public class Vec3d {

	
	
	
	
	public static void main(String[] args) {
		Vec3d v1 = new Vec3d(1.0, 2.5, 3.0);
		Vec3d v2 = new Vec3d(-1.5, 1.0, 1.5);
		Vec3d v3 = v1.cross(v2);
		Vec3d v4 = Vec3d.cross(v1,v2);
		double d = Vec3d.dot(v1,v2);
		Vec3d v5 = v1.plus(v2);
		Vec3d v6 = v1.neg();
		System.out.println(v1);
		
	}	
}
