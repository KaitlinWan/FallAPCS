/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
      _data = new int[10];
      _size = _data.length;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
      String retString = "[";
      
      for(int s : _data){
	  retString += s + ",";

      }
      return retString + "]";
      
  }


  //double capacity of SuperArray
  private void expand()
  {
      _size = _size * 2;
      
      int[] newArray = new int[_size];

      _data = newArray;
      
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      return 0;
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int oldVal = _data[index];

      _data[index] = newVal;
      return oldVal;
  }


  //main method for testing
  public static void main( String[] args )
  {
 
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
       
      System.out.println( curtis );
   

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      

         
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("SuperArray now has a length of: " + curtis._size);
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);

      }
  }//end main()


}//end class
