import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;





import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RamanWritingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb= new XSSFWorkbook();

		XSSFSheet sheet0 =wb.createSheet();
		Row row0=sheet0.createRow(0);
	Cell cellA= row0.createCell(0);
	Cell cellB= row0.createCell(1);

	cellA.setCellValue("first cell");
	cellB.setCellValue("first cell");
//Workbook wb =new Workbook(fi);
	
//	Row row0 =sheet0.getRow(0);
//	Cell cellA =row0.getCell(0);
//	System.out.println(cellA);
	
//	for (Row row:sheet0)
//	{
//		for (Cell cell:row)
//		{
//			
//			switch(cell.getCellType())
//			//under switch case
//			{
//				case Cell.CELL_TYPE_STRING:
//					System.out.println(cell.getStringCellValue());	
//			break;
//			case Cell.CELL_TYPE_NUMERIC:
//				System.out.println(cell.getNumericCellValue()+"\t");	
//				break;
//			case Cell.CELL_TYPE_BLANK:
//				System.out.println("Blank Cell" +"\t");	
//				break;
//		}
//		
//			//out of swithc case
//		}
//		//out of inner for loop
//		
//	}
//	
//	//out of outer for loop
//	
//	System.out.println();
//	fi.close();
	}

}
