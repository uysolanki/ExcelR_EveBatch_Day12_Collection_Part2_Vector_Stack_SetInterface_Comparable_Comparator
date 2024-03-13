package day10.collection;

import java.util.Comparator;

public class RnoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRno() == o2.getRno())
			return 0;
		else if(o1.getRno() > o2.getRno())
			return 1;
		else return -1;
	}

}
