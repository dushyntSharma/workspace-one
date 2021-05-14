package testtingfile.TestingFileWithJDBC.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import testtingfile.TestingFileWithJDBC.model.Mobile;

public class MobileApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		boolean flag = true;
		List<Mobile> mobiles = new ArrayList<Mobile>();
		int choice = 0;
		do {
			displayMainMenu();
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				List<Mobile> m = addMobiles(mobiles);
				List<String> s3 = checkFile();
				//when you want to show only the particular object
				m.stream().filter(t -> t.getName().equals("samsung")).forEach(t -> System.out.println(t));
//				System.out.println(m.toString());
//				// do something with your ArrayList
				// writing file
				FileWriter writer = new FileWriter(
						"C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\TestingFileWithJDBC\\src\\main\\java\\testtingfile\\TestingFileWithJDBC\\service\\test1.txt");
				for (Mobile m1 : m) {

					writer.write(m1 + System.lineSeparator());
				}
				writer.close();

				break;
			case 2:
//				Scanner s = new Scanner(new File("C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\TestingFileWithJDBC\\src\\main\\java\\testtingfile\\TestingFileWithJDBC\\service\\test.txt"));
//				ArrayList<String> list = new ArrayList<String>();
//				while (s.hasNext()){
//				    list.add(s.next());
//				    System.out.println(s.toString());
//				}
//				s.close();

//				List<String> list = Files.readAllLines(new File("C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\TestingFileWithJDBC\\src\\main\\java\\testtingfile\\TestingFileWithJDBC\\service\\test.txt").toPath(), Charset.defaultCharset() );
//				System.out.println(list);

				Scanner s = new Scanner(new File(
						"C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\TestingFileWithJDBC\\src\\main\\\\java\\testtingfile\\TestingFileWithJDBC\\service\\test.txt"));
				ArrayList<String> list = new ArrayList<String>();
				while (s.hasNext()) {
					list.add(s.next());

				}
				System.out.println(list);
				s.close();
				break;

			case 3:
				List<String> s2 = checkFile();
				System.out.println(s2.toString());
//				s2.forEach(v -> {
//					System.out.println(v);
//				});

//				Mobile mob = new Mobile(s1.get(0), s1.get(1), s1.get(2), s1.get(3));
//				if (s1.get(1).equals(m.get(0).getName())) {
//					System.out.println("equal");
//				} else
//					System.out.println("Not equal");
				break;

			default:
				System.out.println("Invalid choice");
				System.out.println("Try again");

			}

		} while (flag);

	}

	private static List<Mobile> addMobiles(List<Mobile> mobiles) {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter the purchase");
		double purchase = sc.nextDouble();

		System.out.println("Enter the sell");
		double sell = sc.nextDouble();
		Mobile m = new Mobile(id, name, purchase, sell);
		mobiles.add(m);

		return mobiles;
	}

	private static void displayMainMenu() {
		// TODO Auto-generated method stub
		System.out.println("...........Main Menu......");
		System.out.println("1.Add Mobiles to the System");
		System.out.println("2.Sort Mobiles based on Model");
		System.out.println("3.Update Price of Mobile");
		System.out.println("4.Delete Mobile from the System");
		System.out.println("5.Exit");

	}

	public static List<String> checkFile() throws FileNotFoundException {

		// ask the user for the search string
		// Scanner keyboard = new Scanner(System.in);
		// System.out.print("Please enter part of the country name: ");
		// String searchString = keyboard.next().toLowerCase();

		// open the data file
		File file = new File(
				"C:\\Users\\SHREEVATSA\\Desktop\\Eclipse Workplace\\TestingFileWithJDBC\\src\\main\\java\\testtingfile\\TestingFileWithJDBC\\service\\test.txt");

		// create a scanner from the file
		Scanner inputFile = new Scanner(file);
		String str = null;
		List<String> s = new ArrayList<String>();

		// set up the scanner to use "," as the delimiter
		inputFile.useDelimiter("[\\r,]");

		// While there is another line to read.
		while (inputFile.hasNextLine()) {
			// read the 3 parts of the line
			String id = inputFile.next(); // Read country
			String fname = inputFile.next(); // Read capital
			String purchase = inputFile.next(); // Read Population
			String sell = inputFile.next();

			// Check if user input is a match and if true print out info.
			s.add(id);
			s.add(fname);
			s.add(purchase);
			s.add(sell);
			// System.out.println(s.toString());

		}

		// be polite and close the file

		return s;
	}

}
