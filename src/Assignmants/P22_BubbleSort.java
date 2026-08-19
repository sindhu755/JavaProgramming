package Assignmants;

import java.util.Arrays;

public class P22_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,8,3,9,7};
		
		int n=a.length;
		
		System.out.println("before sorting:"+Arrays.toString(a));
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		System.out.println("before sorting:"+Arrays.toString(a));

		
	}

}
