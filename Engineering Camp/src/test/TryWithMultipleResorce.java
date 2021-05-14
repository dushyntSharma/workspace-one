package test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithMultipleResorce {
	public static void main(String args[]) {
		
		try (
				FileOutputStream fileOutputStream = new FileOutputStream(
						"C:\\\\Users\\\\SHREEVATSA\\\\workspace - 1\\\\abc.txt");
				InputStream input = new FileInputStream("C:\\\\Users\\\\SHREEVATSA\\\\workspace - 1\\\\abc.txt")) {
			
			String msg = "Hi This is Shreevatsa";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("------------Data written into file--------------");
			System.out.println(msg);

			DataInputStream inst = new DataInputStream(input);
			int data = input.available();

			byte[] byteArray2 = new byte[data]; //
			inst.read(byteArray2);
			String str = new String(byteArray2); // passing byte array into String constructor
			System.out.println("------------Data read from file--------------");
			System.out.println(str); // display file data
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}