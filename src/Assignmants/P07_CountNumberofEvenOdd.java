package Assignmants;

public class P07_CountNumberofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=68794;
		int even_count=0;
		int odd_count=0;
		
		
		while(num>0) //1234 123 12 1
		{
			int rem=num%10; //4  3  2  1
			
			if(rem%2==0)
			{
				even_count++; // 1  2  3
				System.out.println("even number:"+rem);
			}
			else
			{
				odd_count++; //1  2  
				System.out.println("odd number:"+rem);
			}
			num=num/10; //123  12  1  0
			
		}
		System.out.println();
		System.out.println("even count:"+even_count);
		System.out.println("odd count:"+odd_count);
		
		
			
		

	}

}
