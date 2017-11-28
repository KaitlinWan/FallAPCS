// KAITLIN WAN
// APCS1 PD2
// HW19 - Euclid's Algo!
// 2017-10-18

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
	
    //ADDED
	public static int mean(int a, int b, int c){
		int num;
		num = mean((mean(a,b)),c);
		return num;
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
    //ADDED
	public static double mean(double a, double b, double c){
		double num;
		num = mean((mean(a,b)),c);
		return num;
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
    //ADDED
	public static int max(int a, int b, int c){
		int num;
		num = max((max(a,b)),c);
		return num;
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
    //ADDED
		public static double max(double a, double b, double c){
		double num;
		num = max((max(a,b)),c);
		return num;
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
    public static int geoMean(int a, int b, int c){
	int num;
	num = a + b + c;
	num = (int)Math.pow(num,(1/3));
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
    
    public static double geoMean(double a,double b,double c){
	double num;
	num = a + b + c;
	num = Math.pow(num,(1/3));
	return num;
    
    }
    //THERE'S NO PREDEFINED min!! SO HERE WE GO!
    public static int min(int a, int b){

	if(a < b){
	    return a}
	else{
	    return b}
       
    }
    
/*Brute force method: Start with a variable that will be divided on.
The while loop will check if the 2 numbers are divisible. If they aren't the number
goes up by one.  */

    public static int gcd(int a, int b){
	int wow = 1;
	int newa = a;
	int newb = b;
	int a  = max(newa,newb);
	int b = min(newa,newb);

	if( a == 0 &&  b == 0){
	    return 0;
	}
	while( a % b != 0){
	    if(b % wow != 0){
		wow += 1;
	    }
	    else{
		wow -=1;
	}
	    return wow;}
    }
    
	
	/* GCD recusively:
		Checks if either is zero? if true returns other number.
		checks if they are divisible by eachother. 
		then, if not, then you take the difference for a,
		and then for b its the smaller number */

	public static int gcdER(int a, int b) {
        
		if (a == 0 ) {
			
            return b;
        }
		else if(b == 0){
			return a;
		}
		else{
        if (a%b ==0) {
            return b;
        }
        else {
            return gcdER((max(a,b) - min(a,b)), min(a,b));
	}
	}
    }
	
	
	/* similar to before, checking to see if either is zero
	which will return the other one. Then, recursively goes 
	through tasks to achieve a gcd */
	public static int gcdEW(int a, int b) {
       
	   if (a == 0 ) {
			
            return b;
        }
		else if(b == 0){
			return a;
		}
		
        while ( a % b != 0)  { //not divisible
            a = (max(a,b) - min(a,b));
            b =  min(a,b);
        }
        return min(a,b);
        }

	
	

    }
	
	
	public static void main(String[] args) {	
		
		
		
	}
	
}
