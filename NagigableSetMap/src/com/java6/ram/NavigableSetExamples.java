package com.java6.ram;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExamples {
	public static void main(String[] args) {

		NavigableSet<Integer> navigableSet = new TreeSet<Integer>();
		navigableSet.add(20);
		navigableSet.add(5);
		navigableSet.add(4);
		navigableSet.add(90);
		navigableSet.add(16);
		navigableSet.add(78);
		System.out.println(navigableSet);
		NavigableSet<Integer> sub = navigableSet.subSet(4, true, 20, true);
		System.out.println("Sub Set :" + sub);
		NavigableSet<Integer> tailSet = navigableSet.tailSet(20, true);
		System.out.println(tailSet);
		System.out.println("Tail Set :" + tailSet);
		NavigableSet<Integer> headSet = navigableSet.headSet(20, true);
		System.out.println("Head set: " + headSet);
		System.out.println("Celing :" + navigableSet.ceiling(78));
		System.out.println("Floor :" + navigableSet.floor(78));

		System.out.println("Lower :" + navigableSet.lower(78));

		navigableSet.pollFirst();

		System.out.println("Poll First :" + navigableSet);

		navigableSet.pollLast();

		System.out.println("Poll Last :" + navigableSet);

	}

}
