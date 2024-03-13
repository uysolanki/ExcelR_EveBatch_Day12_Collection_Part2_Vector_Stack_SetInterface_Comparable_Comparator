package day11.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Student> students=new TreeSet<>();
		
		students.add(new Student(101,"Tom",78.5));
		students.add(new Student(104,"Alice",68.5));
		students.add(new Student(103,"Chris",98.5));
		students.add(new Student(102,"Dom",87.5));
		students.add(new Student(105,"Elcid",96.5));
		
		System.out.println(students);


	}

}
