import cs1.Keyboard; 
/*
 * Kaitlin Wan
 * APCS PD2
 * HW38: Put It Together
 * 2017-11-22
 */

public class Swapper{

    String[][] words = {{"cat","dog","rat"},{"bat","cow","hog"},{"fox","bee","pug"}};
   
    /*
    public void fillup(){
    for (int i = 0; i < words.length; i++){
	for(int r = 0; r < words.length(); r++){
	    for(int c = 0; c < words[c].length(); c++){
		int[r][c] = words[i];	
	    }
	}
    }
    }
    */
    public void change(int row, int col, int row2, int col2){
	String HoldA = words[row][col];
	String HoldB = words[row2][col2];


	words[row][col] = HoldB;
	words[row2][row2] = HoldA;
		    
    }

    public void printArray( int[][] a )
    {
		
	for(int[] c : a){
	    for(int x : c){
		System.out.print(x + " ");
	    }
	    System.out.println();
	}
    }

    
    
    
    public static void main(String[] args){
	printArray(words);

    }
}
