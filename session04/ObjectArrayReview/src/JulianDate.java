/*
 * http://aa.usno.navy.mil/faq/docs/JD_Formula.php
 * https://en.wikipedia.org/wiki/Julian_day
 * 
 * 365 days per year
 * in a leap year:   leap year is MOD 4 == 0 (divisible by 4) leap year
 *  BUT if it's divisible by 100 MOD 100 = 0  (NOT a leap year)
 *  BUT if it's divisble by 400 MOD 400 == 0  IS a leap year
 *  2004 LEAP
 *  2000 LEAP (divisible by 400)
 *  1900 NOT LEAP
 *  1600 LEAP 
 * 
 * J2000		(year - 2000)*365 + leap....
 * 
 * fractional hh:mm:ss		23:50:20 = 23/24.0	+ 50/(24*60.0) + 20/(24*60*60.0) 
 * 
 * 
 */
public class JulianDate {
	private double jday;
//	private final double J2000 = 0;  // Jan 1, 2000 = jday 0
	// Jan. 2, 2000 = 1
	// Jan. 3, 2000 = 2
//	int x[], y; // x is an arry, y is an int
//	int[] x,y; // x and y are both arrays
	private static String monthNames[] = {
			"Jan", "Feb", "Mar", "Apr", "May", "Jun",
			"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"	
	};
	public static void main(String[] args) {
		JulianDate j = new JulianDate(2017, 1, 1); // 00:00:00
		JulianDate j2 = new JulianDate(2017, 1, 1, 12, 0, 0); // 12:00:00
		JulianDate j3 = new JulianDate(2017, 2, 13, 16, 11,0);
		System.out.println(j); // 2017 Jan. 1 00:00:00
		JulianDate j4 = j3.plus(5.5); // add days
		int year = j3.getYear(); // 2017
		int mon = j3.getMonth(); // 2
		int day = j3.getDay();   // 13
		String monthName = j3.getMonthName();
		
		double diff = j4.minus(j3);
		j4.setTime(4, 30, 0); // keep the same day, but set time
		System.out.println(j4);
		JulianDate j5 = new JulianDate(2016, 2, 29, 12, 0,0); //xxx.5
		System.out.println(j5);
		JulianDate j6 = j5.plus(1);
		System.out.println(j5);
		
		JulianDate j7 = new JulianDate(2017, 2, 27);
		for (int i = 0; i < 3; i++) {
			j7 = j7.plus(1);
			System.out.println(j7 + "\t" + j7.getYear() + "\t" + j7.getMonth() + "\t" + j7.getDay());
		}
	}
}
