package Assignmants;

public class P48_PrintTriangleNumbers {

	public static void main(String[] args) {
		
		//Write a Java program to print the triangle of numbers? 
		
				int rows=5;
				
				for(int i=1;i<=rows;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(j+" ");
					}
					System.out.println();
				}
	}

}
