package Lab4;
import java.util.*;
import java.io.File;
public class lab4_2 {
	
	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:\\Users\\Harshit.6.Gupta\\git\\repository\\jan2026\\src\\test\\java\\pack1\\numbers.txt"));
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			int num = sc.nextInt();
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}

	}

}
