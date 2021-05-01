package kodlama.io;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println("instructor added");
	}
	public void update(Instructor instructor) {
		System.out.println("instructor updated");
	}
	public void delete(Instructor instructor) {
		System.out.println("instructor deleted");
	}
	
	
	public void login(Instructor instructor, String email, String password) {
		if(instructor.getEmail() == email & instructor.getPassword() == password ) {
			System.out.println("sisteme giriþ yapýldý");
		} else {
			System.out.println("parola veya email hatalý");
		}
	} 
	public void addCourse(Course course, Instructor instructor) {
		CourseManager courseManager = new CourseManager();
		courseManager.add(course);
		add(instructor);
	}
	
	
}
