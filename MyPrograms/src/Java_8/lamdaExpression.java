package Java_8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface lamda{
	void check();
}
public class lamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lamda l=() -> System.out.println("new value");
l.check();

List<Integer> l1=Arrays.asList(2,3,4,5,6);
l1.forEach(System.out::println);
l1.forEach(i -> System.out.print(i));

	}

}
