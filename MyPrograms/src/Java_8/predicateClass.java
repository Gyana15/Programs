package Java_8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class studentClassName{
	String name;
	String userID;
 public studentClassName(String name, String userID){
	 this.name=name;
	 this.userID=userID;
 }
}

public class predicateClass {

	public static void main(String args[]){
		Predicate<studentClassName> p= pc -> pc.name.contains("Gyan");
		Function<studentClassName,String> f = fc -> fc.name.replace('G','M');
		Consumer<studentClassName> c = pc -> {
			System.out.println(pc.name);
			System.out.println(pc.userID);
		};
		Supplier s = () -> (Math.random())*10;
		studentClassName pc = new studentClassName("Gyan","c04050");
		if(p.test(pc)) System.out.println("valid");;
		System.out.println(f.apply(pc));
		c.accept(pc);
		System.out.println(s.get());
		System.out.println(Predicate.isEqual(p));
		System.out.println(Function.identity());
	}	
	public static void populate(ArrayList<studentClassName> al){
		al.add(new studentClassName("Gyan","435435"));
		al.add(new studentClassName("Mahapatra","345354"));
		al.add(new studentClassName("abcd","sggr234"));
		al.add(new studentClassName("Gykkjkan","565"));
		al.add(new studentClassName("were","453"));
	}
}