package J19_Upcasting_Downcasting;

public class TypeCastingConcept {

	public static void main(String[] args) {
		
		
		//up casting -> smaller - larger
		
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=12.5f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		
		//down casting -> larger- smaller
		
		long lvalue=10000;
		int ivalue=(int)lvalue;
		System.out.println(ivalue);
		
		double dvalue=1000.0;
		float fvalue=(float)dvalue;
		System.out.println(fvalue);
		

		//example1  - up casting
//		int i=100;
//		double d=i; 
//		System.out.println(d);  //100.0
		
		
		//example2  - down casting
//		double d=100.5;
//		int i=(int)d;
//		System.out.println(i);  //100
	}

}
