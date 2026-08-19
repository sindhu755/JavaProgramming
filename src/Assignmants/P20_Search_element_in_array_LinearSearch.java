package Assignmants;

public class P20_Search_element_in_array_LinearSearch {
	
	public static void main(String[] args)
	{
		
		int a[]= {1,3,6,2,9,5,8};
		
		int element=33;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			if(element==a[i])
			{
				System.out.println("element found:"+a[i]);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("element not found");
		}
		
		
		
	}

}
