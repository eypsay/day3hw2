package day3Hw2;

public class StudentManager extends UserManager {
	public void addCourse(Student student) {
		System.out.println(student.getFirstName()+" **"+student.getTakenCourse() + "** Kursuna kayıt oldu");

	}

	public void getAll(Student[] students) {
		System.out.println("-------STUDENTS & COURSES------");
		for (Student student : students) {
			
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getTakenCourse());

		}
		System.out.println();
	}

}
