

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class InAndOut {
	public static void write(String filePath, String content) {
          BufferedWriter bw=null;
		try {
			 bw=new BufferedWriter(new FileWriter(filePath));
			bw.write(content);
			bw.write("\r\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		  try {
			  if(bw!=null) {
			bw.flush();
			bw.close();
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			bw=null;
		}
		  }
	}
	public static ArrayList<String> readlines(String filePath) {
		BufferedReader br=null;
		String line=null;
		ArrayList<String> lines=new ArrayList<String>();
		try {
			br=new BufferedReader(new FileReader(filePath));
			try {
				while((line=br.readLine())!=null) {
					lines.add(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return lines;
		}}
		public static String readaline(String filePath) {
			BufferedReader br=null;
			String line=null;
			try {
				br=new BufferedReader(new FileReader(filePath));
				try {
					line=br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				return line;
			}
	}
		 public static boolean change(String filePath,String regex, String oldstr, String newStr) {
		        RandomAccessFile raf = null;
		        Pattern pat= Pattern.compile(regex);
		        try {
		            raf = new RandomAccessFile(filePath, "rw");
		            String line = null;
		            long lastPoint = 0;
		            while ((line = raf.readLine()) != null) {
				        Matcher mat=pat.matcher(line);
		                final long ponit = raf.getFilePointer();
		                if(mat.find()){
		                      String str=line.replace(oldstr, newStr);
		                raf.seek(lastPoint);
		                raf.writeBytes(str);
		                }
		                lastPoint = ponit; 
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                raf.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        return true;
		    }
		 public static boolean change2(String filePath,String regex1,String regex2, String oldstr, String newStr) {
		        RandomAccessFile raf = null;
		        Pattern pat1= Pattern.compile(regex1);
		        Pattern pat2= Pattern.compile(regex2);
		        
		        try {
		            raf = new RandomAccessFile(filePath, "rw");
		            String line = null;
		            long lastPoint = 0;
		            while ((line = raf.readLine()) != null) {
				        Matcher mat1=pat1.matcher(line);
		                if(mat1.find()) {
		                for(;;) {
		                	 Matcher mat2=pat1.matcher(line);
		                	 final long ponit = raf.getFilePointer();
		                      String str=line.replace(oldstr, newStr);
		                raf.seek(lastPoint);
		                raf.writeBytes(str);
		                lastPoint = ponit; 
		                line = raf.readLine();
		                if(mat2.find())break;
		            }}}}
		        catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                raf.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        return true;
		    }
		 public static void continuechange(String filePath, String regex1,String regex2 ,String oldstr, String newStr) throws IOException {
			 String[] array;
		        Pattern pat1= Pattern.compile(regex1);
		        Pattern pat2= Pattern.compile(regex2);
			 ArrayList<String> x=InAndOut.readlines(filePath);
				for(int i=0;i<x.size();i++) {
			        Matcher mat1=pat1.matcher(x.get(i));
			        if(mat1.find()) {
			        	all: for(;i<x.size();) {
			        		Matcher mat2=pat1.matcher(x.get(i));
			        		if(mat2.find()) {
			        		x.get(i).replace(oldstr,newStr);
			        		break all;
			        		}
			        		x.get(i).replace(oldstr,newStr);
			        		i++;
			        	}
			        }
					}
				File f = new File(filePath);
				FileWriter fw =  new FileWriter(f);
				fw.write(x.get(0)+"\r\n");
				fw.close();
				for(int i=1;i<x.size();i++) {
					InAndOut.write(filePath, x.get(i));
				}
		 }
	public static void resetname(String str) {
		Scanner sc=new Scanner(System.in);
		String[] array=str.split("-",2);
		System.out.print("Please input new name: ");
		array[0]=sc.next();
	}
	public static void resetcode(String str) {
		Scanner sc=new Scanner(System.in);
		String[] array=str.split("-",2);
		System.out.print("Please input new name: ");
		array[1]=sc.next();
	}
	
}
