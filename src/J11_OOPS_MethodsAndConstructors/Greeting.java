package J11_OOPS_MethodsAndConstructors;

public class Greeting {

	
	//no params no return value
	void m1()
	{
		System.out.println("hello");
	}
	
	//no parama return value
	String m2()
	{
		return "hello how are you!!";
	}
	
	//taking params no return value
	void m3(String name)
	{
		System.out.println("hello "+name);
	}
	
	//taking params return value
	String m4(String name)
	{
		return "hello "+name;
	}
}
