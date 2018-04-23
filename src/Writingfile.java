import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Writingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//
		File file=new File("D:/udemy prac/filewriting/textfilewritingraman.csv");
		
		FileWriter fw =new FileWriter(file,false);
		BufferedWriter bufferedwriter=new BufferedWriter(fw);
		for (int i=0;i<4;i++)
			
		{
			for (int j=0;j<3;j++)
			{
				int num = (int) (Math.random()*100);
				bufferedwriter.write(num + "," );
			}
			bufferedwriter.newLine();
		}
		
//		bufferedwriter.newLine();
//		bufferedwriter.write("First line");
//		bufferedwriter.newLine();
//
//		bufferedwriter.write("second  line");
//		bufferedwriter.newLine();
//		bufferedwriter.write("Automation");
//		bufferedwriter.newLine();
//		bufferedwriter.write("Selenium");
		bufferedwriter.close();
		
	}

}
