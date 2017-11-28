//Kaitlin Wan
//APCS1 PD 2
//HW25 - Loop Loop Recursion!
//2017-11-01


// I dont understand how to do the recursions when they are NOT in the 
//array. but other than that, it works!
public class Loopier{

    //A static method to populate an existing array with randomly generated ints.
    public static void randomPop(int[] anArray){
	for(int i = 0; i < anArray.length; i++){
	    int x = (int)(Math.random() * 100);
	    anArray[i] = x;
	    
	}
    }
    
    //A method to convertArrays into Strings!
    public static String returnArray(int[] anArray){
	String rtrString;
	rtrString = "{";
	for(int i = 0; i < anArray.length; i++){
	    rtrString += anArray[i];
	    rtrString += ", ";
	}
	
	return rtrString.substring(0 ,rtrString.length() - 2) + "}";
    }


    //Looks for the first  index of target in the array
    public static int linSearch(int[] a, int target){
	for(int i = 0; i < a.length; i++){
	    if(a[i] == target){
		return i;
		    }
	}

	return -1;

    }
    //recursion: find the first index in the array
    public static int linSearchR(int[] a, int target){
    
    	
    	if(a.length == 1 && !(a[0] == target)){
    		return -1;
    		
    	}
    	
    	else if (a[0] == target) {
            return 0;
        }
    	
    	else if (a.length == 0) {
            return -1;
        } 
    	
    	else {
            int[] newArray = new int[a.length - 1];
            for (int i = 1; i < a.length; i++) {
                newArray[i - 1] = a[i];
            }
            
            return 1 + linSearchR(newArray, target) ;
        }
    }
    //Counts the amount of times target appears in a.
    public static int freq(int[] a, int target){
	int rtrInt;
	rtrInt = 0;
	for(int i = 0; i < a.length; i++){
	    if(a[i] == target){
		rtrInt += 1;
	    }
	}
	return rtrInt;
    }
    //counts the amount of times target apperars in a
    //recursively
    public static int freqRec(int[] a, int target){
    	if(a.length == 0){
    		return 0;
    	}
    	
    	int[] newArray = new int[a.length - 1];
    	for(int i = 0; i < a.length; i++){
    		newArray[i] = a[i + 1];
    	}
    	
    	if(a[0] == target){
    		
    		return 1 + freqRec(newArray, target);
    	}
    	else{
    		
    	
    	return freqRec(newArray, target);
    	}

    }



    public static void main(String[] args){
	int[] thisArray;
	thisArray = new int[2];
	randomPop(thisArray);
	System.out.println(returnArray(thisArray));

	int[] oneArray;
	oneArray = new int[] {1, 2, 3, 4, 5, 2, 4};
	System.out.println(returnArray(oneArray));
	System.out.println(linSearch(oneArray, 2));
	System.out.println(linSearch(oneArray, 6));
	System.out.println(linSearchR(oneArray, 1));
	System.out.println(linSearchR(oneArray, 10));
	System.out.println(linSearchR(oneArray, 2));
	System.out.println(freq(oneArray, 1));
	System.out.println(freq(oneArray, 2));
	}

      







}
