package com.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class ReadFromExcel {

	public static void ReadDatafromExcel(File fl) throws IOException {

		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");

		int lastrow = sheet.getLastRowNum();
		int lastcell = sheet.getRow(1).getLastCellNum();

		for (int i = 0; i < lastrow; i++) {
			XSSFRow r = sheet.getRow(i);
			System.out.println();
			for (int j = 0; j < lastcell; j++) {
				String c = r.getCell(j).toString();
				System.out.print(c + "       ");
			}
		}

		workbook.close();
		fis.close();

	}

	public static void WriteDatainExcel(File fl) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow r0=sheet.createRow(0);
		XSSFRow r1=sheet.createRow(1);
		
		r0.createCell(0).setCellValue("Rahul");
		r0.createCell(1).setCellValue("Rahul");
		r0.createCell(2).setCellValue("Rahul");
		r1.createCell(0).setCellValue("Rahul");
		r1.createCell(1).setCellValue("Rahul");
		r1.createCell(2).setCellValue("Rahul");
		
		try {
		FileOutputStream fos = new FileOutputStream(fl);
		workbook.write(fos);
		
		fos.close();
		workbook.close();
	
		System.out.println("Writing Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {

		File f1 = new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.ApachePOI\\test.xlsx");
		//ReadDatafromExcel(f1);

		File f2 = new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.ApachePOI\\test2.xlsx");
		WriteDatainExcel(f2);
	}

}
