package Java_8;

import java.util.ArrayList;
import java.util.Collections;

 class student {
int rollno;
String name;
	public student(int rollno, String studentName){
		this.rollno=rollno;
		name=studentName;
	}
	public String toString(){
		return rollno+":"+name;
	}
	
}
 public class studentClass{
	
	public static void main(String args[]){
		ArrayList<student> al=new ArrayList<student>();
		al.add(new student(10,"name10"));
		al.add(new student(11,"name11"));
		al.add(new student(15,"name15"));
		al.add(new student(13,"name13"));
		al.add(new student(14,"name14"));
		Collections.sort(al,(e1,e2)->(e1.rollno)>(e2.rollno)?1:(e1.rollno)<(e2.rollno)?-1:0);
		System.out.println(al);
	}
}

