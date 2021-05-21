package com.anna.msc;

import java.util.ArrayList;  
public class Linkedlist
{  
   public static void main(String args[])
   
   { 
     //Creating a Array list	   
      ArrayList<String> Cars=new ArrayList<String>();  
      Cars.add("Nissan");
      Cars.add("BMW");
      Cars.add("Toyota");
      Cars.add("Mini");
      Cars.add("Hyundai");
      Cars.add("MG");
  
      //displaying elements
      System.out.println("Created Array List is:"+ Cars);
  
      //Adding "Mercedes Benz" at the fourth position
      Cars.add(3, "Mercedes Benz");
  
      //Displaying elements
      System.out.println("\nAfter Adding a element in index 4th position 'Mercedes Benz' in  Array List is:"+ Cars);
      
      //Changing a element in the Array List
      Cars.set(0, "Suzuki");
      
      //Displaying elements
      System.out.println("\nAfter Changing the 1st element to 'Suzuki' in  Array List is:"+ Cars);
      
      //Removing a element in 6th position in the Array List
      Cars.remove(5);
      
      //Displaying elements
      System.out.println("\nAfter Removing the 6th element in  Array List is:"+ Cars);
      
      //Get the element from the arraylist
      String str = Cars.get(2);
      
      //Displaying elements
      System.out.println("\nElement searched in index 3th position in  Array List is: "+ str);
   }  
}

