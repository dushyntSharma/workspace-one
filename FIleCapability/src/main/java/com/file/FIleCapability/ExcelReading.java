package com.file.FIleCapability;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	public 

		File file = new File(
				"C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\FIleCapability\\src\\main\\java\\com\\file\\FIleCapability\\reading.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		TreeSet<String> s = new TreeSet<String>();

		Iterator<Row> rowIt = sheet.iterator();

		while (rowIt.hasNext()) {
			Row row = rowIt.next();

			Iterator<Cell> cell = row.cellIterator();
			while (cell.hasNext()) {
				Cell c = cell.next();
				
			}

		}

	}


