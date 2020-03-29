import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayOperation {

	public static void main(String[] args) {
		int[] myArray = {0,0,1,2,3,0,4,1,2,1,0};
		
		String[] str = Arrays.stream(myArray).mapToObj(String::valueOf).toArray(String[]::new);
		int l = str.length;
		int count = 0;
		
		for(String obj : str){
			if(obj.equals("0")){
				count++;
			}
		}
		long[] as=new long[4];
		
		//String[] str1 = Stream.of(myArray).toArray(String[]::new);
		
		//System.out.println(str1.length);
		//System.out.println(str.length);
		//String str = myArray.toString();
		
		//System.out.println(str);
	}

}
