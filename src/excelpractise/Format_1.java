package excelpractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Format_1 {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi=new FileInputStream("F:\\class.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Marks");
		int rc=ws.getLastRowNum();
		System.out.println("Number of rows are:  "+rc);
		for (int i = 1; i <= rc; i++) {
			String user= ws.getRow(i).getCell(0).getStringCellValue();
			String pass=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(user+"   "+pass);
			ws.getRow(i).createCell(2).setCellValue("Blocked");
			XSSFCellStyle style=wb.createCellStyle();
			XSSFFont font=wb.createFont();
			font.setColor(IndexedColors.GOLD.getIndex());
			//set bold style
			font.setBold(true);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
			ws.getRow(i).getCell(2).setCellStyle(style);
			
			
		}
		fi.close();
		FileOutputStream fo= new FileOutputStream("F:\\Results.xlsx");
		wb.write(fo);
		
		
		

	}

}
