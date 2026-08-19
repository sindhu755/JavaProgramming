
package Assignmants;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P29_Read_data_from_text_file {

	public static void main(String[] args) throws IOException {


		//approach1: using FileReader BufferReader
		
//		FileReader fr=new FileReader("C:\\Automation\\Test.txt");
//		
//		BufferedReader br=new BufferedReader(fr);
//		
//		String str;
//		
//		while((str=br.readLine())!=null)
//		{
//			System.out.println(str);
//		}
//		
//		br.close();
		
		
		
		//approach2: using Scanner and File
		
		File file=new File("C:\\Automation\\Test.txt");
		
		Scanner sc=new Scanner(file);
		
		//loop statement
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
		
		//approach3: using Delimiter
		
		/*File file=new File("C:\\Automation\\Test.txt");
		Scanner sc=new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		*/


	}

}
