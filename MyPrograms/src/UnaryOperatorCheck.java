import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UnaryOperator<Integer> f = i->i*i;
System.out.println(f.apply(10));
IntUnaryOperator f1=i->i*i;
System.out.println(f1.applyAsInt(30));
DoubleUnaryOperator f2=s->s+s;
System.out.println(f2.applyAsDouble(12.9));
	}

}
