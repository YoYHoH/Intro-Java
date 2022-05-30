
public class Students {
	private String name;
	private int score;
	private static int count;
	private String studentNumber;
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public static int getCount() {
		return count;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	Students(String name){
	    this.name=name;
	    this.score=(int)(101*Math.random());
	    this.studentNumber="str"+(count+1);
	    this.count=count+1;
	}
	Students(){
		this.name="UnKnown";
		this.score=(int)(101*Math.random());
		this.studentNumber="str"+(count+1);
		this.count=count+1;
	}
	public String toString(){
		return studentNumber     +    " [name="   +   name  +  ", score="   +  score;
	}

}
