package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataRead {
	
	public static void main(String args[]) throws BiffException, IOException, InterruptedException {
		
		FileInputStream m=new FileInputStream("C:\\Selenium Excel Sheet\\ERPTesting.xls");
		Workbook h=Workbook.getWorkbook(m); //Download and upload "jxl file".
		Sheet j=h.getSheet("Sheet4");
		String data=j.getCell(0, 0).getContents();
		System.out.println(data);
	}

}
