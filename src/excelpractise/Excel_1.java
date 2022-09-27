package excelpractise;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_1 {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi=new FileInputStream("F:\\Sai.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheet("Login");
		XSSFRow row= sh.getRow(0);
		int  rc=sh.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println("no.of rows are:"+rc);
		System.out.println("no of cells are::"+cc);
		fi.close();
		wb.close();
		
		
		
		
		
		
		
		
		

	}

}
