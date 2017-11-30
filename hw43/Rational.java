/**
 * Kaitlin Wan
 * APCS PD2
 * HW36 - Be Rational
 * 2017-11-18
 */

public class Rational {

	//INSTANCE VARIABLES!
	private double numerator;
	private double denominator;
	
	//DEFAULT CONSTRUCTOR:
	public Rational() {
		numerator = 0;
		denominator = 1;	
		
	}
	
	//OVERLOADED CONSTRUCTOR:
	public Rational(double num, double deno) {
		
		
		if (deno == 0) {
			System.out.println("You can't divide by 0!");
			numerator = 0;
			denominator = 1;
		}
		else{
			numerator = num;
			denominator = deno;
		}
		
		
	}
	
	//TOSTRING to print out RATIONAL in for (NUMERATOR/DENOMINATOR):
	public String toString() {
		
		return "" + (int)numerator + "/" + (int)denominator;
		
	}
	
	//GETTER for NUMERATOR
	public double getNumerator() {
		return numerator;
	}

	//GETTER for DENOMINATOR
	public double getDenominator() {
		return denominator;
	}
	
	//RETURNS FLOATVALUE (decimal form!)
	public double floatValue() {
		double num = numerator;
		double den = denominator;
		return (num/den);
	}
	
	//CHANGES the RATIONAL by MULTIPLYING given INPUT Rational:
	public void multiply(Rational rat) {
		double top = numerator * rat.getNumerator();
		double bot = denominator * rat.getDenominator();
		
		numerator = top;
		denominator = bot;
		
	}
	
	//CHANGES the RATIONAL by DIVIDING given INPUT rational.
	public void divide(Rational rat) {
		double top = numerator * rat.getDenominator();
		double bot = denominator * rat.getNumerator();
		
		numerator = top;
		denominator = bot;
		
	}
	
	public static void main(String[] args) {
	Rational r = new Rational(2,3); //Stores rational number 2/3
	System.out.println("New Rational r:");
	System.out.println(r);
	System.out.println(r.floatValue());
	System.out.println(r.getNumerator());
	
	System.out.println("===");
	
	Rational s = new Rational(1,2); //Stores rational number 1/2
	System.out.println("New Rational s:");
	System.out.println(s);
	System.out.println(s.floatValue());
	
	System.out.println("===");
	System.out.println("TESTING MULTIPLY:");
	r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
	System.out.println("r should be 2/6");
	System.out.println(r);
	System.out.println("s should be 1/2");
	System.out.println(s);
	
	System.out.println("===");
	r.divide(s);
	// 2/6 * 2/1
	System.out.println("r should be 4/6");
	System.out.println(r);
	System.out.println("s should be 1/2");
	System.out.println(s);
	System.out.println("===");
	}

}
