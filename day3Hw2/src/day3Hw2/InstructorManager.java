package day3Hw2;

public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" **"+instructor.getGivenCourse() + "** Kursunu açtý");

	}

	public void getAll(Instructor[] instructors) {
		System.out.println("-------INSTRCTORS & COURSES------");
		for (Instructor instructor : instructors) {
			
			System.out.println(
					instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getGivenCourse());

		}
		System.out.println();
	}
}
