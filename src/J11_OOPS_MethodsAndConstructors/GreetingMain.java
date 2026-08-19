package J11_OOPS_MethodsAndConstructors;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting g=new Greeting();
		g.m1();
		
		String s=g.m2();
		System.out.println(s);
		
		g.m3("scott");
		
		String s1=g.m4("john");
		System.out.println(s1);
	}

}
