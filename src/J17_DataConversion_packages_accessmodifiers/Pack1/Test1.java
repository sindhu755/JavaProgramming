package J17_DataConversion_packages_accessmodifiers.Pack1;

public class Test1 {
	
	//Private - we can access only within the class
	/*private int x=100;
	
	private void m1()
	{
		System.out.println("this is m1..");
	}
	*/
	
	
	//default - we can access within the package
	/*int x=100;
	
	void m1()
	{
		System.out.println("this is m1..");
	}
	*/
	
	
	//protected - we can access outside of package also only through inheritance
	/*protected int x=100;
	
	protected void m1()
	{
		System.out.println("this is m1..");
	}
	*/
	
	
	//public - we can access anywhere directly
	public int x=100;
	
	public void m1()
	{
		System.out.println("this is m1..");
	}
}
