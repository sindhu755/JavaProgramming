package J07_CodingExamplesOnArrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,200,500,400,300};
		
		Arrays.sort(a);  
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
