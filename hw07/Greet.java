public class Greet{
    public static void main(String[] args){

	String greeting;
	
	BigSib richard = new BigSib("Word Up");
	BigSib grizz = new BigSib("Hey Ya");
	BigSib dotCom = new BigSib("Sup");
	BigSib trachy = new BigSib("Salutations");
	BigSib mew = new BigSib();

	
	greeting = richard.greet("freshman");
	System.out.println(greeting);

	greeting = grizz.greet("Dr.SpaceMan");
	System.out.println(greeting);

	greeting = dotCom.greet("Kong Foo");
	System.out.println(greeting);


	greeting = trachy.greet("mom");
	System.out.println(greeting);


    }
}

