package com.problem.model;

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private String middleName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}

	@Override
	public int compareTo(Student std) {
		// TODO Auto-generated method stub
		int i, j;
		i = this.lastName.compareTo(std.lastName);
		j = std.lastName.compareTo(this.lastName);
		if (i > j)
			return 1;
		if (i == 0) {
			int k = this.firstName.compareTo(std.firstName);
			int m = std.firstName.compareTo(this.firstName);
			if (k > m)
				return 1;
			if (k == 0)
				return 0;
			else
				return -1;
		} else
			return -1;
	}

}
