package org.example.Util;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel {

    public static String getCellData(String sheetName, int row, int column) throws IOException {
        String value = "";
        FileInputStream fis = new FileInputStream((new File("src/test/resources/TestData.xlsx")));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Row r = sheet.getRow(row);
        Cell c = r.getCell(column);

        value = c.toString();

        workbook.close();
        fis.close();
        return value;
    }
    public static int getTotalRows(String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/test/resources/TestData.xlsx"));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        int totalRows = sheet.getLastRowNum(); // No need to add +1 because we will use 1-based indexing in your test
        workbook.close();
        fis.close();
        return totalRows;
    }

}
