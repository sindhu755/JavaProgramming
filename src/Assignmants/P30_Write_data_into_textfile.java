package Assignmants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P30_Write_data_into_textfile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Automation\\Test123.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("selenium with java");
		bw.write("selenium with python");
		bw.write("selenium with c#");
		
		System.out.println("finished!!!");
		
		bw.close();
		
	
	}

}
