package day11.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
//		Set mySet=new HashSet();
//		mySet.add("Pune");
//		mySet.add("Delhi");
//		mySet.add("Jaipur");
//		mySet.add("Mumbai");
//		Insertion order is not preserved
//		System.out.println(mySet);
//		
		
		Set<Integer> primeNumbers=new HashSet();
		primeNumbers.addAll(Arrays.asList(1,3,5,7,11,13));
		System.out.println("PRIME NUMBERS "+ primeNumbers);
		System.out.println("Total Number of Prime Numbers"+ primeNumbers.size());
		
		Set<Integer> oddNumbers=new HashSet();
		oddNumbers.addAll(Arrays.asList(1,3,5,7,9,13,15));
		System.out.println("ODD NUMBERS "+ oddNumbers);
		System.out.println("Total Number of ODD Numbers"+ oddNumbers.size());
		
		Set<Integer> unionSet=new HashSet(primeNumbers);
		unionSet.addAll(oddNumbers);
		System.out.println("UNION "+ unionSet);
		System.out.println("Size of Union"+ unionSet.size());
		
		
		Set<Integer> intersection=new HashSet(primeNumbers);
		unionSet.retainAll(oddNumbers);
		System.out.println("INTERSECTION "+ intersection);
		System.out.println("Size of INTERSECTION"+ intersection.size());
		
		Set<Integer> diff=new HashSet(primeNumbers);
		diff.removeAll(oddNumbers);
		System.out.println("DIFFERENCE "+ diff);
		System.out.println("Size of DIFFERENCE"+ diff.size());
		
		
	}

}
