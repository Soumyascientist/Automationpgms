package genericUtility;



import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDataFromExcel(String SheetName,int rowNum,int cellNum) throws Throwable{
		FileInputStream fise = new FileInputStream("D:\\Roh\\SwagLabs_Maven_HybridFrameWorks\\src\\test\\java\\Tdf.xlsx");
		return WorkbookFactory.create(fise).getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
//		Workbook wb = WorkbookFactory.create(fise);
//		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}

}

