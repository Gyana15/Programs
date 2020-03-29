package MyOldPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class methodOverloading {


		// TODO Auto-generated method stub
 public void abcd(int a){
	 
 }
 public void abcd(int a,int b){
	 
 }
 public static void main(String args[]){
	 try {
		FileReader input=new FileReader("C://abc.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Handled here");
	}
	 
 }

}
