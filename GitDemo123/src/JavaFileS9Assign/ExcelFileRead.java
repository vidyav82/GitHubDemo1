package JavaFileS9Assign;

//import java.io.File;
//import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadFromExcel("C:\\Users\\vasud\\Desktop\\Test12.xls");
				
	}
	
	public static void ReadFromExcel(String filename) {
		try {
		
			
			FileInputStream fileob = new FileInputStream(filename);
		
			HSSFWorkbook myExcelBook = new HSSFWorkbook(fileob);
		
			HSSFSheet myExcelsheet = myExcelBook.getSheet("Expenses");
			HSSFRow row1 = myExcelsheet.getRow(0);
			HSSFRow row2 = myExcelsheet.getRow(1);
			HSSFRow row3 = myExcelsheet.getRow(2);
			
			
			if(row1.getCell(0).getCellType()==HSSFCell.CELL_TYPE_STRING)
			{
				String ExpenseType = row1.getCell(0).getStringCellValue();
				System.out.print(" "+ExpenseType);
				double ExpenseAmt = row1.getCell(1).getNumericCellValue();
				System.out.print(" "+ExpenseAmt);
				System.out.println();
			}
			
			if(row2.getCell(0).getCellType()==HSSFCell.CELL_TYPE_STRING)
			{
				String ExpenseType = row2.getCell(0).getStringCellValue();
				System.out.print(" "+ExpenseType);
				double ExpenseAmt = row2.getCell(1).getNumericCellValue();
				System.out.print(" "+ExpenseAmt);
				System.out.println();
			}
			

			if(row3.getCell(0).getCellType()==HSSFCell.CELL_TYPE_STRING)
			{
				String ExpenseType = row3.getCell(0).getStringCellValue();
				System.out.print(" "+ExpenseType);
				double ExpenseAmt = row3.getCell(1).getNumericCellValue();
				System.out.print(" "+ExpenseAmt);
				System.out.println();
			}
			myExcelBook.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
