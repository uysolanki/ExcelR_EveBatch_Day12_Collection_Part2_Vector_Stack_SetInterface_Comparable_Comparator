package day10.collection;

import java.util.Comparator;

public class PercentageComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getPercentage() == o2.getPercentage())
			return 0;
		else if(o1.getPercentage() > o2.getPercentage())
			return 1;
		else return -1;
	}

}
