package com.novonordisk.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsMain {
	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		
		ArrayList<String> names =  new ArrayList<String>();
		System.out.println(names.size());
		names.add("Reema");
		names.add("Soma");
		names.add("Rohit");
		names.add("Rohit");
		System.out.println(names.size());
		System.out.println(names);
		names.remove("Soma");
		System.out.println(names);
		System.out.println(names.size());
		
		System.out.println("2. HashSet");
		
		HashSet<String> namesSet =  new HashSet<String>();
		System.out.println(namesSet.size());
		namesSet.add("Reema");
		namesSet.add("Soma");
		namesSet.add("Rohit");
		namesSet.add("Rohit");
		System.out.println(namesSet.size());
		System.out.println(namesSet);
		namesSet.remove("Soma");
		System.out.println(namesSet);
		System.out.println(namesSet.size());
		
		System.out.println("3. TreeSet");
		
		TreeSet<String> namesTreeSet =  new TreeSet<String>();
		System.out.println(namesTreeSet.size());
		namesTreeSet.add("Reema");
		namesTreeSet.add("Soma");
		namesTreeSet.add("Soma");
		namesTreeSet.add("Rohit");
		namesTreeSet.add("Rohit");
		namesTreeSet.add("Rohit");
		System.out.println(namesTreeSet.size());
		System.out.println(namesTreeSet);
		namesTreeSet.remove("Soma");
		System.out.println(namesTreeSet);
		System.out.println(namesTreeSet.size());
		
		
		
		
	}
}
