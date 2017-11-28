// KAITLIN WAN
// APCS1 PD2
// HW12 - stAtistically sPeaking (AP???)
// 2017-10-6

public class Stats {
	
	/* mean: finds the average of 2 numbers
	   Precondition: Given 2 **INT** parameters
	   Postcondition: returns mean
	 */
	public static int mean(int a, int b){
		int number;
		number = a + b;
		number = number / 2;
		return number;
		
	
	}
	/* mean: finds the average of 2 numbers
	   Precondition: Given 2 **DOUBLE** parameters
	   Postcondition: returns mean
	 */
	public static double mean(double a, double b){
		double number;
		number = a + b;
		number = number / 2;
		return number;
		
		
	}
	/* max: returns the greater number
	   Precondition: Given 2 int parameters
	   Postcondition: returns greater number a or b
	 */
	public static int max(int a, int b){
		if(a > b){
			return a;
		}
		else {
			return b;
		}
		
	}
	
	/* max: same as above but int becomes DOUBLE */
	public static double max(double a, double b){
		if(a > b){
			return a;
		}
		else {
			return b;
		}
		
	}
	/* geoMean: Calculates the Geometric Mean
	   Preondition: given 2 params that are ints
	   Postcondition: returns geomean
	 */
	public static int geoMean(int a, int b){
		int num;
		num = a + b;
		num = (int) Math.sqrt(num);
		return num;
	}
	
	/* geoMean: Calculates the Geometric Mean
	   Preondition: given 2 params that are doubles
	   Postcondition: returns geomean
	 */
	public static double geoMean(double a, double b){
		double num;
		num = a + b;
		num = Math.sqrt(num);
		
		return num;
	}
	
	
	
	public static void main(String[] args) {
		
		//MEAN
		System.out.println("Testing MEAN:");
		
		System.out.println("int: 12 14 *should be 13*");
		System.out.println(mean(12,14));
		System.out.println("");
		
		System.out.println("double: 12.0 14.0 *should be 13.0*");
		System.out.println(mean(12.0,14.0));
		
		System.out.println("");
		System.out.println("");
		
		//MAX
		System.out.println("Testing MAX:");
		
		System.out.println("int: 12 14 *should be 14*");
		System.out.println(max(12,14));
		System.out.println("int: 14 12 *should be 14*");
		System.out.println(max(12,14));
		System.out.println("");
		
		System.out.println("double: 12.0 14.0 *should be 14.0*");
		System.out.println(max(12.0,14.0));
		System.out.println("double: 14.0 12.0 *should be 14.0*");
		System.out.println(max(14.0,12.0));
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		
		//geoMean
		System.out.println("Testing GEOMEAN:");
		
		System.out.println("int: 30 6 *should be 18*");
		System.out.println(geoMean(30,6));
		System.out.println("");
	
		System.out.println("double: 30.0 6.0 *should be 18.0*");
		System.out.println(geoMean(30.0,6.0));
	}
		
		
		
		
		
		
		
		
	}
