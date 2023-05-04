package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data {

	public static String data(String sh,int r,int c)
	{
		String value=null;
		try {
			FileInputStream fis=new FileInputStream("./exel/fb_data.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet(sh);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			value=cell.toString();
			
			
		} catch (Exception e) {

			System.out.println(e);
		}
		return value;
	}
	
}
