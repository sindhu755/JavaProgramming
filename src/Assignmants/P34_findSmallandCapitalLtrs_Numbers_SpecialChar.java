package Assignmants;

public class P34_findSmallandCapitalLtrs_Numbers_SpecialChar {

	public static void main(String[] args) {


		//Find the special character, uppercase, lowercase, Number of digits in the given string Program: 

		
				String s = "Hi Welcome To Java Classes Tommorow At 2.00 p.m!!";
				
				int count_small=0, count_capital=0, count_digits=0, count_spc=0;
			
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)>='a'  && s.charAt(i)<='z')
					{
						count_small++;
					}
					
					else if(s.charAt(i)>='A'  && s.charAt(i)<='Z')
					{
						count_capital++;
					}
					
					else if(s.charAt(i)>='0'  && s.charAt(i)<='9')
					{
						count_digits++;
					}
					
					else
					{
						count_spc++;
					}
					
				}
					
				System.out.println("small:"+count_small);
				System.out.println("capital:"+count_capital);
				System.out.println("digits:"+count_digits);
				System.out.println("special:"+count_spc);
				

				
				
//				String s="WelCOme To 12Java @#$%^&*( :; ";
//				
//				int upper=0,lower=0,digit=0,special=0;
//				
//				for(int i=0;i<s.length();i++)
//				{
//					char ch=s.charAt(i);
//					if(Character.isUpperCase(ch))
//					{
//						upper++;
//					}
//					else if(Character.isLowerCase(ch))
//					{
//						lower++;
//					}
//					else if(Character.isDigit(ch))
//					{
//						digit++;
//					}
//					else
//					{
//						special++;
//					}
//				}
//				
//				System.out.println("upper:"+upper);
//				System.out.println("lower:"+lower);
//				System.out.println("digit:"+digit);
//				System.out.println("special:"+special);
//				
				
				
				
				
	}

}
