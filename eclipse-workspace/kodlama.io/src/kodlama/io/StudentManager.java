package kodlama.io;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println("student added");
	}
	public void update(Student student) {
		System.out.println("student updated");
	}
	public void delete(Student student) {
		System.out.println("student deleted");
	}
	
	public void login(Student student, String email, String password) {
		if(student.getEmail() == email & student.getPassword() == password ) {
			System.out.println("sisteme giriþ yapýldý");
		} else {
			System.out.println("parola veya email hatalý");
		}
	} 
	public void buyCourse(Course course, Student student) {
		if(student.getBalance() >= course.getCoursePrice()) {
			student.setBalance(student.getBalance()-course.getCoursePrice());
			System.out.println("kurs satýn alýndý");
		} else {
			System.out.println("bakiye yetersiz");
		}
	}
}
