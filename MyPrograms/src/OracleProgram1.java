import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import MyOldPrograms.abstract_method;

public class OracleProgram1 extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={0,1,2,3,5,3,0,0,6,7,8,5,0};

int count=a.length-1;
for(int i=a.length-1;i>=0;i--)
{
	
if(a[i]!=0)
{
	//System.out.print(a[i]);
	a[count]=a[i];// 13=5 11=8 10=7 9=6 8=3 7=5 6=3 5=5 4=3 3=2 3=1   
	//System.out.print(a[count] + "   ");
	count--;

}
}
while(count>=0)
{
	a[count]=0;
	//System.out.print(a[count] + "   ");
	count--;
}


for(int i=0; i<a.length;i++)
	System.out.print(a[i]);
System.out.println(a);







List<int[]> l=Arrays.asList(a);
//System.out.println(a);
l.forEach(System.out::print);
int temp,sam=0;
for(int i=0;i<a.length-1;i++){
	if((a[i]==0 || a[i+1]==0) && a[i]<a[i+1]){
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	}
	sam=i;
	while(a[sam]!=0){
	if(a[i]==0 && a[++sam]==0){
		temp=a[i];
		a[i]=a[sam];
		a[sam]=temp;
	}
	}
}
for(int i=0;i<a.length;i++){
	System.out.print(a[i]);
}
List<Integer> l1 = new ArrayList<Integer>();
l1.add(0);
l1.add(1);
l1.add(2);
l1.add(3);
l1.add(0);
l1.add(2);
l1.add(0);
/*//System.out.println(l1);
Iterator<Integer> i1=l1.iterator();
while(i1.hasNext()){
	if(i1.next()==0){
		i1.remove();
		l1.add(0);
	}
}*/
HashSet a2 =new HashSet(l1);
a2.forEach(System.out::println);


Set<Integer> s2 = new LinkedHashSet<Integer>(l1);
System.out.println(s2);
	}
	
	
	
	


}
