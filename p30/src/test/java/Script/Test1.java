package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;

public class Test1  extends Basetest{

	@Test
	public void TestA()
	{
		String u = getvalue("URL");
		Reporter.log(u,true);
		
	String title = driver.getTitle();
	Reporter.log(title,true);
	
	String v1 = Excel.getdata("./data/book.xlsx","sheet1", 0, 0);
	Reporter.log(v1,true);
	
	String v2 = Excel.getdata("./data/book.xlsx","sheet3", 1, "PassWord");
	Reporter.log(v2,true);
	
	}
}
