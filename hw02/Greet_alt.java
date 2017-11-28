public class Greet_alt {
   public static void main(String[] args) {
      double Test = Math.random();
      Test = Test * 10;
      if(Test <= 3){
         greet("Kaitlin");}
      else if( Test <= 5){
         greet("Jake");}
      else {
         greet("Caleb");}
    }
    static void greet(String args){
       System.out.println("Hello! " + args + " How are you! <3");
    }
   }