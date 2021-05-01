package day3Hw2;

public class Student extends User {
	private int studentNumber;
	private String takenCourse;
	private String firstName;
	private String LastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Student() {
	}

	public Student(int studentNumber, String takenCourse) {
		this.studentNumber = studentNumber;
		this.takenCourse = takenCourse;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}

}
