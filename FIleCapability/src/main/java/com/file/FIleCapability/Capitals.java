package com.file.FIleCapability;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Capitals {
	public static void main(String[] args) throws FileNotFoundException // Throws Clause Added
	{
		// ask the user for the search string
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter part of the country name: ");
		String searchString = keyboard.next().toLowerCase();

		// open the data file
		File file = new File("C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\FIleCapability\\src\\main\\java\\com\\file\\FIleCapability\\test.txt");

		// create a scanner from the file
		Scanner inputFile = new Scanner(file);

		// set up the scanner to use "," as the delimiter
		inputFile.useDelimiter("[\\r,]");

		// While there is another line to read.
		while (inputFile.hasNext()) {
			// read the 3 parts of the line
			String country = inputFile.next(); // Read country
			String capital = inputFile.next(); // Read capital
			String population = inputFile.next(); // Read Population

			// Check if user input is a match and if true print out info.
			List<String> s = new ArrayList<String>();
			s.add(country);
			s.add(capital);
			s.add(population);
			System.out.println(s.toString());
			if (searchString.equals(country)) {
				System.out.println("Yay!");
			} else {
				System.out.println("Fail!");
			}
		}

		// be polite and close the file
		inputFile.close();
	}
}
