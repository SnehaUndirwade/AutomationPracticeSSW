package PRACTICE3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EccelProgram 
{
	public static void main(String[] args) throws IOException 
	{
		String path = "H:\\aTESTING CLASSES\\PracticeEccel.xlsx";
						//path of exccel file
		FileInputStream file = new FileInputStream(path);
					//Reading the Exccel file
		XSSFWorkbook workbook = new XSSFWorkbook(file);
						//Reading the workbook
		XSSFSheet sheet = workbook.getSheet("Sheet1");
						//reading the sheet
		XSSFRow row = sheet.getRow(1);
							//Reading the row
		XSSFCell cell = row.getCell(0);
							//Reading the cell
		String Value = cell.getStringCellValue();
						//reading the cell Value
		System.out.println(Value);
		


	}
	
}
