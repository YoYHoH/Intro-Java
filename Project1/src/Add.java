import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Add extends Teacher{
	
	Add(String teacherName) {
		super(teacherName);
		// TODO Auto-generated constructor stub
	}
	
	String yn1;
	boolean d1=true;
	String yn2;
	boolean d2=true;
//	ArrayList<Teacher> teach = new ArrayList<>();
	Scanner in = new Scanner(System.in);
//	Teacher teacher = new Teacher(teacherName);
	
	public void Add(){
//	do {
	      System.out.print("Please input teacher's name: ");
	      String teacherName = in.next();
//	      Teacher teacher = new Teacher(teacherName);
//	      teach.add(teacher);
	
	      do {
	           System.out.print("Please input student's name: ");
	           String name = in.next();
	           System.out.print("Please input student's reservation times: ");
	           int times= in.nextInt();
	           System.out.print("Please input Stsdent's all reservation hours: ");
	           int time = in.nextInt();
	           addStudent(name,times,time);
	           while(true){
	                System.out.printf("Continue to add student for teacher " + teacherName + "? Y or N: " );
	                yn2 = in.next();
	                if (yn2.equals("Y")||yn2.equals("y"))       {d2 = true;break;}
	                else if (yn2.equals("N")||yn2.equals("n"))     {d2 = false;break;}
	                else {
		                 System.out.println("Input is wrong");
		                 continue;
	                     }
	                }
	         } while (d2==true);
	}

}
