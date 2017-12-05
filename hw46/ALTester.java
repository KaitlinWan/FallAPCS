import java.util.ArrayList;

/* Kaitlin Wan
 * APCS PD2
 * HW46: Al<B> Sorted!
 * 2017-12-04
 */


public class ALTester {
    //Finds the comparision between 1st 2 numbers then beyond!
    public static boolean isSorted(ArrayList<Comparable> o) {
	if(o.isEmpty()) {
	    return true;
	}
	else {
	    Comparable x = o.get(0);
	    Comparable y = o.get(1);
		
	    int base = x.compareTo(y);
		
	    o.remove(0);
	    return sortHelp(o, base);
	}
		
    }
		
    //HELPER FUNCTION
    public static boolean sortHelp(ArrayList<Comparable> o, int oldBase) {
			
	int newBase = 99;
		
	if(o.isEmpty()){
	    return true;
	}
	else if (o.size() == 1) {
	    return true;
	}
	else {
	    Comparable x = o.get(0);
	    Comparable y = o.get(1);
	    newBase = x.compareTo(y);
	    if (newBase != oldBase) {
		return false;
	    }
	}
	o.remove(0);
	return sortHelp(o, newBase);
		
    }
    //RANDOM POPULATION
    public static void randomPop(ArrayList<Comparable> arr,int amount){
	for(int i = 0; i < amount; i++) {
						
	    arr.add((int)(Math.random() * 100));
	}
					
					
    }
    //Increasing Populate	 
    public static void upPop(ArrayList<Comparable> arr, int amount) {
	for(int i = 0; i < amount; i++) {
	    arr.add(i);
	}
			 
    }
    //DECREASE POPULATE
    public static void downPop(ArrayList<Comparable> arr, int amount) {
	for(int i = (amount - 1); i >= 0; i--) {
	    arr.add(i);
	}
			 
    }
	
    public static void main(String[] args) {
		
	ArrayList<Comparable> random = new ArrayList<>();
	randomPop(random, 23);
	System.out.println(random);
	System.out.println(isSorted(random));
		
	ArrayList<Comparable> up = new ArrayList<>();
	upPop(up, 23);
	System.out.println(up);
	System.out.println(isSorted(up));
		
	ArrayList<Comparable> down = new ArrayList<>();
	downPop(down, 23);
	System.out.println(down);
	System.out.println(isSorted(down));
		
	ArrayList<Comparable> same = new ArrayList<>();
	same.add(1);
	same.add(1);
	same.add(1);
	System.out.println(same);
	System.out.println(isSorted(same));
		
	ArrayList<Comparable> ordered = new ArrayList<Comparable>();
	ordered.add(1);
	ordered.add(12);
	ordered.add(30);
	ordered.add(1233);
	ordered.remove(3);
	System.out.println(ordered);
	System.out.println(isSorted(ordered));
		
    }

}
