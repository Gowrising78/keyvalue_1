package comalldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writealldata {
	
	
	public static void main(String[] args) throws IOException {
		
		File fs =new File ("C:\\Users\\SING\\Desktop\\Book2.xlsx");
		FileInputStream fis=new FileInputStream(fs);
		
		Workbook wb=new XSSFWorkbook();

        wb.createSheet("Input").createRow(0).createCell(0).setCellValue("karun");
        wb.getSheet("Input").getRow(0).createCell(1).setCellValue("4567");
		wb.getSheet("Input").createRow(1).createCell(0).setCellValue("Anu");
		wb.getSheet("Input").getRow(1).createCell(1).setCellValue("1234");
		
		FileOutputStream fos=new FileOutputStream(fs);
		wb.write(fos);
		
		System.out.println("Success");
	}

}
