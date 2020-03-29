package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

class Employee{
	String name;
	double salary;
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
}
public class primitiveTypeChecks{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(2,3,4,5,6);
//Predicate.................
		Predicate<Integer> p1 = i -> i%2==0;
		for(Integer i : l1){
			if(p1.test(i)){
				System.out.println("Finding it right...............");
			}
		}
//Int Predicate.........................
IntPredicate p2 = i -> i%2==0;
for(Integer i : l1){
	if(p2.negate().test(i)){
		System.out.println(i+"Finding it right in int predicate...............");
	}
}

//Int Function.................
IntFunction<Integer> f1 = i -> i*2;
		for(Integer i : l1){
			System.out.println(f1.apply(i));
		}
//ToInt Function.................
		ToIntFunction<String> f3 = i -> i.length();
					System.out.println(f3.applyAsInt("Gyan"));
		
//IntToDouble Function.................
IntToDoubleFunction f2 = i -> Math.sqrt(i);
	    for(Integer i : l1){
			System.out.println(f2.applyAsDouble(i));
		}
//Consumer .................
IntConsumer c1 = i -> {
	System.out.println(i*i+"Here is consumber implemantation");
};
		for(Integer i : l1){
			c1.accept(i);
		}
		
//ObjConsumer 
		ArrayList<Employee> al = new ArrayList<Employee>();
		populate(al);
ObjDoubleConsumer<Employee> c2 = (e,t) -> e.salary=e.salary+t;
for(Employee e : al){
	c2.accept(e, 500.00);
}
for(Employee e : al){
	System.out.println("Employee name : " + e.name);
	System.out.println("Employee Salary : " + e.salary + "\n");
}

//Suplier----------------
IntSupplier s = () ->(int) (Math.random()*100);
String otp="";
for(int i=0;i<6;i++){
	otp=otp+s.getAsInt();
}
System.out.println("Otp is:" +otp);
	}
	public static void populate(ArrayList<Employee> al){
		al.add(new Employee("Gyan",23000));
		al.add(new Employee("sdsds",30000));
		al.add(new Employee("Gdfdfyan",2000));
		al.add(new Employee("dfgg",3000));
		al.add(new Employee("erer",25000));
	}
	}

