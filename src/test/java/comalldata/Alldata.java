package comalldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alldata {
	
	public static void main(String[] args) throws IOException {
		
		
		File fs=new File("C:\\Users\\SING\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
		FileInputStream fis=new FileInputStream (fs);
		
		Workbook wb=new XSSFWorkbook (fis);
		
		Sheet st = wb.getSheet("sheet1");
		int pnr = st.getPhysicalNumberOfRows();
		for(int i=0;i<pnr;i++)
		{
		 Row row = st.getRow(i);           
		
		   int pnc = row.getPhysicalNumberOfCells();
		for (int j=0;j<pnc;j++)
		{
		 Cell cell = row.getCell(j);
		
		 CellType ct = cell.getCellType();
		if(ct.equals(CellType.STRING))
		{
			String scv = cell.getStringCellValue();
			System.out.println(scv);
		}
		if(ct.equals(CellType.NUMERIC))
		{
			double ncv = cell.getNumericCellValue();
			System.out.println(ncv);
		}
		
		}
		}
		
	}
	
	

}
 