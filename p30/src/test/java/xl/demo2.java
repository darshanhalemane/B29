package xl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class demo2 {
	@Test
	public void testA() throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book.xlsx"));
		 String s = wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		
		System.out.println(s);
		wb.close();
		
	}
}
