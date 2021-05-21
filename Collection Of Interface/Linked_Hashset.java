package com.anna.msc;

import java.util.*;

public class Linked_Hashset {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> Linked_HS1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> Linked_HS2 = new LinkedHashSet<Integer>();
		
		Linked_HS1.add(45);
		Linked_HS1.add(25);
		Linked_HS1.add(19);
		Linked_HS1.add(45);
		System.out.println("First HashSet is:\n"+Linked_HS1+"\n");
		System.out.println("The hashcode of first HashSet is:\n"+Linked_HS1.hashCode()+"\n");
		
		Linked_HS2.add(19);
		Linked_HS2.add(70);
		Linked_HS2.add(25);
		Linked_HS2.add(45);
		Linked_HS2.add(70);
		Linked_HS2.add(90);
		System.out.println("Second HashSet is:\n"+Linked_HS2+"\n");
		
		if (Linked_HS2.containsAll(Linked_HS1))
			System.out.println("Linked_HS1 is a subset of Linked_HS2");
		else
			System.out.println("Linked_HS1 is a not subset of Linked_HS2");
		
		if (Linked_HS1.equals(Linked_HS2))
			System.out.println("Linked_HS1 is eqaual to Linked_HS2");
		else
			System.out.println("Linked_HS1 and Linked_HS2 are not equal");
		
		Linked_HS1.retainAll(Linked_HS2);
		System.out.println("Retaining the elements of Hashset2 in Hashset1:\n"+Linked_HS1+"\n");
		
		Linked_HS2.removeAll(Linked_HS1);
		System.out.println("Removing all elements of Hashset1 from Hashset2:\n"+Linked_HS2+"\n");
		
		System.out.println("The first HashSet Hashset1 is:\n"+Linked_HS1+"\n");
		System.out.println("The second HashSet Hashset2 is:\n"+Linked_HS2+"\n");
        
		Linked_HS1.remove(25);
		System.out.println("The first HashSet Hashset1 after removing elements is:\n"+Linked_HS1);


	}

}

