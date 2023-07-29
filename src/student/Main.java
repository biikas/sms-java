package student;

public class Main {
	
	public static void main(String[] args) {
		Student student1 = new Student(1,"Ram","22","BCA",345000);
		Student student2 = new Student(2,"Shyam","21","BCA",345000);
		Student student3 = new Student(3,"Hari","22","BCA",345000);
	
		StudentService studentService = new StudentServiceImpl();
		
		studentService.addStudent(student1);
		studentService.addStudent(student2);
		studentService.addStudent(student3);
		
		
		for(Student student:studentService.getAllStudents()) {
			System.out.println(student.toString());
		}
		
		System.out.println("Getting detail of student with id 3");
		
		if(studentService.detail(4) == null) {
			System.out.println("Student not found");
		}else {
			System.out.println(studentService.detail(3).toString());
		}
		
		studentService.deleteStudent(2);
		
		System.out.println("After deleting");
		System.out.println(studentService.getAllStudents());	

	}

}
