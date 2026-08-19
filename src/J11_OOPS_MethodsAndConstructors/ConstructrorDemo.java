package J11_OOPS_MethodsAndConstructors;

public class ConstructrorDemo {

	int x,y;
	
	ConstructrorDemo()  //default constructor
	{
		x=100;
		y=200;
	}
	
	ConstructrorDemo(int a,int b)  //parameterized constructor 
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructrorDemo con=new ConstructrorDemo();
		con.sum();
//		ConstructrorDemo con=new ConstructrorDemo(10,20);
//		con.sum();
		
		

	}

}
