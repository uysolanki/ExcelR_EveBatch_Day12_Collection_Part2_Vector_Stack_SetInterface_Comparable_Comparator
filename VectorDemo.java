package day10.collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
//		Vector v1=new Vector();
//		System.out.println(v1.capacity());
//		System.out.println(v1.size());
//		for(int i=1;i<=10;i++)
//			v1.add(i);
//		
//		System.out.println(v1.capacity());
//		System.out.println(v1.size());
//		v1.add(11);
//		
//		System.out.println(v1.capacity());
//		System.out.println(v1.size());
		
		Vector v2=new Vector(25);
		System.out.println(v2.capacity());
		
		
		Vector v3=new Vector(5,10);
		System.out.println(v3.capacity());
		System.out.println(v3.size());
		
		for(int i=1;i<=5;i++)
			v2.add(i);
			v2.add(6);
		
		System.out.println(v2.capacity());
		System.out.println(v2.size());
	}

}
