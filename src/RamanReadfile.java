import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class RamanReadfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Connecting stream
		
		File file=new File("D:\\udemy prac\\filewriting\\textfilereadingraman.xlsx");
		file.createNewFile();

		FileReader fr =new FileReader(file);
		BufferedReader reader=new BufferedReader(fr);
		

String line ="" ;

		while((line= reader.readLine())!=null ) 
		{
		System.out.println(line);
		
		}
//		bufferedread.read();
		

		reader.close();
		
	}

}
