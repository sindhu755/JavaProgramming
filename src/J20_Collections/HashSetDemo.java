package J20_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {


		HashSet myset=new HashSet();
		
//		Set myset=new HashSet();
//		HashSet <String>myset=new HashSet<String>();
		
		
		//adding element into hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//printing hashset
		System.out.println(myset);  //[null, A, 100, 10.5, welcome, true]
		
		//size of hashset
		System.out.println(myset.size());  //6
		
		//remove element
		myset.remove(10.5);  // we can not pass an index
		System.out.println(myset);  //[null, A, 100, welcome, true]

		//inserting element - is not possible
		
		//access specific element - is not possible
		
		//convert hashset -> arraylist
		ArrayList al=new ArrayList(myset);
		System.out.println(al);   //[null, A, 100, welcome, true]
		System.out.println(al.get(2));  //100
		
		//read all the elements using for each loop
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//using iterator
		Iterator <Object> it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//clearing all the elements in hashset
		myset.clear();
		
		System.out.println(myset.isEmpty());
		

	}

}
