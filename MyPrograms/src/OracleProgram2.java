import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class OracleProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={1,2,3,2,1,4,5,0,9,0,8,6,0,12,34,34};
		//List<Integer> l= Arrays.asList(a);
		//TreeSet<Integer> ts=new TreeSet<Integer>(l);
		//List l1=new ArrayList(ts);
		//System.out.println(l1.get(1) + " " + l1.get(l1.size()-2));
		Arrays.sort(a);
		//System.out.println(a[0]); 
		int count=0; int[] a2 = new int[a.length];
		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				a2[count++]=a[i];
			}
		}
		a2[count++]=a[a.length-1];
		for (int i=0; i<count; i++){  
            a[i] = a2[i];  
        }  
		Arrays.copyOf(a, count);
		Arrays.equals(a, a2);
		for(int i=0;i<count;i++)
			System.out.println(a[i]);
		System.out.println(Arrays.toString(a));
	}

}
