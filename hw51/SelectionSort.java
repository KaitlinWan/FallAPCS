  /***************************************
   * Kaitlin Wan
   * APCS PD2
   * HW51 - SELECTION SORT!!!
   * 2017 - 12 - 11
   *
   * class SelectionSort -- implements SelectionSort algorithm
   ***************************************/
  import java.util.ArrayList;
  public class SelectionSort 
  { //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ){
      ArrayList<Integer> retAL = new ArrayList<Integer>();
      while( size > 0 ) { //     offset + rand int on interval [lo,hi]
  	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
  	    size--; }
      return retAL; }
    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
      int randomIndex;
      for( int i = al.size()-1; i > 0; i-- ) { //pick an index at random
        randomIndex = (int)( (i+1) * Math.random() );
        //swap the values at position i and randomIndex
        al.set( i, al.set( randomIndex, al.get(i) ) ); }}

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ){
      int filled = data.size() - 1;
      for(int i = 0; i < data.size(); i++){
        Comparable largest = 0;
        int indexofLargest = 0;
        //System.out.println("========================================");
        //System.out.println("PASS THROUGH: " + i);
        for(int c  = 0; c < filled; c++){
          //System.out.println("========================================");
          //System.out.println("ARRAY CURRENTLY: " + data);
          //System.out.println("AT INDEX: " + c);
          //System.out.println("WE HAVE: " + data.get(c));
          //System.out.println("CURRENT LARGEST : " + largest);
          if(((data.get(c)).compareTo(largest)) >  0){
            largest = data.get(c);
            indexofLargest = c;
            //System.out.println("NEW LARGEST: " + largest); 
          } } //END OF FINDING THE LARGEST ##
          if(((data.get(filled)).compareTo(data.get(indexofLargest))) <= 0 )  {
          //System.out.println("Final Largest " + largest);
          //System.out.println("indexofLargest = " + indexofLargest);
          Comparable holdOld = data.get(filled);
          //System.out.println("TO BE SWITCHED: " + holdOld);
          //System.out.println("TO BE FILLED AT: " + filled);
          data.set(filled, largest);
          data.set(indexofLargest, holdOld); }
        filled--; //UPDATE
        } }//end selectionSortV

    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable>
      selectionSort( ArrayList<Comparable> input ) 
    {
      ArrayList<Comparable> foo = new ArrayList<Comparable>();
      for( Comparable c : input )
        foo.add(c);
      selectionSortV( foo );
      return foo;
    }//end selectionSort 

    public static void main( String [] args ) 
    {
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      selectionSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      
        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        selectionSortV(coco);
        System.out.println( "ArrayList coco after sorting:\n" + coco );

      	ArrayList banana = new ArrayList<Integer>();
        banana.add(7);
        banana.add(1);
        banana.add(5);
        banana.add(12);
        banana.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + banana );
        ArrayList bananaSorted = selectionSort( banana );
        System.out.println( "sorted version of ArrayList glen:\n" 
        + bananaSorted );
        System.out.println( "ArrayList glen after sorting:\n" + banana );

        ArrayList pie = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + pie );
        ArrayList pieSorted = selectionSort( pie );
        System.out.println( "sorted version of ArrayList coco:\n" 
        + pieSorted );
        System.out.println( "ArrayList coco after sorting:\n" + pie );
        System.out.println( pie );
    }//end main
  }//end class SelectionSort
