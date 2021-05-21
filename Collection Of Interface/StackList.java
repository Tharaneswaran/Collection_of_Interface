package com.anna.msc;

import java.util.*;

public class StackList {

	public static void main(String[] args)
	{
		Stack<String> Stack1 = new Stack<String>(); 
		Stack<String> Stack2 = new Stack<String>();; 
		Stack1.push("I");
		Stack1.push("have");
		Stack1.push("bought");
		Stack1.push("new");
		Stack1.add("sport");
		Stack1.add(3, "a");
		Stack1.push("bike");
		System.out.println("The stack Stack1 is:\n" +Stack1+"\n");
		
		System.out.println("the capacity of Stack Stack1 is\n"+Stack1.capacity()+"\n");
		System.out.println("The hashcode of Stack Stack1 is:\n" +Stack1.hashCode()+"\n");
		
		Stack2=Stack1;
		System.out.println("The stack Stack2 is:\n" +Stack2+"\n");
		
		if(Stack2.equals(Stack1))
			System.out.println("The stacks Stack1 and Stack2 are equal\n");
		else
			System.out.println("The stacks Stack1 and Stack2 are Not equal\n");
		
		System.out.println("The top or Head of the stack Stack1 is:\n" +Stack1.peek()+"\n");
		System.out.println("The stack element popped from Stack1 is is:\n" +Stack1.pop()+"\n");

		System.out.println("The stack Stack1 is:\n" +Stack1+"\n");
	}

}
