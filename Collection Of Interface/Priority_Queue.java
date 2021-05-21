package com.anna.msc;

import java.util.*;

public class Priority_Queue {

	public static void main(String[] args )
	{
		 PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		 pq1.add(12);
		 pq1.add(41);
		 pq1.add(17);
		 pq1.add(10);
		 pq1.add(30);
		 pq1.add(25);
		 System.out.println("The PriortyQueue pq1 is:\n" +pq1+"\n");
		 
		 if(pq1.contains(30))
			 System.out.println("pq1 has element 30 in it");
		 else
			 System.out.println("pq1 does not contain 30");
		 
		 System.out.println("The first element PriortyQueue pq1 is:\n" +pq1.peek()+"\n");
		 System.out.println("Displaying and removing first element PriortyQueue pq1 is:\n" +pq1.poll()+"\n");
		 pq1.remove(17);
		 pq1.remove(12);
		 
		 System.out.println("The pq1 after removing elements is:\n" +pq1+"\n");
		 System.out.println(pq1.comparator());
		 
		 
	}

}
