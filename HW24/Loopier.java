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

    public static int linSearchR(int[] a, int target){
	int index = -1;
	
	if(a.length == 1){
	    
	    

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

    public static int freqRec(int[] a, int target){
	return 0;

    }



    public static void main(String[] args){
	int[] thisArray;
	thisArray = new int[2];
	randomPop(thisArray);
	System.out.println(returnArray(thisArray));

	int[] oneArray;
	oneArray = new int[] {1, 2, 3, 4, 5};
	System.out.println(returnArray(oneArray));
	System.out.println(linSearch(oneArray, 2));
	System.out.println(linSearch(oneArray, 6));

	}

      







}
