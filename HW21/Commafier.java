//Kaitlin Wan
//APCS PD2
//HW21 - KARMACOMMA
//2017-10-23

public class Commafier{
    
	//RECURSIVE FUNTION:
	//Adds a comma after every 3 place values
	//Starts from the back and divides by 1000 for each call
    public static String commafyR(int x) {
        String str = Integer.toString(x);
        if (str.length() > 3) {
           str = commafyR(x/1000) + "," + str.substring(str.length() -3);
        }

        return str;
    }
	
	//INTERATIVELY:
	//After noticing that you can leave the initialization and the update blank,
	//it basically becoms a while loop! Checks if the number is 4 digits
	//iF yes, it will add a comma and then the 3 ending digits THEN the rest because
	//it starts from the left to right
	public static String commafyF(int x) {
        String rtrString = "";
        String Intstr = Integer.toString(x);
        while(Intstr.length() > 3) // Iteration also works!!
		{
            rtrString = "," + Intstr.substring(Intstr.length() -3) + rtrString;
            Intstr = Intstr.substring(0, Intstr.length() -3);
        }
        rtrString = Intstr + rtrString;
        return rtrString;
    }
    

	
    public static void main(String[] args){
	for(String s:args){
		System.out.println(commafyR(Integer.parseInt(s)));
	}
	
	/*System.out.println(commafyR(123456));
	System.out.println(commafyR(123));
	System.out.println(commafyR(12343));
	
	System.out.println(commafyF(123456));
	System.out.println(commafyF(123));
	System.out.println(commafyF(12343));
    }
*/

}
}

