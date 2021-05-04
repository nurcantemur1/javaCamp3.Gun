package javaCamp3.Gun;

public class Instructor extends User{
	private String InstructorNo;
	private double salary;
	
	public String getInstructorNo() {
		return InstructorNo;
	}
	public void setInstructorNo(String instructorNo) {
		InstructorNo = instructorNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
