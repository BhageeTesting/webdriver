package excelpractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readandwrite {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi= new FileInputStream("F:\\class.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws= wb.getSheet("Marks");
		XSSFRow row= ws.getRow(0);
		int rc =ws.getLastRowNum();
		System.out.println("number of rows are:  "+rc);
		//print each data from subject and marks
		for (int i = 1; i < rc; i++) {
			String subject=ws.getRow(i).getCell(0).getStringCellValue();
			String marks=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(subject+"       "+marks);
			//write data in 3rd coloumn
			ws.getRow(i).createCell(2).setCellValue("pass");
			
		}
		fi.close();
		FileOutputStream fo= new FileOutputStream("F:\\Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		
		
		
		

	}

}
