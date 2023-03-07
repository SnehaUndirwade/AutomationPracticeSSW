package PRACTICE3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExccelProgram3 
{
public static void main(String[] args) throws IOException 
{
	String path ="H:\\aTESTING CLASSES\\PracticeEccel.xlsx";
	FileInputStream file = new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
//	String CellData = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	
	//for loop
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	for (int i = 1; i<5; i++)
	{
		for (int j= 0; j<2; j++)
		{
//			XSSFRow row = sheet.getRow(i);
//			XSSFCell cell = row.getCell(j);
//			String cellData = cell.getStringCellValue();
//			System.out.println(cellData);
					
			
			String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(cellData);
		}
	}
	
}
}
