package J20_Collections;

import java.util.HashMap;

//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//
//public class HashMapDemo {
//
//	public static void main(String[] args) {
//
//
//		//declaration;
//		//HashMap hm=new HashMap();
//		//Map hm=new HashMap();
//		
//		HashMap <Integer,String> hm=new HashMap<Integer,String>();
//		
//		//adding pairs
//		hm.put(101, "john");
//		hm.put(102, "scott");
//		hm.put(103, "mary");
//		hm.put(104, "scott");
//		hm.put(102, "david");
//		
//		//printing pairs
//		System.out.println(hm);  //{101=john, 102=david, 103=mary, 104=scott}
//		
//		System.out.println(hm.size());  //4
//		
//		//remove pair
//		hm.remove(103);
//		System.out.println("after removing pair:"+hm);  //{101=john, 102=david, 104=scott}
//		
//		//access value of particular key
//		System.out.println(hm.get(102));  //david
//		
//		//get all the keys from hashmap
//		System.out.println(hm.keySet());  //[101, 102, 104]
//		
//		//get all the values
//		System.out.println(hm.values());  //[john, david, scott]
//		
//		//get all the keys and values3666
//		System.out.println(hm.entrySet());  //[101=john, 102=david, 104=scott]
//		
//
//		//reading data from hashmap
//		
//		//using for each loop
//		/*for(int k:hm.keySet())
//		{
//			System.out.println(k+"   "+hm.get(k));
//		}
//		*/
//		
//		//using iterator
//		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
//		
//		while(it.hasNext())
//		{
//			
//			Entry<Integer,String> entry=it.next();
//			System.out.println(entry.getKey()+"   "+entry.getValue());
//		}
//		
//		hm.clear();
//		System.out.println(hm.isEmpty());
//	}
//
//}

public class HashMapDeno {
	
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		
		hm.put(101, "john");
		hm.put(102, "don");
		hm.put(103, "scott");
		hm.put(104, "david");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		System.out.println(hm.remove(104));
		System.out.println(hm);
		
		System.out.println(hm.get(103));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.isEmpty());
		
		for(Object k:hm.keySet())
		{
			System.out.println(k+""+hm.get(k));
		}
		
	}
}
























