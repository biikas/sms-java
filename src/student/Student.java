package student;

public class Student {
	
	private int id;
	private String name;
	private String age;
	private String course;
	private int fee;
	
	
	Student(int id,String name, String age, String course, int tutionFee){
		this.id = id;
		this.name = name;
		this.age =  age;
		this.course = course;
		this.fee = tutionFee;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public String toString() {
		return "Student Information = "+"id" + id+" "+"name" +" "+name +" "+"age"+" "+age;	
	}
}
