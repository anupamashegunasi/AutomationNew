package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet("CreateCustomer").getRow(1).getCell(0).toString();
		System.out.println(value);

}
}
