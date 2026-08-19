package J13_OOPS_ThisAndStaticKeywords;

public class ThisKeyword {
	
	
	int x,y;
	
	ThisKeyword(int x, int y)  //constructor
	{
		this.x=x;
		this.y=y;
	} 
	
	/*void setData(int x, int y)  //method
	{
		this.x=x;
		this.y=y;
	} */
	
	
	void prinntData()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword th=new ThisKeyword(10,20);  //constructor
		th.prinntData();
		
		/*ThisKeyword th=new ThisKeyword();  //object creation
		
		th.setData(10,20);  //method
		th.prinntData();*/

	}

}
