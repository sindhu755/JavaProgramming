package Assignmants;

import java.util.Arrays;

public class P38_3rdMaximumNumberInArray {

	public static void main(String[] args) {


		//Find the 3 rd maximum Number in an given array Program: 
		
				int a[]={-12,45,-23,64,-100,24}; 
				
				Arrays.sort(a);
				
				System.out.println(Arrays.toString(a));
				
				int n=a.length;
				
				if(n<3)
				{
					System.out.println("array has less than 3 elements");
				}
				else
				{
					int third=a[n-3];
					System.out.println("third largest number is:"+third);
				}
				
				
				
//				int[] arr = {10, 4, 7, 2, 15, 8};
		//
//		        // Sort the array in ascending order
//		        Arrays.sort(arr);
		//
//		        System.out.println(Arrays.toString(arr));
//		        int n = arr.length;
		//
//		        if (n < 3) {
//		            System.out.println("Array has less than 3 elements!");
//		        } else {
//		            int thirdLargest = arr[n - 3]; // 3rd largest element
//		            System.out.println("3rd largest number is: " + thirdLargest);
//		        }
				
				

	}

}
