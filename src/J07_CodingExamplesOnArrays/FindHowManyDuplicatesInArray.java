package J07_CodingExamplesOnArrays;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,5,4,4,3,4};
		
		int element=4;
		int count=0;
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				count++;
			}
			
		}
		System.out.println("count of 4 is:"+count);
		*/
		
		for(int x:a)
		{
			if(x==element)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
