package test;

import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String args[]) {
		// Using try-with-resources
		try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\SHREEVATSA\\workspace - 1\\abc.txt")) {
			String msg = "TRying the try resource";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
