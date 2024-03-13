package day10.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
//		//Non Parameterised Constructor
//		//Default capacity=10;
//		List a1=new ArrayList();
//		
//		//Parameterised Constructor
//		//Used Defined capacity of 20
//		List a2=new ArrayList(20);
//		
//		List l1=new LinkedList();
//		
//		//Takes object of the classes under Collection Umbrela and converts it into an ArrayList
//		List a3=new ArrayList(l1);
		
		
//		List<Student> students=new ArrayList<>(5); //Default capacity =10
//		students.add(new Student(101,"Alice",78.5));
//		students.add(new Student(102,"Ben",88.5));
//		students.add(new Student(103,"Chris",98.5));
//		students.add(new Student(104,"Dom",87.5));
//		students.add(new Student(105,"Elcid",96.5));
//		
//		for(int i=0;i<students.size();i++)
//		System.out.println(students.get(i).getSname());
		
		
//		List<Student> students=new ArrayList<>(5);
//		students.add(new Student(101,"Alice",78.5));
//		students.add(new Student(102,"Ben",88.5));
//		students.add(new Student(103,"Chris",98.5));
//		students.add(new Student(104,"Dom",87.5));
//		students.add(new Student(105,"Elcid",96.5));
//		
//		
//		
//		double maxPer=students.get(0).getPercentage(); // 78.5
//		int maxIndex=0;
//		for(int i=0;i<students.size();i++)
//		{
//			if(students.get(i).getPercentage() > maxPer)
//			{
//				maxPer=students.get(i).getPercentage();
//				maxIndex=i;
//			}
//		}
//		
//		System.out.println("Maximum Percentage is of " +students.get(maxIndex).getSname());

//		List<String> fruits=new ArrayList<>(5);
//		fruits.add("Mango");
//		fruits.add("Banana");
//		fruits.add("Apple");
//		fruits.add("Chicku");
//		fruits.add("Papaya");
//		
//		System.out.println("Before Sorting " +fruits);
//		Collections.sort(fruits);
//		System.out.println("After Sorting " +fruits);
		
		List<Student> students=new ArrayList<>(5);
		students.add(new Student(101,"Frank",78.5));
		students.add(new Student(102,"Tom",88.5));
		students.add(new Student(103,"Chris",98.5));
		students.add(new Student(104,"Dom",87.5));
		students.add(new Student(105,"Elcid",96.5));
		
		System.out.println("Before Sorting " +students);
		Collections.sort(students, new PercentageComparator());
		System.out.println("After Sorting " +students);
		
	}
}
