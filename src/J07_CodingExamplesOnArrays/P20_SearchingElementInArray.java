package J07_CodingExamplesOnArrays;

public class P20_SearchingElementInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int element=7;
		boolean status=false;
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("element found:"+a[i]);
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("element not fount");
		}
		*/
		
		for(int x:a)
		{
			if(x==element)
			{
				System.out.println("element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("element not found");
		}
		
		
		
		
	}

}
