package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class streamsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l = Arrays.asList(2,3,5,4,6);
Stream<Integer> s=l.stream();
s.forEach(s1-> System.out.println(s1));
//s.forEach(System.out::println);
List<Integer> list=l.stream().filter(i->i%2==0).collect(Collectors.toList());
list.forEach(System.out::println);
List<Integer> list1=l.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
list1.forEach(System.out::println);
l.stream().map(i->i*2).collect(Collectors.toList()).forEach(System.out::println);
System.out.println(l.stream().filter(i->i%2==0).count());
System.out.println(l.stream().max((o1,o2)->o1.compareTo(o2)).get());
Integer[] a = l.stream().toArray(Integer[]::new);
Stream<Integer> array = Stream.of(1,2,4,3,2,1,2,3);
array.forEach(System.out::println);
	}
}
