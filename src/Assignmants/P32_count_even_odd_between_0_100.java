package Assignmants;

public class P32_count_even_odd_between_0_100 {

	public static void main(String[] args) {
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number:"+i);
				even++;
			}
			else
			{
				System.out.println("odd number:"+i);
				odd++;
			}
		}
		System.out.println("even count:"+even);
		System.out.println("odd count:"+odd);
		

	}

}
