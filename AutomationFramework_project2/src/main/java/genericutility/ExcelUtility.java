package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String getStringDataFromExcel(String sheetname,int row,int colNum) throws EncryptedDocumentException, IOException
	{
		
		 FileInputStream fis = new FileInputStream(".src/test/resources/demowebshop_seleniumframework.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis); 
		 return workbook.getSheet(sheetname).getRow(0).getCell(1).getStringCellValue();
		
	}
	public LocalDateTime getDateFromExcel(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis = new FileInputStream(".src/test/resources/demowebshop_seleniumframework.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis); 
		 return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getLocalDateTimeCellValue();
	}
}
	
//	public NullValue getDataFromExcel()
//	{
//	




//public class ExcelUtility 
//{
//	public String getStringDataFromExcel(String sheetname,int row,int colNum) throws EncryptedDocumentException, IOException
//	{
//		
//		 FileInputStream fis = new FileInputStream(".src/test/resources/demowebshop_seleniumframework.xlsx");
//		 Workbook workbook = WorkbookFactory.create(fis); 
//		return workbook.getSheet(sheetname).getRow(rowNum).getCellComment(ColNum).;
//		
//	}
//	
//}
