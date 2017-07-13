package neel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {

	public static void main(String args[]) {
		//BufferedReader fileinputstream1 = null;
		//BufferedWriter fileoutputstream = null;
		// FileInputStream fileinputstream=null;
		// FileOutputStream fileoutputstream = null;
		try (BufferedReader fileinputstream1 = new BufferedReader(new FileReader("D:/inputFile.txt"));
			BufferedWriter fileoutputstream = new BufferedWriter(new FileWriter("D:/outputFile.txt"))){
			//fileinputstream = new BufferedReader(new FileReader("D:/inputFile.txt"));
			//fileoutputstream = new BufferedWriter(new FileWriter("D:/outputFile.txt"));
			String str = null;
			while ((str = fileinputstream1.readLine()) != null) {
				fileoutputstream.write(str);
				System.out.println(str);
			}
			/*
			 * try { while (fileinputstream.read() != -1) {
			 * fileoutputstream.write(fileinputstream.read());
			 * System.out.println(fileinputstream.read());
			 * System.out.println((char)fileinputstream.read()); }
			 */

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
		/*
		 * finally { if (fileoutputstream != null) { try { fileoutputstream.close(); }
		 * catch (IOException e) { e.printStackTrace(); } } if (fileoutputstream !=
		 * null) { try { fileoutputstream.close(); } catch (IOException e) {
		 * e.printStackTrace(); } }
		 * 
		 * }
		 */
	}

}
