
public class digitsOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sds233242fs*&^1";
		char[] a=s.toCharArray();
		//System.out.println(s.matches("/*[0-9]/*"));
		String s1=s.replaceAll("[^0-9]", "");
		System.out.println(s);

	}

}
