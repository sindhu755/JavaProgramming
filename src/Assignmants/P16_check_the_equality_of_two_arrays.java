package Assignmants;

import java.util.Arrays;

public class P16_check_the_equality_of_two_arrays {
	
	 public static void main(String[] args) {
	        
	     int a1[]={1,2,3,4,5};
	     int a2[]={1,2,3,4,5};
	     
	     //boolean status=Arrays.equals(a1,a2);
	     
	    //  if(status==true)
	    //  {
	    //      System.out.println("both are equal");
	    //  }
	    //  else
	    //  {
	    //      System.out.println("both are not equal");
	    //  }
	    
	    boolean status=true;
	    
	    if(a1.length==a2.length)
	    {
	        for(int i=0;i<a1.length;i++)
	        {
	            if(a1[i]!=a2[i])
	            {
	                status=false;
	            }
	        }
	    }
	    else
	    {
	        status=false;
	    }
	    
	    if(status==true)
	    {
	        System.out.println("both are  equal");
	    }
	    else
	    {
	        System.out.println("both are not equal");
	    }
	     
	 
	    
	    
	
	    
	    }

}
