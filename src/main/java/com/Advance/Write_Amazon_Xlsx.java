package com.Advance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Amazon_Xlsx {
	public static void writeData(String sheet, int row, int cell,String value) throws IOException {
		File f = new File("C:\\Users\\ANBU\\Desktop\\FaceBook.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		w.close();
		}

}
