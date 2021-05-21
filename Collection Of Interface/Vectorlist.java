package com.anna.msc;

import java.util.*;

public class Vectorlist {

	public static void main(String[] args) {
		Vector<Integer> Vector1 = new Vector<Integer>(4); 
		Vector<Integer> Vector2 = new Vector<Integer>(4); 
		Vector1.add(10); 
		Vector1.add(12); 
		Vector1.add(13);
		Vector1.add(3,3);
		System.out.println("The first Vector is:\n" +Vector1+"\n");
		
		Vector1.set(3,14);
		System.out.println("The first Vector after changing 4th element is:\n" +Vector1+"\n");
		
		System.out.println("The capacity of first Vector is:\n" +Vector1.capacity()+"\n");
		System.out.println("The hashcode of first Vector is:\n" +Vector1.hashCode()+"\n");
		
		Vector1.ensureCapacity(15);
		System.out.println("Now The capacity of first Vector is:\n" +Vector1.capacity()+"\n");
		
		Vector2.addAll(Vector1);
		System.out.println("The Second Vector is:\n" +Vector2+"\n");
		Vector2.ensureCapacity(10);
		System.out.println("The capacity of second Vector is:\n" +Vector2.capacity()+"\n");
	
		Vector2.add(4,15);
		Vector2.add(5,16);
		Vector2.add(6,17);
		Vector2.add(7,18);
		Vector2.add(8,19);
		Vector2.add(9,10);
		System.out.println("Now The Second Vector is:\n" +Vector2+"\n");
		
		if(Vector2.containsAll(Vector1))
		{
			System.out.println("Vector1 is a subset of Vector2");
		}
		else
			System.out.println("Vector1 is Not a subset of Vector2");
		
		Vector2.removeAll(Vector1);
		Vector2.remove(4);
		Vector2.removeElementAt(3);
		System.out.println("The Second Vector after removing elements is:\n" +Vector2+"\n");
		
		Vector2.removeAllElements();
		if (Vector2.isEmpty())
		{
			System.out.println("All elements from Vector2 are removed");
			System.out.println("Now the capacity of Vector2 is\n"+Vector2.capacity()+"\n");
		}
		else
			System.out.println("The Second Vector is:\n" +Vector2+"\n");
		
		Vector2.ensureCapacity(15);
		Vector2.add(13);
		Vector2.add(15);
		System.out.println("The Second Vector is:\n" +Vector2+"\n");
		System.out.println("The First Vector is:\n" +Vector1+"\n");
		Vector1.retainAll(Vector2);
		System.out.println("The First Vector after retaining elements From Vector2 is:\n" +Vector1+"\n");
		
		

		
	}

}
