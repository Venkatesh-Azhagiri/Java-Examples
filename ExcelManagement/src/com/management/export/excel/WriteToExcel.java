package com.management.export.excel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.management.excel.model.ModelSheet1;
public class WriteToExcel {
	
	public int generateUpdatedExcel(String action, Object modelSheet){
		
		if(action.equalsIgnoreCase("sheet1")){
			try {
			ModelSheet1  modelSheet1 = (ModelSheet1)modelSheet;
			InputStream inp = null;
			
				inp = new FileInputStream("wb.xls");
			
			Workbook wb = null;
			
				wb = WorkbookFactory.create(inp);
			
			 //Workbook wb = WorkbookFactory.create(inp);
		    Sheet sheet = wb.getSheetAt(1);
		    Row row = sheet.getRow(1);
		    Cell cell = row.getCell(0);
		    String cellContents = cell.getStringCellValue();
		    
		    //Modify the cellContents here
		    // Write the output to a file
		    cell.setCellValue(cellContents); 
		    FileOutputStream fileOut = new FileOutputStream("D:\\excel.xls");
		    wb.write(fileOut);
		    fileOut.close();			
		
		}catch(Exception e){
			System.out.println("test");
		}
		
	}
		return 0;
	}
}
