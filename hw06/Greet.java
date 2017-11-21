public class Greet{
    public static void main(String[] args){

	String greeting;
	
	BigSib richard = new BigSib();
	richard.setHelloMsg("Word Up");
	greeting = richard.greeting("freshman");

	System.out.println(greeting);
	System.out.println(BigSib.helloMsg);

	BigSib kaitlin = new BigSib();
	kaitlin.setHelloMsg("HEEEYYYYY!!");

	greeting = kaitlin.greeting("sophomore");

	System.out.println(greeting);
	System.out.println(BigSib.helloMsg);

	BigSib andrew = new BigSib();
	andrew.setHelloMsg("HOWDY!");

	greeting = andrew.greeting("cool kid");

	System.out.println(greeting);
	System.out.println(BigSib.helloMsg);
	

	BigSib lauren = new BigSib();
	lauren.setHelloMsg("Hi?");
	
	greeting = lauren.greeting("swimmer");
	
	System.out.println(greeting);
	System.out.println(BigSib.helloMsg);

    }
}

