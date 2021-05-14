package com.problem.service;

import java.util.Scanner;
import java.util.TreeSet;

import com.problem.model.Student;

public class StudentService {
	static Scanner sc = new Scanner(System.in);

	public static TreeSet<Student> addStudents(TreeSet<Student> student) {
		// TODO Auto-generated method stub
		System.out.println("Enter the firstName");
		String firstName = sc.nextLine();
		System.out.println("Enter the lastname");
		String lastName = sc.nextLine();
		System.out.println("Enter the middleName");
		String middleName = sc.nextLine();
		Student std = new Student(firstName, lastName, middleName);
		student.add(std);

		return student;
	}

	public static void compareStudent(TreeSet<Student> student) {
		// TODO Auto-generated method stub
		for (Student std : student) {
			System.out.println("FirstName: "+std.getFirstName() + " Lastname: " + std.getLastName() + " Middlename: " + std.getMiddleName());
		}

	}

}
