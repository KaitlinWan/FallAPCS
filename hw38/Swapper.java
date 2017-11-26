import cs1.Keyboard; 
/*
 * Kaitlin Wan
 * APCS PD2
 * HW38: Put It Together
 * 2017-11-22
 */

public class Swapper{

    String[] words = {"cat","dog","rat","bat","cow","hog","fox","bee","pug"};
    String[][] excel = new int[3][3];

    for (int i = 0; i < words.length; i++){
	for(int r = 0; r < words.length(); r++){
	    for(int c = 0; c < words[c].length(); c++){
		int[r][c] = words[i];	
	    }
	}
    }

    public void change(int row, int col, int row2, int col2){
	int HoldA = excel[row][col];
	int HoldB = excel[row2][col2];


	excel[row][col] = HoldB;
	excel[row2][rowp = HoldA;
		    

		    }
    }
    
    
    public static void main(String[] args){
	Keyboard kee = new Keyboard();


    }

}
