package day3Hw2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setStudentNumber(111);
		student1.setFirstName("Eyyüp");
		student1.setLastName("Sayılır");
		student1.setTakenCourse("Java");
		Student student2 = new Student();
		student2.setId(2);
		student2.setStudentNumber(222);
		student2.setFirstName("Ali");
		student2.setLastName("Veli");
		student2.setTakenCourse("Python");
		
		Student[] students= {student1,student2};
		
		Instructor instructor1= new Instructor();
		instructor1.setId(1);
		instructor1.setInstructorNumber(1111);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setGivenCourse("Java");
		
		Instructor instructor2= new Instructor();
		instructor2.setId(2);
		instructor2.setInstructorNumber(2222);
		instructor2.setFirstName("Ahmet");
		instructor2.setLastName("De");
		instructor2.setGivenCourse("C#");
		
		
		
		Instructor[] instructors= {instructor1,instructor2};
		

		StudentManager studentManager=new StudentManager();
		studentManager.getAll(students);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);

	}

}
