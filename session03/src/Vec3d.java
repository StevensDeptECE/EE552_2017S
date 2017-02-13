
public class Vec3d {

	
	
	
	
	public static void main(String[] args) {
		Vec3d v1 = new Vec3d(1.0, 2.5, 3.0);
		Vec3d v2 = new Vec3d(-1.5, 1.0, 1.5);
		System.out.println(v1); 
		System.out.println(v2);
		
		Vec3d v3 = v1.cross(v2);
		System.out.println(v3);
		Vec3d v4 = Vec3d.cross(v1,v2);
		System.out.println(v4);
		double d = Vec3d.dot(v1,v2);
		System.out.println(d);
		Vec3d v5 = v1.plus(v2);
		System.out.println(v5);
		Vec3d v6 = v1.neg();
		System.out.println(v6);
	}	
}
