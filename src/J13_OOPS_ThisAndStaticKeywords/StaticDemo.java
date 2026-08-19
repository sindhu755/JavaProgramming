package J13_OOPS_ThisAndStaticKeywords;

public class StaticDemo {
	
	static int a=10;  //static variable
	int b=20;  //non static variable
	
	
	static void m1()  //static method
	{
		System.out.println("this is static method");
	}
	
	void m2()  //non static method
	{
		System.out.println("this not a static method");
	}
	
	void m3()  //non static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1) static method can access static stuff directly (without object)
		System.out.println(a);  //static method
		m1(); //static method
		
		//2) static method can access non-static stuff through the object
		StaticDemo sd=new StaticDemo();
		
		System.out.println(sd.b);
		sd.m2();  //non static method
		sd.m3();  //non static method
	}

}
