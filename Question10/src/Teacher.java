import java.util.ArrayList;
public class Teacher {
	private String name;
	private ArrayList<Students> students = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public ArrayList<Students> getStudents() {
		return students;
	}
	Teacher(String name){
		this.name=name;
	}
	public void addStudent(String name){
		Students st = new Students(name);
		students.add(st);
	}
	public void printAllStudent(){
		System.out.println("Students of teacher " + name);
		for (Students c: students){
			System.out.print(c.toString());
			System.out.println(", teacher="+name+"]");
		}	
	}

}
