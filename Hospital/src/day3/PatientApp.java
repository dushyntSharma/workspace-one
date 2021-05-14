package day3;

import java.util.Iterator;

//Add Patients 
//delete the patients who are treated
//ask patient the whom to delete wrt name;
//new array of objects need to be created;
//delete the particular patient
//store it in the new array of the objects
//Display patients treated by particular illness
//Enter illness
//display

import java.util.Scanner;

public class PatientApp {
	static Scanner sc = new Scanner(System.in);
	static int noOfPatients;
	static Patient[] patients;

	public static void main(String[] args) {
		System.out.println("Enter the no of patients");
		noOfPatients = sc.nextInt();
		patients = new Patient[noOfPatients];
		int choice = 0;
		do {
			displayMainMenu();
			System.out.println("Enter you choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addPatient(patients);
				displayPatients();
				break;

			case 2:
				// ask patient the whom to delete wrt name;
				System.out.println("Enter the patient name to be deleted");
				String name = sc.next();
				deletePatient(patients, name);
			case 3:
				// having same illness
				// display them
				System.out.println("Enter the illness");
				String illness = sc.next();
				displayPatientsTreatedByPartiularIllness(patients, illness);
				break;
			case 4:
				System.out.println("Enter the illness");
				String illness1 = sc.next();
				displayPatientsTreatedByPartiularIllness(patients, illness1);
				break;
			case 5:
				// Display patient name who have billed lowest
				displayPatientsNameLowestBill();
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 5);

	}
	
	private static void displayPatientsNameLowestBill() {
		Patient[] patients2 = new Patient[noOfPatients];
		patients2 = patients;
		Patient[] temp = new Patient[noOfPatients];
		for (int i = 0; i < noOfPatients - i; i++) {
			for (int j = i + 1; j < noOfPatients; j++) {
				if (patients2[i].getAmount() > patients2[j].getAmount()) {
					temp[i] = patients2[i];
					patients2[i] = new Patient(patients2[j].getName(), patients2[j].getDays(),
							patients2[j].getIllness(), patients2[j].getAmount(), patients2[j].getTreated());
					patients2[j] = new Patient(temp[i].getName(), temp[i].getDays(), temp[i].getIllness(),
							temp[i].getAmount(), temp[i].getTreated());
				}

			}

		}
			System.out.println("Patient name   :" + patients2[0].getName());
			System.out.println("Patient days   :" + patients2[0].getDays());
			System.out.println("Patient Illness:" + patients2[0].getIllness());
			System.out.println("Patient amount :" + patients2[0].getAmount());
			System.out.println("Patient Treated:" + patients2[0].getTreated());

	}

	private static void displayPatientsTreatedByPartiularIllness(Patient[] patients, String illness) {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getIllness().equals(illness)) {
				System.out.println("Patient name   :" + patients[i].getName());
				System.out.println("Patient days   :" + patients[i].getDays());
				System.out.println("Patient Illness:" + patients[i].getIllness());
				System.out.println("Patient amount :" + patients[i].getAmount());
				System.out.println("Patient Treated:" + patients[i].getTreated());
			}

		}

	}

	private static void deletePatient(Patient[] patients, String name) {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.length; i++) {
			if (patients[i].getName().equals(name)) {
				patients[i] = patients[patients.length - 1];
				break;
			}
			if (i == patients.length - 1) {
				System.out.println("That requested patient is not there");
			}
		}
		for (int i = 0; i < patients.length - 1; i++) {
			System.out.println(patients[i].getName() + " " + patients[i].getDays() + " " + patients[i].getAmount() + " "
					+ patients[i].getIllness() + " " + patients[i].getTreated());
		}

	}

	private static void displayPatients() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.length; i++) {
			System.out.println("Patient name   :" + patients[i].getName());
			System.out.println("Patient days   :" + patients[i].getDays());
			System.out.println("Patient Illness:" + patients[i].getIllness());
			System.out.println("Patient amount :" + patients[i].getAmount());
			System.out.println("Patient Treated:" + patients[i].getTreated());
			System.out.println("==============================================");

		}

	}

	private static Patient[] addPatient(Patient[] patients) {
		for (int i = 0; i < patients.length; i++) {
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Enter the days: ");

			int days = sc.nextInt();
			System.out.println("Enter the illness: ");
			sc.nextLine();
			String illness = sc.nextLine();
			System.out.println("Enter the amount: ");
			long amount = sc.nextLong();
			System.out.println("Enter the dcotr treated or not?: ");
			sc.nextLine();
			String treated = sc.nextLine();

			patients[i] = new Patient(name, days, illness, amount, treated);
		}

		return patients;

	}

	private static void displayMainMenu() {
		// TODO Auto-generated method stub
		System.out.println("...........Main Menu......");
		System.out.println("1.Add incoming patients");
		System.out.println("2.Delete outgoing patients");
		System.out.println("3.Display patients treated by particular illness");
		System.out.println("4.Display patients having same illness");
		System.out.println("5.Display patient name who have billed lowest");
		System.out.println("6.Exit");
	}

}
