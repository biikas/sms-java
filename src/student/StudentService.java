package student;

import java.util.List;

public interface StudentService {
	
	void addStudent(Student student);
	
	void deleteStudent(int id);
	
	Student detail(int id);
	
	List<Student> getAllStudents();

}
