package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel1 {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("CreateCustomer").getRow(1).getCell(2).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("./Data/testscript.xlsx");
		wb.write(fos);
		wb.close();

}
	}
