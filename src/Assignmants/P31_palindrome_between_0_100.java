package Assignmants;

public class P31_palindrome_between_0_100 {

	public static void main(String[] args) 
	{


			for(int i=1;i<=100;i++)
			{
				int j=0, a=i;
			 
				while(a>0)
				{
					
					j=(j*10)+a%10;
					a=a/10;
				}
				
				if(j==i)
				{
					System.out.println(j);
				}
//				else
//				{
//					System.out.println("not a palindrome:"+j);
//				}
			}
		
			
		
		
	}

}
