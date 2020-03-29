package MyOldPrograms;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class string {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
byte[] a={84,99,24};
//String s1=new String(a,1,1);
String s1=new String(a);
System.out.println(s1);
String s="Hello";
char ch[]=new char[5];
s.getChars(1, 3, ch, 2);
for(int i=0;i<5;i++)
	System.out.println(ch[i]);
String s2="20";
System.out.println(s==s2);
StringBuffer s3=new StringBuffer(s);
s3.insert(2, "Gyan");
s3.reverse();
System.out.println(s3);
System.out.println(s3.append(s2));
Integer.valueOf(0);
Integer.parseInt(s2);
s3.toString();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
s=br.readLine();
System.out.println(s);
Scanner sc=new Scanner(System.in);
int g=Integer.parseInt(sc.nextLine());
System.out.println(g);
FileInputStream f1=new FileInputStream("");
String n=null;
String n1=new String();
n1=null;
System.out.println(n.equals(n1));

	}

}
