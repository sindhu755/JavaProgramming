package J06_Single_and_TwoDimentionalArray;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Appraoch1
//		int a[]=new int[5];  //declaring an array
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
		
		//appraoch2
		int a[]= {100,200,300,400,500};
//		int a[]= {};
		
		//finding length of an array
		System.out.println("length of an array:"+a.length);
		
		//read single value from an array
		System.out.println(a[4]);
		
		//reading all the values from an array
		
		//normal for loop
//		for(int i=0;i<a.length;i++)  //i<=4  i<5  i<=a.length-1
//		{
//			System.out.println(a[i]);
//		}
		
		//enhanced for loop/for each loop
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
