
/*****************************************************
 * class Slots
 * Kaitlin Wan
 * APCS1 pd02
 * HW26 -- Shmoney
 * 2017-11-07
 *****************************************************/

public class Slots
{
    //EACH SLOT HAS 8 DIFFERENT SYMBOLS
  private static final String[] FRUITS = {
    "lime", "lime", "lime", 
    "lemon", "lemon", "lemon", 
    "cherry", "cherry", "cherry", 
    "orange", "orange", "orange", 
    "grapefruit", "grapefruit", "grapefruit", 
    "tangerine", "tangerine", "tangerine", 
    "ugli", "ugli", "ugli",
    "peach", "peach", "peach"
  };

  private String[] _fruits; //to be init'd by each instance


  /*=====================================
    Slots() -- default constructor
    pre:  constant array FRUITS exists, has been initialized
    post: mutable array _fruits contains same elements as FRUITS
    =====================================*/
  public Slots()
  {
    //allocate memory for _fruits based on size of FRUITS:
      _fruits = new String[FRUITS.length];
    //copy elements of FRUITS into _fruits:
      for(int i = 0; i < FRUITS.length; i++){
	  _fruits[i] = FRUITS[i];
      }
  }


  /*=====================================
    String toString() -- overrides inherited toString()
    pre:  
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
  public String toString()
  {
      String rtrString = "";
      System.out.println("~~~~~~~~~~~~~~~~~~ SLOT MANIA ~~~~~~~~~~~~~~~~~~");
      System.out.println("||Slot One|| \t||Slot Two|| \t ||Slot 3||");
      System.out.println("||" + _fruits[0] + "||\t ||" + _fruits[1] + "||\t|| " + _fruits[2] + "||");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      return rtrString;
  }


  /*=====================================
    void swap(int,int) -- array swap util fxn
    pre:  _fruits array exists
    post: elements at indices i, j are swapped
    =====================================*/
    private void swap( int i, int j ){
	String holder = _fruits[i];
	_fruits[i] = _fruits[j];
	_fruits[j] = holder;
     
  }


  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
  public void spinOnce()
    { int randomSpin = 0;
	randomSpin = (int)((Math.random() * 50 ));
	for(int i = 0; i <= randomSpin; i++){
	    int randoA = (int)((Math.random() * 24 )); //Picks a random number from 0 to 24
	    int randoB = (int)((Math.random() * 24 )); //Picks a random number from 0 to 24
	    swap(randoA, randoB);
	}
    
    }


  /*=====================================
    boolean jackpot() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    false otherwise
    =====================================*/
  public boolean jackpot()
  {
      if(_fruits[0].equals(_fruits[1])){
	  if(_fruits[0].equals(_fruits[2])){
	      return true;
	  }
      }
      return false;
  }


  /*=====================================
    boolean miniWin() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    or if first 3 slots mutually distinct, 
    false otherwise
    =====================================*/
  public boolean miniWin()
  {
      if(jackpot() == true){
	  return true;
      }
      else if(!(_fruits[0].equals(_fruits[1]))){
	  if(!(_fruits[1].equals(_fruits[2]))){
	      if(!(_fruits[0].equals(_fruits[2]))){
		  return true;
	      }
	  }
      }
      return false;
  }

  //main() method for testing
  public static void main( String[] args )
  {
    //usage: move bar below down 1 line at a time to test functionality...
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
      Slots machine01 = new Slots();
      Slots machine02 = new Slots();

      System.out.println(machine01);
      System.out.println(machine02);
     
      //test to verify slot machines function indepently
      System.out.println();
      System.out.println( "Machine01 initial state:\t" + machine01 );
      System.out.println( "Machine02 initial state:\t" + machine02 );
    
      System.out.println( "\nSpinning machine01...\n" );

      machine01.spinOnce();

      System.out.println();
      System.out.println( "Machine01 state:\t" + machine01 );
      System.out.println( "Machine02 state:\t" + machine02 );
      System.out.println();

      //test gamble-until-you-win mechanism

      System.out.println( "Preparing to spin until a mini win! . . ." );
      System.out.println( "------------------------------------" );

      //if you haven't won, spin again until you win!
      while( machine01.miniWin() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
      }
      
      System.out.println( "====================================" );
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "WIN\n" );


     
      System.out.println( "Preparing to spin until...jackpot! . . ." );
      System.out.println( "------------------------------------" );

      int counter = 0;
      //if you haven't won, spin again until you win!
      while( machine01.jackpot() == false ) {
	  System.out.println("Pull # " + counter);
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
      counter ++;
      }

      System.out.println( "=====================================================\n\n" );
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "JACKPOT!\n" );
      System.out.println("Jackpot on pull  # " + counter + "\n");

      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main

}//end class Slots
