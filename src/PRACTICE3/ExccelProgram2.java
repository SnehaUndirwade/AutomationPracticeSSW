package PRACTICE3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExccelProgram2 
{
	public static void main(String[] args) throws IOException 
	{
		String Path = "H:\\aTESTING CLASSES\\PracticeEccel.xlsx";
		FileInputStream file = new FileInputStream(Path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
//		XSSFRow row = sheet.getRow(1);
//		XSSFCell cell = row.getCell(0);
//		String value = cell.getStringCellValue();
//		System.out.println(value);
//		
//		XSSFRow row1 = sheet.getRow(2);
//		XSSFCell cell1 = row1.getCell(0);
//		String value1 = cell1.getStringCellValue();
//		System.out.println(value1);
//		
//		XSSFRow row2 = sheet.getRow(3);
//		XSSFCell cell2 = row2.getCell(1);
//		double value2 = cell2.getNumericCellValue();
////		String value2 = cell2.getStringCellValue();
//		System.out.println(value2);
		
		//OR OR OR
		//Method Chaining
		String celldata1 = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(celldata1);
		
		String celldata2 = workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(celldata2);
		
		String celldata3 = workbook.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(celldata3);
		
		String celldata4 = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(celldata4);
		
		String celldata5 = workbook.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(celldata5);
		
		double celldata6 = workbook.getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue();
		System.out.println(celldata6);
		
		String celldata7 = workbook.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		System.out.println(celldata7);
	}
}
