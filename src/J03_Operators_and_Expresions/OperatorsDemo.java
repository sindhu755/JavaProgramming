package J03_Operators_and_Expresions;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arithmetic operators
		int a=20, b=10;
		int result=a+b;
		
		System.out.println(result);
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("diff of a and b is:"+(a-b));
		System.out.println("mul of a and b is:"+(a*b));
		System.out.println("div of a and b is:"+(a/b));
		System.out.println("mod of a and b is:"+(a%b));
		

		//Comparison operators - it will return boolean value -true/false
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		
		System.out.println(a!=b); //true
		System.out.println(a==b); //false
		
		b=20;
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		
		boolean res=a>b;
		System.out.println(res);
		
		
		//logical operators
		//works between two boolean values
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1);  //false
		
		boolean b2=20>10;
		System.out.println(b2);  //true
		
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2);  //true
		
		System.out.println(10<20 && 20>10); //true
		
		
		
		
		
		
		
	}

}
