package Assignmants;

public class P17_MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,6,9,7,10};
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}
		System.out.println("elements in an array:"+sum1);
		
		int sum2=0;
		
		for(int i=0;i<=10;i++)
		{
			sum2=sum2+i;
			
		}
		System.out.println("elements in a range:"+sum2);
		
		System.out.println("missing element in an array:"+(sum2-sum1));
	}

}
