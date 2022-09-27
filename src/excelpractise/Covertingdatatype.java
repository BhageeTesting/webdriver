package excelpractise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Covertingdatatype {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi=new FileInputStream("F:\\firstclass\\WebDriver\\Film.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws= wb.getSheet("sheet1");
		int rc= ws.getLastRowNum();
		
		//iterate 
		for (int i = 1; i <=rc; i++) {
			String name=wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
			if (wb.getSheet("sheet1").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC) {
				int data=(int) wb.getSheet("sheet1").getRow(i).getCell(1).getNumericCellValue();
				String cell=String.valueOf(data);
				System.out.println(name+"   "+cell);
				}
			
		}
		fi.close();
		wb.close();
		
		
		

	}

}
