//Team Java Visualizer: Jackie Li, Victor Lin, Kaitlin Wan
//APCS1 pd02
//HW24 - MORE PIGS!
//2017-10-29

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

/***  
*	TO-DO:
*	1. Special Consonant sounds in the beginning
*
* 
* 	NOTES:
* 	
*	Although our code is mostly functioning. 
*	When there's punctuation in the given text, it's not very clear WHAT you should do with it.
*	After scowering online, it seems that punctuation isn't a problem for the spoken language.
*	Other sources say that you should just keep the punctuation as is.
*
*	We included the special y function. If the y is in the beginning, it will be treated as
*	a consonant and if it appears in the middle of the function it will be treated as a 
*	vowel. If there is a vowel before "y" then it will be a consonant!
*
*	We also added Punctuation. I think this was the hardest for me to understand.
*	it looks for where there ISNT a letter and emulates that into the final return string
*	
*	For Capitalization, i checked to see if there were any capitals in the word
*	if there was, then I would make the translated first letter into a capital.
*
*
***/

import java.util.Scanner;

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiouAEIOU";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
      return !(w.indexOf(letter) == -1);
     
      
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
      return hasA(VOWELS, letter);
      
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
      int counter = 0;
      for(int i = 0; i < w.length(); i++ ){
		  if(isAVowel(w.substring(i,i + 1))){
			  counter++;
		  }
	  }
      return counter; 
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
      return countVowels(w) > 0;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
      String rtrString = "";
      for(int i = 0; i < w.length(); i++){
		  if(isAVowel(w.substring(i, i+1))){
			  rtrString += w.substring(i, i+1);
		  }
      }
      return rtrString;
  }

	/* ======================================
	String firstVowel(String) -- returns the first vowel in a String
	pre: w != null
	post: firstVowel("") --> ""
		  firstVowel("zzz") --> ""
		  firstVowel("meatball") --> "e"
	=========================================*/
    public static String firstVowel(String w){
		String rtrString = "";
		if (hasAVowel(w)){
			return allVowels(w).substring(0,1);
		}
		return rtrString;
    }

	/* =======================================
	String beginsWithVowel(String) -- returns true if string 
						starts with vowel, false otherwise
	pre: w != null and w.length() > 0
	post: beginsWithVowel("apple")  --> true
          beginsWithVowel("strong") --> false 
	==========================================*/
    public static boolean beginsWithVowel(String w){
		return isAVowel(w.substring(0,1));
    }

	/* ========================================
	String engToPig(String) -- returns pigified words
	pre: w.length() > 0
	post: engToPig("apple")  --> "appleway"
          engToPig("strong") --> "ongstray"
          engToPig("java")   --> "avajay 
	===========================================*/
    public static String engToPig(String w){
		String storage = "";
		if(hasA(w,"y")){
		    if (hasAVowel(w.substring(0,w.indexOf("y")))){
			    storage = punctuationIn(w);
		    }
		    else{
			storage = w.substring(w.indexOf("y")) + w.substring(0,w.indexOf("y")) + "ay";
		    }
		}
		else{
			storage = punctuationIn(w);
		}
		return storage;
    }
    
	
	public static String vowelStart(String w){
		if(beginsWithVowel(w)){
			return w + "way";
		}
		return consonantStart(w);
	}
	
	public static String consonantStart(String w){
		int first = w.indexOf(firstVowel(w));
		return w.substring(first) + w.substring(0,first) + "ay";
	}
	
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String lowALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private static final String upALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String punctuationIn(String w){
		String strHolder = "";
		int placement = 0;
		int counter = 0;
		for(int i = 0; i < w.length(); i++){
			
			if((hasA(upALPHABET,w.substring(i,i+1)))){
				counter += 1;
				}
			}
		for(int i = 0; i < w.length(); i++){
			if(!(hasA(ALPHABET,w.substring(i,i+1)))){
				strHolder += vowelStart(w.substring(placement,i)) + w.substring(i,i+1);
				placement = i + 1;
			}
			else if(i == w.length() - 1){
				strHolder += vowelStart(w.substring(placement));
			}
		}
		
		if (counter >= 1){
			strHolder = (strHolder.substring(0,1)).toUpperCase() + (strHolder.substring(1)).toLowerCase();
		}
		
		return strHolder;
	}
	
  public static void main( String[] args ){
 	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
	    System.out.println(engToPig(sc.next()));
	}     

	/*System.out.println("============test hasA===============");
	System.out.println(hasA("chicken","i"));//t
	System.out.println(hasA("chicken","a"));//f
	System.out.println(hasA("chicken","c"));//t
	
	System.out.println("============test isAVowel===============");
	System.out.println(isAVowel("a"));//t
	System.out.println(isAVowel("b"));//f
	System.out.println(isAVowel("c"));//f
	
	System.out.println("============test countVowels===============");
	System.out.println(countVowels("chicken"));//2
	System.out.println(countVowels("duck"));//1
	System.out.println(countVowels("swan"));//1
	
	System.out.println("============test hasAVowel===============");
	System.out.println(hasAVowel("chicken"));//t
	System.out.println(hasAVowel("crypt"));//f
	System.out.println(hasAVowel("gym"));//f
	
	System.out.println("============test allVowels===============");
	System.out.println(allVowels("chicken"));//ie
	System.out.println(allVowels("aqueous"));//aueou
	System.out.println(allVowels("duck"));//u
	
	System.out.println("============test firstVowel===============");
	System.out.println(firstVowel("chicken"));//i
	System.out.println(firstVowel("aqueous"));//a
	System.out.println(firstVowel("duck"));//u
	
	System.out.println("============test beginsWithVowel===============");
	System.out.println(beginsWithVowel("chicken"));//false
	System.out.println(beginsWithVowel("aqueous"));//true
	System.out.println(beginsWithVowel("duck"));//false
	
	System.out.println("============test engToPig===============");
	System.out.println(engToPig("chicken"));//ickenchay
	System.out.println(engToPig("aqueous"));//aqueousway
	System.out.println(engToPig("duck"));//uckday
	System.out.println(engToPig("can't"));//ancay'tay
	System.out.println(engToPig("this-is-awesome"));//isthay-isway-awesomeway
	System.out.println(engToPig("why"));//ywhay
	System.out.println(engToPig("cat?duck!"));//atcay?uckday!
	System.out.println(engToPig("thy-my"));//ythay-ymay */
	
	
  }//end main()

}//end class Pig
