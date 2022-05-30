import java.util.*;
public class Text5 {
	public static void main(String[] args) {
		String yn1;
		boolean d1=true;
		String yn2;
		boolean d2=true;
		ArrayList<Teacher> teach = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		do {
		System.out.print("Please input teacher's name: ");
		String teacherName = in.next();
		Teacher teacher = new Teacher(teacherName);
		teach.add(teacher);
		
		do {
		System.out.print("please input student's name: ");
		String name = in.next();
		teacher.addStudent(name);
		while(true){
		System.out.printf("Continue to add student for teacher " + teacherName + "? Y or N: " );
		yn2 = in.next();
		if (yn2.equals("Y")||yn2.equals("y"))
			{d2 = true;break;}
		else if (yn2.equals("N")||yn2.equals("n"))
			{d2 = false;break;}
		else {
			System.out.println("Input is wrong");
			continue;
		}
		}
		} while (d2==true);
		while(true){
		System.out.printf("Continue to add teacher? Y or N:");
		yn1 = in.next();
		if (yn1.equals("Y")||yn1.equals("y"))
			{d1 = true;break;}
		else if (yn1.equals("N")||yn1.equals("n"))
			{d1 = false;break;}
		else{
			System.out.println("Input is wrong");
			continue;
		}
		}
		} while (d1==true);
		System.out.println();
		ArrayList<Integer> score = new ArrayList<>();
		for (Teacher c: teach) {
			c.printAllStudent();
			for (Students s : c.getStudents()) {
				score.add(s.getScore());
			}
			System.out.println();
		}
		
		int sum = 0;
		int highest = 0;
		for (int i: score) {
			if (highest < i)
				highest = i;
			sum = sum + i;
		}
		System.out.printf("The average score for all students is %5s\n" , String.format("%.2f", (double)sum/score.size()));
		System.out.println("The largest score for all students is " + highest );
	}

}
