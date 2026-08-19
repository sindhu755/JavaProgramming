package Assignmants;

public class P18_MaxAndMinElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,6,27,2,9};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum element in a array:"+max);
		

		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
			
		System.out.println("minimum element in an array:"+min);
	}

}
