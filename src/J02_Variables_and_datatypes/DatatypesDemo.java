package J02_Variables_and_datatypes;

public class DatatypesDemo {

	public static void main(String[] args) 
	{
		//numeric data types
		int a=100, b=200;
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		System.out.println(a+b);
		System.out.println("sum of a and b is:"+(a+b));
		
		byte by=125;
		System.out.println(by);
		
		short sh=2345;
		System.out.println(sh);
		
		long l=1564317678479L;  //literal is needed
		System.out.println(l);
		
		
		//decimal numbers - float and double
		float item_price=15.3F;
		System.out.println(item_price);
		
		double dbl=125.247477;
		System.out.println(dbl);
		
		
		char grade='A';
		System.out.println(grade);
		
		
		String name="sindhu";
		System.out.println(name);
		
//		char ch='ABC'; //invalid
//		String ch='ABC'; //invalid
		
//		String ch='A'; //invalid
		String ch="A";
		System.out.println(ch);
		
		
		boolean bl=true;  //boolean allows only true or false
		System.out.println(bl);
		
//		boolean bl="true"; //invalid
		
//		String b1=true; //invalid
		String b1="true"; //valid
		
		
		
		
		
		

	}

}
