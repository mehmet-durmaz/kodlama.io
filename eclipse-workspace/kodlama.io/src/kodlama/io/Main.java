package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setName("mehmet bahadır");
		student.setSurname("durmaz");
		student.setBalance(1000);
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		System.out.println("student name :" + student.getName() + "\nStudent Balance :" + student.getBalance());
	
		System.out.println("-----------------------------");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("engin");
		instructor.setSurname("demiroğ");
		instructor.setEmail("engin@kodlama.io");
		instructor.setPassword("deneme");
		instructor.setBalance(200);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		instructorManager.login(instructor,instructor.getEmail(),instructor.getEmail());

        System.out.println("Instructor Id:"+instructor.getId());
        System.out.println("Instructor Name:"+instructor.getName()+" "+instructor.getPassword());

        System.out.println("-----------------------------");
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Nitelikli Yazilim Geliştirci Kampı JAVA & REACT");
        course.setInstructorId(instructor.getId());
        course.setCoursePrice(200);

        CourseManager courseManager =new CourseManager();
        courseManager.add(course);

        System.out.println("Course Id:"+course.getCourseId());
        System.out.println("Course Name:"+course.getCourseName());
        System.out.println("Course Instrcutor Name:"+instructor.getName());
        System.out.println("Course Price:"+course.getCoursePrice()+"TL");

        System.out.println("-----------------------------");
        instructorManager.addCourse(course,instructor);
        System.out.println("-----------------------------");

        studentManager.buyCourse(course,student);
        studentManager.buyCourse(course,student);
        studentManager.buyCourse(course,student);
        studentManager.buyCourse(course,student);
        studentManager.buyCourse(course,student);
        studentManager.buyCourse(course,student);
        studentManager.buyCourse(course,student);

	
	
	
	
	
	
	
	
	
	
	}
	

}
