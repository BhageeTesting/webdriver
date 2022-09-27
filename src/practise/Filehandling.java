package practise;

import java.io.*;

public class Filehandling {

	public static void main(String[] args)throws Throwable {
		File f= new File("F:\\dot.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("i am bhageerath");
		bw.newLine();
	bw.write("i am currently looking for job...");
		bw.newLine();
		bw.write("if you have one ....give me one");
		bw.flush();
		bw.close();
		
		
		
		
		

	}

}
