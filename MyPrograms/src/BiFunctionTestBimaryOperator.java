import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BiFunctionTestBimaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer,String,String> bf = (i,s) -> i+s;
System.out.println(bf.apply(3, "23"));

BinaryOperator<Integer> bf1 = (i1,i2) -> i1+i2;
System.out.println(bf1.apply(23, 34));

IntBinaryOperator bf2 = (i1,i2) -> i1/i2;
System.out.println(bf2.applyAsInt(230, 34));
	}

}
