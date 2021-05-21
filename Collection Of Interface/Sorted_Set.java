package com.anna.msc;

import java.util.*;

public class Sorted_Set{
  
    public static void main(String[] args)
    {
        SortedSet<String> state
            = new TreeSet<String>();
  
      
        state.add("Tamil Nadu");
        state.add("Karnataka");
        state.add("Jammu Kashmir");
        state.add("Assam");
        
        
        state.add("Tamil Nadu");
  
       
        System.out.println("Initial Array is: "+ state);
  
        
        state.remove("Jammu Kashmir");
        System.out.println("\nSet after removing " + "Jammu Kashmir:" + state);
  
       
        System.out.println("\nIterating over set:");
        Iterator<String> i = state.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}