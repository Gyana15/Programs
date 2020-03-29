package MyOldPrograms;

public class nullClass {
	@SuppressWarnings("finally")
	public static int xyz(){
		try{
			String s2="sdsds sdsdsd gfgesds sdsd";
			String s3[]=	s2.split("sd");
			System.out.println(s3[5].split("g")[1]);
		String s="";
		String s1=new String();
		s1="";
		System.out.println(s.equals(s1));
		return 0;
		}
		catch(Exception e){}
		finally{
			System.out.println("Its executed");
			return 1;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xyz());
	}

}
