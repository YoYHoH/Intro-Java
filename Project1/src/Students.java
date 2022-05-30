import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
	private String name,teacherName;
	private int times,time,hasTimes,antitimes;
	Scanner in = new Scanner(System.in);
	Students(String name,String teacherName,int times,int time){
	    this.name=name;
	    this.teacherName=teacherName;
	    this.times=times;
	    this.time=time;
	    this.hasTimes=0;
	    this.antitimes=0;
	}
	public String studentSearch(String TeacherName){
		String[] a=getMatchLine("D:"+name+".txt",TeacherName).split("]");
		return a[0];
	}
	
	public void choose(String TeacherName){
		System.out.print("Please input appointment time:");
		InAndOut.change("D:"+name+".txt", TeacherName, "]", "]"+in.next());
		hasTimes ++;
		InAndOut.change("D:"+name+".txt",TeacherName, "have reserved:\b*"+"not","have reserved:"+hasTimes+"not");
	}
	public void delete(String TeacherName){
		System.out.print("Please input appointment time to delete:");
		InAndOut.change("D:"+name+".txt", TeacherName, "][a-zA-Z0-9]*", "]");
		hasTimes --;
		InAndOut.change("D:"+name+".txt",TeacherName, "have reserved:\b*"+"not","have reserved:"+hasTimes+"not");
	}
	public static String getMatchLine(String txtPath, String word) {
        String result = null;
        try {
            FileReader fr = new FileReader(new File(txtPath));
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                if (line.contains(word)) {
                    result = line;
                    break;
                } else {
                    line = br.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
	
}
