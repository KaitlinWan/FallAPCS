//Kaitlin Wan
//APCS PD3
//HW15 - HARD COIN PROBLEM :(
//2017-10-12

public class Coin {
	// Attributes
	private int value;
	private String upFace;
	private String name;
	private int flipCtr;
	private int headsCtr;
	private int tailsCtr;
	private double bias; //1.0 for heads all 0.0 for tails all
	
	//METHODS!
	
	//default constructor!
	//GOES TO NEXT CONSTRUCTOR
	public Coin(){
		this(randomCoin());
	}
	
	//GOES TO NEXT CONSTRUCTOR
	public Coin(String denom){
		this(denom,randomFace()); 
		name = denom;
	}
	
	//TOP TIER CONSTRUCTOR
	public Coin(String demon, String face){
		name = demon;
		upFace = face;
		assignValue();
		double var = Math.floor(Math.random()*11);
		bias = var;
	}
	
	public static String randomCoin(){
		double var = Math.floor(Math.random()*10);
		
		String newCoin = "";
		if(var == 0.0){
			newCoin = "penny";
		}
		else if(var == 1.0){
			newCoin = "nickel";
		}
		else if(var == 2.0){
			newCoin = "dime";
		}
		else if(var == 3.0){
			newCoin = "quarter";
		}
		else if(var == 4.0){
			newCoin = "dollar";
		}
		else{
			newCoin = randomCoin();
		}
		
		return newCoin;
	}
	
	public static String randomFace(){
		double var = Math.floor(Math.random()*10);
		String str = "";
		if(var > 5){
			str = "heads";
		}
		else {
			str = "tails";
		}
		return str;
	}
		
	
	//SIMULATES THE FLIP!
	//PreCondition: NONE
	//PostCondition: Given heads or tails
	public String flip(){
		String str = "";
		double biasNum = Math.floor(Math.random() *11);
		if(bias >= 10){
			str = "heads";
		}
		else if (bias == 0){
			str = "tails";
		}
		else if(biasNum > bias){
			str = "heads";
		}
		else if(biasNum < bias){
			str = "tails";
		}
		else{
			flip();
		}
		
		return str;
	}
	

	
	public boolean equals(Coin given){
		if(this.upFace == given.upFace){
			return true;
			}
		else{
		return false;}
		}
	
	public void assignValue() {
		if(name == "penny"){
			value = 1;
		}
		else if(name == "nickel"){
			value = 5;
		}
		else if(name == "dime"){
			value = 10;
		}
		else if(name == "quarter"){
			value = 25;
		}
		else if(name == "dollar"){
			value = 100;
		}
		else{
			value = 999;
		}
	}
	
	
	public String toString() {
		
		String rtString = "";
		rtString += name;
		rtString += " with " + upFace;
		return rtString;
		
	}
	
}
