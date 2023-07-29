package student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
	
	List<Student> students;
	
	 StudentServiceImpl(){
		students =  new ArrayList<>();
	}

	@Override
	public void addStudent(Student student) {
		students.add(student);		
	}

	
	@Override
	public void deleteStudent(int id) {
		for(Student student:students) {
			if(student.getId() == id) {
				students.remove(student);
			}
		}
	}

	@Override
	public Student detail(int id) {
		for(Student student:students) {
			if(student.getId()==id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

}
