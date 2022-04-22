package xl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo1 {
 public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
	Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book.xlsx"));
	Sheet s = wb.getSheet("sheet1");
	String v = s.getRow(0).getCell(1).getStringCellValue();
	System.out.println(v);
	wb.close();
	
}
}
