package neel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
	public static void main(String args[]) {
		FileInputStream fileinputstream=null;
		FileOutputStream fileoutputstream = null;
		try {
			fileinputstream = new FileInputStream("D:/inputFile.txt");
			fileoutputstream = new FileOutputStream("D:/outputFile.txt");
			try {
				while (fileinputstream.read() != -1) {
					fileoutputstream.write(fileinputstream.read());
					System.out.println(fileinputstream.read());
					System.out.println((char)fileinputstream.read());
				}
			} catch (IOException e) {
				e.printStackTrace();

			} 
		}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		finally {
			if (fileoutputstream != null) {
				try {
					fileoutputstream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileoutputstream != null) {
				try {
					fileoutputstream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
