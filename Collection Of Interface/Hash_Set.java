package com.anna.msc;

import java.util.*;

public class Hash_Set {

	public static void main(String[] args)
	{
		HashSet<Integer> HSt1 = new HashSet<Integer>();
		HashSet<Integer> HSt2 = new HashSet<Integer>();
		
		HSt1.add(100);
		HSt1.add(25);
		HSt1.add(100);
		HSt1.add(40);
		System.out.println("The first HashSet is:\n"+HSt1+"\n");
		System.out.println("The hashcode of first HashSet is:\n"+HSt1.hashCode()+"\n");
		
		HSt2.add(100);
		HSt2.add(70);
		HSt2.add(25);
		HSt2.add(40);
		HSt2.add(70);
		System.out.println("The Second HashSet is:\n"+HSt2+"\n");
		
		if (HSt2.containsAll(HSt1))
			System.out.println("HSt1 is a subset of HSt2");
		else
			System.out.println("HSt1 is a not subset of HSt2");
		
		if (HSt1.equals(HSt2))
			System.out.println("HSt1 is eqaual to HSt2");
		else
			System.out.println("HSt1 and HSt2 are not equal");
		
		HSt1.retainAll(HSt2);
		System.out.println("Retaining the elements of HSt2 in HSt1:\n"+HSt1+"\n");
		
		HSt2.removeAll(HSt1);
		System.out.println("Removing all elements of hs1 from HSt2:\n"+HSt2+"\n");
		
		System.out.println("The first HashSet HSt1 is:\n"+HSt1+"\n");
		System.out.println("The second HashSet HSt2 is:\n"+HSt2+"\n");
        
		HSt1.remove(25);
		HSt1.remove(100);
		System.out.println("The first HashSet HSt1 after removing elements is:\n"+HSt1);

	}

}
