package Assignmants;

public class P15_PrintEvenorOddfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int even_count=0;
		int odd_count=0;
		
		//normal for loop
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				even_count++;
				System.out.println("even numbers:"+a[i]);
				
			}
		}
			
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				odd_count++;
				System.out.println("odd numbers:"+a[i]);
				
			}
		}
//		System.out.println();
		System.out.println("even count:"+even_count);
		System.out.println("odd count:"+odd_count);
		*/
		
		
		
		
		//for each loop
		for(int x:a)
		{
			if(x%2==0)
			{
				even_count++;
				System.out.println("even number:"+x);
			}
		}
		
		for(int x:a)
			{
				if(x%2!=0)
				{
					odd_count++;
					System.out.println("odd number:"+x);
				}
			}
			System.out.println();
			System.out.println("even count:"+even_count);
			System.out.println("odd count:"+odd_count);
			
		
	
		
	
		

	}

}
