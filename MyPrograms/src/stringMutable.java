

import java.util.ArrayList;
import java.util.List;

public class stringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s =new String( "java");
		 s = "Python";
		 String s1 = s;
		 s.replace('j', 'k');
		 System.out.println(s);
		 System.out.println(s1);
		/* List<Character> chars = new ArrayList<Character>();
		 for (char ch : s.toCharArray()) { 
			 chars.add(ch); 
	     }
	     chars.set(1,'f');
	        //s = Joiner.on("").join(chars);
	     StringBuilder sb = new StringBuilder(s); 
	     
	        // Appends characters one by one 
	        for (Character ch : chars) { 
	            sb.append(ch); 
	        } 
	        s = sb.toString();
	        System.out.println(s);*/
	        StringBuilder sb1 = new StringBuilder(s); 
	        sb1.reverse();
	        System.out.println(sb1.toString().getClass().getName());
	        s=sb1.toString();
	        System.out.println(s);
	}

}
