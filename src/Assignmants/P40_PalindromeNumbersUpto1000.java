package Assignmants;

public class P40_PalindromeNumbersUpto1000 {

	public static void main(String[] args) {
		
		
		//Count of the palindrome number Program: 
//		int c = 0; for (int n = 1; n <= 1000; n++) { int a, i = 0, j = 0; a = n; while (a > 0) { i = a % 10; j = (j * 10) + i; a = a / 10; 
//		} if (n == j) { c++; 
//		} 
//		System.out.println(c); 
//
//		
//		}
	
		
		
		int count=0;
		
		for(int i=0;i<=1000;i++)
		{
			int a=i; int rev=0;
			while(a>0)
			{
				rev=rev*10+a%10;
				a=a/10;
			}
			
			if(i==rev)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
	}

}
