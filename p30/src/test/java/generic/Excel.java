package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getdata(String path,String sheet,int r,int c )  {
		String value="";
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		 value = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		wb.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		return value;
	}
public static String getdata(String path,String sheet,int row,String colname)
{
	
	LinkedHashMap<String,String>map=new LinkedHashMap<String, String>();
	try {
	Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	short cc = wb.getSheet(sheet).getRow(0).getLastCellNum();
	 for(int i=0;i<cc;i++)
	 {
	  String r = wb.getSheet(sheet).getRow(0).getCell(i).toString();
	 String c = wb.getSheet(sheet).getRow(row).getCell(i).toString();
	 map.put(r, c);
	
	 }
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
	
	String c = map.get(colname);
	return c;
	 
}
}
