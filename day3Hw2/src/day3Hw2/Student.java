package day3Hw2;

public class Student extends User {
	private int studentNumber;
	private String takenCourse;

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
