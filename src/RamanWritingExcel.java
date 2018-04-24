import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
	/*	Row row0=sheet0.createRow(0);
	Cell cellA= row0.createCell(0);
	Cell cellB= row0.createCell(1);

	cellA.setCellValue("first cell");
	cellB.setCellValue("second cell");
	
	*/
	

	for (int rows=0;rows<10;rows++)
	{
		Row row=sheet0.createRow(rows);

		for (int col=0;col<10;col++)
		{
			Cell cell=row.createCell(col);
			cell.setCellValue((int)(Math.random()*100));
			
		}
		
	}
	File file =new File("D:\\automationXpath\\ramanpracticewrite.xlsx");
	FileOutputStream fo= new FileOutputStream(file);
	wb.write(fo);
	System.out.println("file created");
	fo.close();
	}

}
