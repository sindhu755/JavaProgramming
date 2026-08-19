package Assignmants;

public class P14_SumofElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7};
		int sum=0;
		
		
		//normal for loop
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i]; 
			
		}
		System.out.println(sum);
		*/
		
		
		//enhanced for loop
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println(sum);
	}

}
