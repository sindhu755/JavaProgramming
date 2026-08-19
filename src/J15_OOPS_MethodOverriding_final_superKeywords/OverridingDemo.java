package J15_OOPS_MethodOverriding_final_superKeywords;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 11.5;
	}
}


public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICI obj1=new ICICI();
		System.out.println(obj1.roi());
		
		SBI obj2=new SBI();
		System.out.println(obj2.roi());
		

	}

}
