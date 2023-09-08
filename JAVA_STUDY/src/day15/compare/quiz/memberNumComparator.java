package day15.compare.quiz;

import java.util.Comparator;

public class memberNumComparator implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
	
		return o1.name.compareTo(o2.name);
	}
	

}
