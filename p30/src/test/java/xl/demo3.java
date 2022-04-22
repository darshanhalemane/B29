package xl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;
import org.testng.annotations.Test;

public class demo3 {
	@Test
	public void testA() throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book.xlsx"));
		CellType s = wb.getSheet("sheet2").getRow(0).getCell(0).getCellType();
	System.out.println(s);
	String s1 = wb.getSheet("sheet2").getRow(0).getCell(0).toString();
	System.out.println(s1);
	String s2 = wb.getSheet("sheet2").getRow(1).getCell(1).toString();
	System.out.println(s2);
	
		wb.close();
}
}