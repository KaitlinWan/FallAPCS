public class BigSib{
    public static String helloMsg;

    public void setHelloMsg(String newMsg){
	
	helloMsg = newMsg;

    }
    
    public String greeting(String name){

	String newString;
	
	newString = "Hello there, ";
	newString += name;
	newString += ". How do you do?";

	return newString;

    } 


}
