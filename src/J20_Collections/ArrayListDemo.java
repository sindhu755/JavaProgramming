package J20_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		//declaration
		
		ArrayList mylist=new ArrayList();
//		List list=new ArrayList();
//		ArrayList <String>mylist=new ArrayList<String>();
		
		
		//adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add('A');
		mylist.add(null);
		
		//size of arraylist
		System.out.println("size of an arraylist:"+mylist.size());  //8
		
		//print arraylist
		System.out.println("printing data from arraylist:"+mylist);  //[100, 10.5, welcome, true, 100, null, A, null]                                 , A, null]
		
		//remove element from arraylist
		mylist.remove(4);
		System.out.println("after removing element:"+mylist);  //[100, 10.5, welcome, true, null, A, null]
	
		//insert element in the arraylist
		mylist.add(2,"java");
		System.out.println("after insertion:"+mylist);  //[100, 10.5, java, welcome, true, null, A, null]
		
		//modify element in the arraylist (modify/replace/change)
		mylist.set(2, "python");
		System.out.println("after replacing:"+mylist);  //[100, 10.5, python, welcome, true, null, A, null]
	
		//access specific element from arraylist
		System.out.println(mylist.get(3));
		
		
		//reading all the elements from arraylist
		
		//using normal for loop
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		
		//using for each loop
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		
		//using iterator
		Iterator it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//checking arraylist empty or not
		System.out.println("is arraylist empty:"+mylist.isEmpty());
		
		//remove all the elements from arraylist
		ArrayList mylist2=new ArrayList();
		mylist2.add("100");
		mylist2.add("welcome");
		mylist.removeAll(mylist2);
		
		System.out.println("after removing multiple elements:"+mylist);
		
		
		//remove all elements/clear
		mylist.clear();
		System.out.println("is arraylist empty:"+mylist.isEmpty());
		
	}

}



