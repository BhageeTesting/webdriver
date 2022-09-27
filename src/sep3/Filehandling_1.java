package sep3;

import java.io.*;



public class Filehandling_1 {

	public static void main(String[] args) throws Throwable {
		// File handling
	/*	File f= new File("F://selenium.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Hello World .");
		bw.newLine();
		bw.write("I am Chitti... ");
		bw.newLine();
		bw.write("The Robot");
		bw.flush();
		bw.close(); */
		
		//read specific text from folder
	//	File f=new File("F://selenium.txt");
		FileReader fr=new FileReader("F://selenium.txt");
		BufferedReader br= new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(3000);
			System.out.println(str);
			
		}
		br.close();
		

	}

}
