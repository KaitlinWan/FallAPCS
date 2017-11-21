//Kaitlin Wan
//APCS1 pd2
//HW07 - On the Origins of BigSib
//2017-09-26


public class BigSib{
    
    public String helloMsg = "Hello";
    //Inst. variable that is created + will make the helloMsg "Hello"

    public BigSib(String newHello){
	helloMsg = newHello;
	//Takes the given String and makes that the new
	//hello message.

    }
    
    public String greet(String name){

	String newString;
	//New String for me to use for the return in the method
	
	newString = helloMsg;
	newString += " ";
	newString += name;

	return newString;

    } 


}
