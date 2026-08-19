package Assignmants;

import java.util.Arrays;
import java.util.Collections;

public class P23_SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//approach1
		/*int a[]= {4,6,1,3,8};
		
		System.out.println("before sorting:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("after sorting"+Arrays.toString(a)); */
		
		//approach2
		
		/*int a[]= {4,6,1,3,8};
		
		System.out.println("before sorting:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting"+Arrays.toString(a));*/
		
		
		//sort descending/reverse order order
		
//		/ystem.out.println("after sorting:"+Arrays.toString(a));
		
		
		//using for loop and sort method sort in reverse order
		int a[]= {4,6,1,3,8};
		
		System.out.println("before sorting:"+Arrays.toString(a));

		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
			
		}
		

	}

}
