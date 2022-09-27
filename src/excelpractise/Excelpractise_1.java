package excelpractise;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelpractise_1 {

	public static void main(String[] args)throws Throwable {
		
		FileInputStream fi= new FileInputStream("F:\\class.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("marks");
		XSSFRow row=sh.getRow(0);
		int rc= sh.getLastRowNum();
		int cc= row.getLastCellNum();
		System.out.println("Number of rows are:    "+rc);
		System.out.println("Number of cells are:   "+cc);
		fi.close();
		wb.close();
		
		

	}

}
