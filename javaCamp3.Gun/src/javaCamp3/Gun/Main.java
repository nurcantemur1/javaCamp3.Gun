package javaCamp3.Gun;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		userManager.add(new User());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(new Instructor());
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(new Student());
	

	}

}
