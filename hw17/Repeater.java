
public class Repeater {

	public static void main(String[] args) {
		
		System.out.println(fenceW(1));
		System.out.println(fenceW(10));
		
		System.out.println(fenceR(1));
		System.out.println(fenceR(12));   }
	
	public static String fenceW(int numPosts){
		String builtFence = "";
		String oneFence = "|--";
		while(numPosts > 1){
			rtString += oneFence;
			numPosts = numPosts - 1; }
		
		builtFence += "|";
		return builtFence;	}

	public static String fenceR(int numPosts){
		String fence = "";
		String oneFence = "|--";
		if(numPosts > 1){
			fence += oneFence;
			numPosts = numPosts - 1;
			fenceR(numPosts);	}
		else{
			fence += "|";  }
		return fence;
}}
