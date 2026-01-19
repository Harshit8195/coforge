package Lab4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.plaf.synth.SynthProgressBarUI;

public class lab4_1 {
	public static void main(String args[]) throws Exception {
		File file = new File("C:\\Users\\Harshit.6.Gupta\\git\\repository\\jan2026\\src\\test\\java\\pack1\\read.txt");
		FileReader fr = new FileReader(file);
		StringBuilder sb = new StringBuilder();
		int ch;
		while((ch=fr.read())!= -1) {
			sb.append((char)ch);
		}
		fr.close();
		sb.reverse();
		FileWriter fw = new FileWriter(file);
		fw.write(sb.toString());
		fw.close();
		System.out.println("File content reversed");
		
	}
}
