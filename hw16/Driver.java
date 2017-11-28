/***
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Move the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
***/

public class Driver
{
  public static void main( String[] args )
  {

    //build Objects from blueprint specified by class Coin

    //test default constructor
    //===================TOP==========================
    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );
    
    
    System.out.println("until x (currently 10) heads come up! ~~");
    //Keeps flippnig until 10 heads!
    while(Coin.getHeadsCtr() <= 10){
    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) {
    
	    System.out.println( "Matchee matchee! \n" );}
    else{
	    System.out.println( "No match. Firestarter you can not be. \n" );}
    
    System.out.println("==================== \n");
    }

    Coin.reset("heads",0.5);
    System.out.println("until y (now 10) matches come up! \n ~~~");
    //Keeps flippnig until 10 match
    while(Coin.getMatchCtr() < 10 ){
    	//test toString() methods of each Coin
        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test flip() method
        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test equals() method
        if ( yours.equals(wayne) ) {
        	Coin.setMatchCtr(1);
    	    System.out.println( "Matchee matchee! \n" );}
        else{
    	    System.out.println( "No match. Firestarter you can not be. \n" );}
        
        System.out.println("==================== \n");
    }
    
    Coin.reset("heads",0.5);
    System.out.println("if 1300 matches + divisible by 2001 \n \n");
    while( !(Coin.year() == 1) && !(Coin.getMatchCtr() >= 1300)){
    	//test toString() methods of each Coin
        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test flip() method
        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test equals() method
        if ( yours.equals(wayne) ) {
        	Coin.setMatchCtr(1);
    	    System.out.println( "Matchee matchee! \n" );}
        else{
    	    System.out.println( "No match. Firestarter you can not be. \n" );}
        
        System.out.println(Coin.getMatchCtr());
        System.out.println("==================== \n");
    	

    }
    
	    //====================BOTTOM======================
    

  }//end main()

}//end class
