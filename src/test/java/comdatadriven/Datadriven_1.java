package comdatadriven;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	public class Datadriven_1 {
		
	
			public static void main(String[] args) throws IOException {
			
			File fs=new File("C:\\Users\\SING\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
			FileInputStream fis=new FileInputStream (fs);
			
			Workbook wb = new XSSFWorkbook(fis);
			
				Sheet sheet = wb.getSheet("sheet1");
				 Row row = sheet.getRow(2);
				 
				  Cell cell = row.getCell(1);
				  CellType ct = cell.getCellType();
				 
				  if (ct.equals(CellType.STRING))
				     {
				
				    	 String scv = cell.getStringCellValue();
				    	System.out.println(scv); 
				    	 
                      }
				     else if(ct.equals(CellType.NUMERIC))
				     {
				    	 double ncv = cell.getNumericCellValue();
				    	 
						
						int val= (int) ncv;
						System.out.println(val);
				    	 
				     }
			}

	}



