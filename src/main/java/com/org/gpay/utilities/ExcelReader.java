package com.org.gpay.utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelReader {
    public String path=null;
    public FileInputStream fis=null;
    public FileOutputStream fileOut =null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row   =null;
    private XSSFCell cell = null;

    public ExcelReader(String path) {

        this.path = path;
        try {
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
            fis.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public String[][] readExcel()
    {
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowCount][colCount];

        for (int i = 1; i <= rowCount; i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                cell = row.getCell(j);
                if (cell == null) {
                    data[i-1][j] = "";
                } else {
                    data[i-1][j] = cell.getStringCellValue();
                }
            }
        }
        return data;
    }
}
