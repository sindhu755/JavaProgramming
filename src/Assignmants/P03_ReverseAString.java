package Assignmants;

public class P03_ReverseAString {

	public static void main(String[] args) {
		
		
		//approach1
		String s="welcome";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
//			char ch=s.charAt(i);
//			rev=rev+ch;
			rev=rev+s.charAt(i);
		
		}
		System.out.println(rev); 
		
		
		//approach2 -without using string methods  -  by converting string to char array type
		/*char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		*/
		
		//Approach3
		/*StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());
		*/
		
		//approach4
//		StringBuilder s=new StringBuilder("welcome");
//		System.out.println(s.reverse());

		
		
		
		
		
		
		
		

	}

}
