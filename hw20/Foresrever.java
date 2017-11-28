
// Kaitlin Wan
// APCS1 PD2
// HW20 - For the <strike> Lulz </strike> Love of Strings
// 2017-10-19

public class Foresrever {

		//Using a for loop we construct more fences 
		//for fence-less citizens of the ducky world! 
		public static String fenceF(int posts){
			String newString = "";
			String fence = "|--";
			
			//i < posts - 1 because I want to add in the last "|" 
			//on its own so there are no extra dashes.
			
			for(int i = 0; i < posts - 1; i++){
				newString += fence;
			}
			newString += "|";
			return newString;
			
		}
		
		//Using a FOR loop, I take the letter at the end of 
		//the word and place it into a new string.
		public static String reverseF(String s){
			String fixedWord = "";
			int sLength = s.length();
			for(int i=0; i < sLength; i++){
		
				fixedWord += s.substring((s.length()- 1));
				s = s.substring(0,s.length()-1);
				
			}
			
			return fixedWord;
		}
		
		//Using recursion, the basecase is an empty string.
		//If its not empty, it will take the last letter from
		//String s and run reverseR on s[0,s.length() -1)
		public static String reverseR(String s){
			String fixedWord = "";
			if(s.length() == 0){
				return fixedWord;
			}
			else{
				fixedWord += s.substring(s.length()-1);
				fixedWord += reverseR(s.substring(0, s.length() -1));
			}
			return fixedWord;
		}
		
		public static void main(String[] args){
			//Tests for fenceF
			System.out.println("Making a fence with 3 posts:");
			System.out.println(fenceF(3) + "\n");
			System.out.println("Making a fence with 14 posts:");
			System.out.println(fenceF(14)+ "\n");
			
			//Testing SubString:
			String MyWord = new String("THISISAWORD");
			System.out.println(MyWord + " || Letter Count = " 
								+ MyWord.length());
			System.out.println(MyWord.substring(1)); //HISISAWORD
			System.out.println(MyWord.substring(0,4)); //THIS
			System.out.println(MyWord.substring(MyWord.length())); 
			//OUT OF RANGE ^^
			// System.out.println(MyWord.substring(-1));
			//Negative numbers produce errors ^^
			System.out.println(MyWord.substring(MyWord.length() - 1) + "\n");
			//LAST LETTER ^^ || D ||
			
			//TESTING reverseF
			System.out.println(reverseF("evil")); //live
			System.out.println(reverseF("stressed")); //desserts
			System.out.println(reverseF("knits")); //stink
			System.out.println(reverseF("saw")); //was
			System.out.println(reverseF("snoops")); //spoons
			System.out.println(reverseF("star")); //rats
			
			//TESTING reverseR
			System.out.println("");
			System.out.println(reverseR("evil")); //live
			System.out.println(reverseR("stressed")); //desserts
			System.out.println(reverseR("knits")); //stink
			System.out.println(reverseR("saw")); //was
			System.out.println(reverseR("snoops")); //spoons
			System.out.println(reverseR("star")); //rats
			
		}
}
