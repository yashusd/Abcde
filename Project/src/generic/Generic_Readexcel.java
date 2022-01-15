package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Readexcel {
	
	public static String getData(String sheet,int row,int cell){
		
		String val="";
		
		try{
		FileInputStream fin=new FileInputStream("./excel/test.xlsx");
		Workbook book=WorkbookFactory.create(fin);
		Cell c=book.getSheet(sheet).getRow(row).getCell(cell);
		val=c.getStringCellValue();
		}
		
		catch(Exception e){
			System.out.println("Unable to fetch data");
		}
		
		return val;
		
	}

}
