package com.problem.client;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.problem.model.Student;
import com.problem.service.StudentService;

public class StudentApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TreeSet<Student> student = new TreeSet<Student>();
		int choice;
		boolean flag = true;
		do {
			displayMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				student = StudentService.addStudents(student);
				displayStudentDetails(student);
				break;
			case 2:
				displayStudentDetails(student);
				break;
			case 3:
				StudentService.compareStudent(student);
				break;
			case 4:
				System.out.println("Thank you Vist again!!");
				flag = false;
				break;

			default:
				System.out.println("Invalid choice!!");
				break;
			}

		} while (flag);

	}

	private static void displayStudentDetails(TreeSet<Student> student) {
		// TODO Auto-generated method stub
		Iterator<Student> it = student.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("-------------------------");
			System.out.println("Firstname: " + s.getFirstName());
			System.out.println("Lastname: " + s.getLastName());
			System.out.println("Middlename: " + s.getMiddleName());
			System.out.println("-------------------------");
		}

	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("*-------------------------------------*");
		System.out.println("1.Enter Student details");
		System.out.println("2.Display Student Details");
		System.out.println("3.Sort by Comparable class");
		System.out.println("4.Exit");
		System.out.println("*-------------------------------------*");

	}

}
