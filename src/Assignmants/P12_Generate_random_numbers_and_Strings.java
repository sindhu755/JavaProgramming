package Assignmants;

import java.util.Random;

public class P12_Generate_random_numbers_and_Strings {
	
	 public static void main(String[] args) 
	    {
		 
		    //approach1
		    Random rand=new Random();
			
			int rand_int=rand.nextInt(100);
			System.out.println(rand_int);
			
			double rand_dbl=rand.nextDouble();
			System.out.println(rand_dbl);  //range from 0.0 to 1.0
			
			//approach2 - math
			System.out.println(Math.random());
			
			
			//approach3 - Apache common-lang API
			
//			String randNum=RandomStringUtils.randomNumeric(10);
//			System.out.println(randNum);
//			
//			String randStr=RandomStringUtils.randomAlphabetic(10);
//			System.out.println(randStr);
			
		 
	    }
	       
	
	
	

}
