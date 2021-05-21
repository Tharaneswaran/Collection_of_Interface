package com.anna.msc;

import java.util.ArrayList;  
public class Arraylist
{  
   public static void main(String args[])
   
   { 
     //Creating a Array list	   
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Tharan");
      alist.add("Nishu");
      alist.add("Rishal");
      alist.add("Vishnu");
      alist.add("Sathish");
      alist.add("Rajesh");
  
      //displaying elements
      System.out.println("Created Array List is:"+ alist);
  
      //Adding "Karthik" at the fourth position
      alist.add(3, "Karthik");
  
      //Displaying elements
      System.out.println("\nAfter Adding a element 'Karthik' in  Array List is:"+ alist);
      
      //Changing a element in the Array List
      alist.set(2, "Yogesh");
      
      //Displaying elements
      System.out.println("\nAfter Changing the 3rd element to 'Yogesh' in  Array List is:"+ alist);
      
      //Removing a element in 2nd position in the Array List
      alist.remove(1);
      
      //Displaying elements
      System.out.println("\nAfter Removing the 2rd element in  Array List is:"+ alist);
      
      //Get the element from the arraylist
      String str = alist.get(4);
      
      //Displaying elements
      System.out.println("\nElement searched in index 5th position in  Array List is: "+ str);
   }  
}

