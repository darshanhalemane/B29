package xl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class demo4 {
	@Test
	public void testA() throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book.xlsx"));    
		wb.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Darshan");
		wb.getSheet("sheet1").createRow(3).createCell(0).setCellValue("bistuvalli");
	    wb.write(new FileOutputStream("./data/book1.xlsx"));
		wb.close();
}
}