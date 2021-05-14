package testtingfile.TestingFileWithJDBC.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Capitals {
	public static void main(String[] args) throws FileNotFoundException // Throws Clause Added
	{
		// ask the user for the search string
		//Scanner keyboard = new Scanner(System.in);
		//System.out.print("Please enter part of the country name: ");
		//String searchString = keyboard.next().toLowerCase();

		// open the data file
		File file = new File(
				"C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\TestingFileWithJDBC\\src\\main\\java\\testtingfile\\TestingFileWithJDBC\\service\\test.txt");

		// create a scanner from the file
		Scanner inputFile = new Scanner(file);

		// set up the scanner to use "," as the delimiter
		inputFile.useDelimiter("[\\r,]");

		// While there is another line to read.
		while (inputFile.hasNext()) {
			// read the 3 parts of the line
			String id = inputFile.next(); // Read country
			String name = inputFile.next(); // Read capital
			String purchase = inputFile.next(); // Read Population
			String sell = inputFile.next();

			// Check if user input is a match and if true print out info.
			List<String> s = new ArrayList<String>();
			s.add(id);
			s.add(name);
			s.add(purchase);
			s.add(sell);
			
			
			//System.out.println(s.toString());
			System.out.println(s.get(0));
			
		}

		// be polite and close the file
		inputFile.close();
	}
}