package excelpractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Specificcell {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi= new FileInputStream("F:\\class.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Marks");
		//XSSFRow row= ws.getRow(1);
		int rc= ws.getLastRowNum();
		System.out.println("number of rows are:  "+rc);
		for (int i = 1; i <=rc; i++) {
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			String pass=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"    "+pass);
			//ws.getRow(i).createCell(2).setCellValue("Pass");
			ws.getRow(i).createCell(2).setCellValue("Fail");
			XSSFCellStyle style=wb.createCellStyle();
			XSSFFont font=wb.createFont();
			//colour text
//			font.setColor(IndexedColors.DARK_GREEN.getIndex());
			font.setColor(IndexedColors.RED.getIndex());
			//set bold
			font.setBold(true);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
			ws.getRow(i).getCell(2).setCellStyle(style);
		}
		fi.close();
		FileOutputStream fo= new FileOutputStream("F:\\Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		
		
		
		

	}

}
