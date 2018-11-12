package com.java6.ram;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {

	public static void main(String[] args) {
		  Deque<String> deque = new ArrayDeque<String>();

		
		        // We can add elements to the queue in various ways
		
		        deque.add("xx"); // add to tail
		
		        deque.addFirst("yy");
		
		        deque.addLast("zz");
		
		        deque.push("vv"); //add to head
		
		        deque.offer("yy");
		
		        deque.offerFirst("bb");
		
		        deque.offerLast("aa");
		
		         
		
		        System.out.println(deque + "\n");
		
		 
		
		        // Iterate through the queue elements.
		
		        System.out.println("Standard Iterator");
		
		        Iterator<String> iterator = deque.iterator();
		
		        while (iterator.hasNext()) {
		
		            System.out.println("\t" + iterator.next());
		
		        }
		
		         
		
		        // Reverse order iterator
		 
		        Iterator<String> reverse = deque.descendingIterator();
		 
		        System.out.println("Reverse Iterator");
		 
		        while (reverse.hasNext()) {
		 
		            System.out.println("\t" + reverse.next());
		 
		        }
		 
		         
		 
		        // Peek returns the head, without deleting it from the deque
		 
		        System.out.println("Peek " + deque.peek());
		 
		        System.out.println("After peek: " + deque);
		 
		         
		 
		        // Pop returns the head, and removes it from the deque
		 
		        System.out.println("Pop " + deque.pop());
		  
		        System.out.println("After pop: " + deque);
		 
		         
		 
		        // We can check if a specific element exists in the deque
		 
		        System.out.println("Contains element 3: " + deque.contains("Element 3 (Tail)"));
		 
		         
		 
		        // We can remove the first / last element.
		 
		        deque.removeFirst();
		
		        deque.removeLast();
		
		        System.out.println("Deque after removing first and last: " + deque);  
		
		    }


	}


