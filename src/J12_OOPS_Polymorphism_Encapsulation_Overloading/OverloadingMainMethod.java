package J12_OOPS_Polymorphism_Encapsulation_Overloading;

public class OverloadingMainMethod {

	
	void main(int a)
	{
		System.out.println(a);
	}
	
	void main(String s)
	{
		System.out.println(s);
	}
	
	void main(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OverloadingMainMethod ov=new OverloadingMainMethod();
		
		ov.main(100);
		ov.main("sindhu");
		ov.main("hello", "john");

	}

}
