package com.anna.msc ;

import java.util.*;
import java.util.Deque;
import java.util.Iterator;

public class Array_Dequeue {

	public static void main(String[] args)
	{
		 Deque<Integer> Array_DQ = new ArrayDeque<Integer>(10);
		 Array_DQ.add(15);
		 Array_DQ.add(20);
		 Array_DQ.add(18);
		 Array_DQ.add(50);
		 Array_DQ.add(41);
	        for (Integer element : Array_DQ)
	        {
	            System.out.println("Element : " + element);
	        }
	   
	        System.out.println("Using clear()");
	        Array_DQ.clear();
	        System.out.println("Above elements are removed now\n");
	        
	        Array_DQ.addFirst(40);
	        Array_DQ.addFirst(30);
	        Array_DQ.add(55);
	        Array_DQ.addLast(35);
	        Array_DQ.addLast(20);
	        
	        System.out.println("Elements of deque using Iterator:");
	        for(Iterator<Integer> itr = Array_DQ.iterator(); itr.hasNext();)
	        {
	            System.out.println(itr.next());
	        }
	 
	        System.out.println("Elements of deque in reverse order:");
	        for(Iterator<Integer> dItr = Array_DQ.descendingIterator(); 
	                                               dItr.hasNext();)
	        {
	            System.out.println(dItr.next());
	        }
	   
	        System.out.println("Head Element using element():\n" +Array_DQ.element()+"\n");

	        System.out.println("Head Element using getFirst():\n" +Array_DQ.getFirst()+"\n");
	        System.out.println("Last Element using getLast():\n" + Array_DQ.getLast()+"\n");
	   
	        Object[] arr = Array_DQ.toArray();
	        System.out.println("Array Size :\n" + arr.length +"\n");
	   
	        System.out.print("Array elements :\n");
	        for(int i=0; i<arr.length ; i++)
	            System.out.println(" " + arr[i]);
	              
	        System.out.println("Head element :\n" + Array_DQ.peek()+"\n");
	        System.out.println("Head element poll :\n" + Array_DQ.poll()+"\n");
	         
	        Array_DQ.push(200);
	        Array_DQ.push(100);
	        Array_DQ.push(360);
	        System.out.println("The updated Array_DQ is:\n" +Array_DQ+"\n"); 
	        System.out.println("Head element remove : " + Array_DQ.remove()+"\n");
	        System.out.println("The final array is: "+Array_DQ+"\n");
	  
	}

}
