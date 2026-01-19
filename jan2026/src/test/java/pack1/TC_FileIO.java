package pack1;
 
import java.io.FileInputStream;
import java.io.IOException;
 
public class TC_FileIO {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Harshit.6.Gupta\\git\\repository\\jan2026\\src\\test\\java\\pack1\\read.txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.println((char)data);
		}
		
		fis.close();
		
 
	}
 
}
 