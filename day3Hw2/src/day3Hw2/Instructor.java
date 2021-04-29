package day3Hw2;

public class Instructor extends User {
	private int instructorNumber;
	private String givenCourse;

	public Instructor() {}
	
	public Instructor(int instructorNumber, String givenCourse) {
		this.instructorNumber = instructorNumber;
		this.givenCourse = givenCourse;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}

}
