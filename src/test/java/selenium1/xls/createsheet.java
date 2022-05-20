package selenium1.xls;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createsheet {

	public static void main(String[] args) throws Exception{
		XSSFWorkbook prasad = new XSSFWorkbook();
		XSSFSheet sheet = prasad.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("standard_user");
		sheet.getRow(0).createCell(1).setCellValue("secret_sauce");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("locked_out_user");
		sheet.getRow(1).createCell(1).setCellValue("secret_sauce");
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("problem_user");
		sheet.getRow(2).createCell(1).setCellValue("secret_sauce");
		sheet.createRow(3);
		sheet.getRow(3).createCell(0).setCellValue("performance_glitch_user");
		sheet.getRow(3).createCell(1).setCellValue("secret_sauce");
		File xls = new File("C:\\Users\\durga prasad\\eclipse-workspace\\seleniumi1\\createsheet\\test.xlsx");
		FileOutputStream fos = new FileOutputStream(xls);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for(int i = 0;i<rowcount;i++) {
			XSSFRow row = sheet.createRow(i);
			
		}
		prasad.write(fos);
		prasad.close();
		

	}

}
