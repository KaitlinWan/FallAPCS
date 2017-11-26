/**
 * Kaitlin Wan
 * APCS PD2
 * HW37 - Be Rational
 * 2017-11-20
 */

public class Rational {

    //INSTANCE VARIABLES!
    private int numerator;
    private int denominator;
	
    //DEFAULT CONSTRUCTOR:
    public Rational() {
	numerator = 0;
	denominator = 1;	
		
    }
	
    //OVERLOADED CONSTRUCTOR:
    public Rational(int num, int deno) {
		
	this();
	if (deno != 0) {
	    numerator = num;
	    denominator = deno;
	}
		
	else{
	    System.out.println("You can't divide by 0! Rational set to 0/1");
      
	}
		
    }
	
    //TOSTRING to print out RATIONAL in for (NUMERATOR/DENOMINATOR):
    public String toString() {
		
	return "" + numerator + "/" + denominator;
		
    }
	
    //GETTER for NUMERATOR
    public int getNumerator() {
	return  numerator;
    }

    //GETTER for DENOMINATOR
    public int getDenominator() {
	return denominator;
    }
	
    //RETURNS FLOATVALUE (decimal form!)
    public double floatValue() {
	return (double)numerator/denominator;
    }
	
    //CHANGES the RATIONAL by MULTIPLYING given INPUT Rational:
    public void multiply(Rational rat) {
	int top = numerator * rat.getNumerator();
        int bot = denominator * rat.getDenominator();
		
	numerator = top;
	denominator = bot;
		
    }

    public static int gcd(int a, int b){
	//uses to simplify denominators
	new Rational = holder
	return gcd;
    }

    public int gcd(){
	//finds the GCD of the numerator and denominator
	int b = numerator;
	int a = denominator;
	
	if ( b == 0){
	    return a;
	}
	return gcd(b, a%b);
    }

    public void reduce(){
	this.numerator = this.numerator / this.gcdER();
	this.denominator = this.denominator / this.gcdER();
    }

    public void add(Rational rat){
	Rational hold = new Rational(denominator,rat.denominator).gcd();

	int gcd = hold.gcd();
	
        denominator *= r.denominator / gcd;
        numerator *= r.denominator / gcd;
	
        numerator += (r.numerator * (denominator / r.denominator));

    }

    public int compareTo(Rational rat){
	double call = this.floatValue();
	double param  = rat.floatValue();

	int retInt = 0;
	
	if (call  == param){
	    return retInt;
	}
	elseif ( call > param){
	    retInt = 100;
	}
	else{
	    retInt = -100;
	}

	return retInt;
    }
    
	
    //CHANGES the RATIONAL by DIVIDING given INPUT rational.
    public void divide(Rational rat) {
	int top = numerator * rat.getDenominator();
	int bot = denominator * rat.getNumerator();
		
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
