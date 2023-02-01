package workingWithTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PerformDataDrivenTestingWithParallel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readExcel("SeleniumTraining");
	}
	public static String[][] readExcel(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(new File("./src/test/resources/testData/testData.xlsx"));
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getPhysicalNumberOfRows()-1;
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String a[][]=new String[rowcount][cellcount];
		for(int i=0;i<rowcount;i++){
			for(int j=0;j<cellcount;j++){
				a[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return a;
	}

}
