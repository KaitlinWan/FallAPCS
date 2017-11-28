//Kaitlin Wan
//APCS1 PD2
//HW13 - STATSDRIVEr
//2017-10-06

public class StatsDriver{


    public static void main(String[] args){
	//MEAN
		System.out.println("Testing MEAN:");
		
		System.out.println("int: 12 14 *should be 13*");
		System.out.println(Stats.mean(12,14));
		System.out.println("");
		
		System.out.println("double: 12.0 14.0 *should be 13.0*");
		System.out.println(Stats.mean(12.0,14.0));
		
		System.out.println("");
		System.out.println("");
		
		//MAX
		System.out.println("Testing MAX:");
		
		System.out.println("int: 12 14 *should be 14*");
		System.out.println(Stats.max(12,14));
		System.out.println("int: 14 12 *should be 14*");
		System.out.println(Stats.max(12,14));
		System.out.println("");
		
		System.out.println("double: 12.0 14.0 *should be 14.0*");
		System.out.println(Stats.max(12.0,14.0));
		System.out.println("double: 14.0 12.0 *should be 14.0*");
		System.out.println(Stats.max(14.0,12.0));
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		
		//geoMean
		System.out.println("Testing GEOMEAN:");
		
		System.out.println("int: 30 6 *should be 18*");
		System.out.println(Stats.geoMean(30,6));
		System.out.println("");
	
		System.out.println("double: 30.0 6.0 *should be 18.0*");
		System.out.println(Stats.geoMean(30.0,6.0));
		
		
	
	}
}
		
		
		
		
