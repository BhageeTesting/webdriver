package practise;

import java.io.*;

public class Fileread {

	public static void main(String[] args)throws Throwable {
		File f=new File("F:\\dot.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(5000);
			System.out.println(str);
			
		}
		

	}

}
