import java.util.*;
public class Text6 {
	public static void main(String[] args){
		System.out.print("Enter the number of student: ");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		System.out.print("Enter thr students' names and their scores : ");
		List<String> na=new ArrayList<String>();
		List<Integer> gr=new ArrayList<Integer>();
		for(int i=1;i<=m;i++){
			na.add(sc.nextLine());
			gr.add(sc.nextInt());
		}
		while(na.size()!=0){
			for(int j=0;j<na.size();j++){
				for(int k=0;k<na.size();k++){
					if(gr.get(j)<gr.get(k)) break;
					if(k==na.size()-1){
						System.out.println(na.get(j)+" "+gr.get(j));
						na.remove(j);
						gr.remove(j);
					}
				}
			}
		}
		sc.close();
	}

}
