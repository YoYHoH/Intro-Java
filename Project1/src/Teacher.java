import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Teacher {
	String teacherName;
	String yn;
	boolean d=true;
	Scanner in = new Scanner(System.in);
    File f1 = new File("D:"+teacherName+".txt");
	public void Add(){
	      do {
	           System.out.print("Please input student's name: ");
	           String name = in.next();
	           InAndOut.write("D:"+teacherName+".txt","Student's name£º "+name);
	           System.out.print("Please input student's reservation times: ");
	           int times= in.nextInt();
	           System.out.print("Please input Stsdent's all reservation hours: ");
	           int time = in.nextInt();
	           File f = new File("D:"+name+".txt");
	   		   InAndOut.write("D:"+name+".txt",teacherName+"[ total times:"+times+" total time:"+time+"have reserved:"+"0"+"not obeying:"+"0"+" ]");
	           while(true){
	                System.out.printf("Continue to add student for teacher " + teacherName + "? Y or N: " );
	                yn = in.next();
	                if (yn.equals("Y")||yn.equals("y"))       {d = true;break;}
	                else if (yn.equals("N")||yn.equals("n"))     {d = false;break;}
	                else {
		                 System.out.println("Input is wrong");
		                 continue;
	                     }
	                }
	         } while (d==true);
	}
	public ArrayList<String> searchStudent(){
		return InAndOut.readlines("D:"+teacherName+".txt");
	}

}
