package com.java.ram;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NvogableMapExmaple {
	public static void main(String[] args) {
		NavigableMap<String, Integer> navigableMap = new TreeMap<String, Integer>();
		navigableMap.put("chiru", 20);
		navigableMap.put("abc", 10);
		navigableMap.put("balu", 300);
		navigableMap.put("C++", 56);
		navigableMap.put("Java", 78);
		navigableMap.put("Scala", 90);
		navigableMap.put("Python", 89);

		NavigableSet<String> desc = navigableMap.descendingKeySet();

		System.out.println("Decending Navigleset : " + desc);

		NavigableMap<String, Integer> descMap = navigableMap.descendingMap();

		System.out.println("Decending Map: " + descMap);

		System.out.println("Map :" + navigableMap);

		// lowerKey returns key which is less than specified key
		System.out.println("lowerKey from Java : " + navigableMap.lowerKey("Java"));

		// floorKey returns key which is less than or equal to specified key
		System.out.println("floorKey from Java: " + navigableMap.floorKey("Java"));

		// ceilingKey returns key which is greater than or equal to specified key
		System.out.println("ceilingKey from Java: " + navigableMap.ceilingKey("Java"));

		// higherKey returns key which is greater specified key
		System.out.println("higherKey from Java: " + navigableMap.higherKey("Java"));

		// Apart from navigagtion methodk, it also provides useful method
		// to create subMap from existing Map e.g. tailMap, headMap and subMap

		// an example of headMap - returns NavigableMap whose key is less than specified
		NavigableMap<String, Integer> headMap = navigableMap.headMap("Python", false);
		System.out.println("headMap created form navigableMap : " + headMap);

		// an example of tailMap - returns NavigableMap whose key is greater than
		// specified
		NavigableMap<String, Integer> tailMap = navigableMap.tailMap("Scala", false);
		System.out.println("tailMap created form navigableMap : " + tailMap);

		// an example of subMap - return NavigableMap from toKey to fromKey
		NavigableMap<String, Integer> subMap = navigableMap.subMap("C++", false, "Python", false);
		System.out.println("subMap created form navigableMap : " + subMap);

	}
}
