package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriverClass {
	
	        //Identify Test Cases col. by scanning the entire row
			//Once col. is identified then scan entire test case col. to identy that particular row
			//after you grab that particular row  = pull all data of that row and feed into test

	public ArrayList<String> getData(String tesCaseName) throws IOException {
		
		ArrayList<String> a = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Jitendra\\eclipse-workspace\\E2EProject\\src\\main\\java\\excelData\\RahulShettyTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		int sheets = workBook.getNumberOfSheets();
		
		for (int i=0; i<sheets; i++) {
			
			if (workBook.getSheetName(i).equalsIgnoreCase("RegistrationTetData")) {
				
				XSSFSheet sheet = workBook.getSheetAt(i);
				
			     //Identify Test Cases col. by scanning the entire row
				Iterator<Row> rows = 	sheet.rowIterator(); //For Row
				Row firstRow = rows.next(); // Controlled will be on the first row
				
				Iterator<Cell> cell = firstRow.cellIterator();
				 
				int k=0;
				int column=0;	
				
				while (cell.hasNext()) 
				{ // Checks wheather next col is available or not
					
				    Cell value = cell.next(); // Controlled is on 1st col
			     	if(value.getStringCellValue().equalsIgnoreCase("fullName")) 
				      {
					
			     		column=k;	
			     		
				      }
			     	k++;
				}
				System.out.println(column);
				
				//Once col. is identified then scan entire test case col. to identy that particular row
				
				while(rows.hasNext())
				{
					
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(tesCaseName))
					{
						//after you grab that particular row  = pull all data of that row and feed into test
                        Iterator<Cell> cells = r.cellIterator();
                        
                        while(cells.hasNext())
                        {
                        	Cell cv = cells.next();
                        	
                        	if (cv.getCellType()==CellType.STRING)
                        	{
                        		a.add(cv.getStringCellValue());
                        		
                        	}
                        	else {
                        		
                        		a.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
                        	}
                        		
                        }
						
					}
					
					
				}
							
				
			}
			
		}
		return a;
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
	}

}
