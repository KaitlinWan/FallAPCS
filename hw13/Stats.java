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

	public static int mean(int a, int b, int c){
		int number;
		number = mean(int a, int b);
		number = mean(number, int c);
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


	public static double mean(int a, int b, int c){
		int number;
		number = mean(int a, int b);
		number = mean(number, int c);
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
		
			
		
		
		
	}
