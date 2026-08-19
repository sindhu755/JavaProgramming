
package Assignmants;

import java.util.HashSet;

public class P19_find_duplicate_elemeents_in_array {
	
	
	    public static void main(String[] args) {
	     
	    //  String a[]={"hello","java","java","selenium"};
	     
	    //  boolean flag=false;
	     
	    //  for(int i=0;i<a.length;i++)
	    //  {
	    //      for(int j=i+1;j<a.length;j++)
	    //      {
	    //          if(a[i]==a[j])
	    //          {
	    //              System.out.println("duplicate found:"+a[i]);
	    //              flag=true;
	    //          }
	    //      }
	    //  }
	     
	     
	    //  if(flag==false)
	    //  {
	    //      System.out.println("duplicate not found");
	    //  }
	    
	    
	    String a[]={"hello","java","java","selenium"};
	    
	    HashSet <String>langs=new HashSet();
	    
	    boolean flag=false;
	    
	    for(String l:a)
	    {
	        if(langs.add(l)==false)
	        {
	            System.out.println("found duplicates:"+l);
	            flag=true;
	        }
	    }
	    
	    if(flag==false)
	    {
	        System.out.println("not found dupluicates");
	    }
	     
	     
	     
	     
	     
	     
	    }
	}


