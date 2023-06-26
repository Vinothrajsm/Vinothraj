package xlxs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class project {
	public static void main(String[] args) throws IOException {
		File excelloc = new File("C:\\Users\\Admin\\eclipse-workspace\\xlxs\\vino\\Book1.xlsx");

		FileInputStream fln = new FileInputStream(excelloc);

		Workbook w = new XSSFWorkbook(fln);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(2);

		Cell c = r.getCell(0);

		System.out.println(c);
		
	int rows=s.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		int cells =r.getPhysicalNumberOfCells();
        System.out.println(cells);
        
        for(int i=0;  i<s.getPhysicalNumberOfRows();  i++) {
        	
        	
        	Row R=s.getRow(i);
        	
        	for(int j=0; j<R.getPhysicalNumberOfCells(); j++) {
        		
            	
        		Cell C1=R.getCell(j);
        	
        	System.out.println(C1);
        }
        }
        
	}
}
