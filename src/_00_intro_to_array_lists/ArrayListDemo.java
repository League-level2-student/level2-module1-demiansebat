package _00_intro_to_array_lists;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("Here's an ArrayList of Strings:\n");
		//Creating an ArrayList of Strings
		ArrayList<String> names = new ArrayList<String>();
		
		//Adding items to our list
		names.add("Jan");
		names.add("Sara");
		names.add("Fred");
		names.add("Marc");
		
		System.out.println("Here's an ArrayList of Strings:\n");
		//Iterating through our list with a standard for-loop
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		System.out.println("\n");
		
		//Setting an element in our list to be something new
		names.set(1, "Rebecca");
		
		//Iterating through our list with a for-each loop
		for(String s : names){
			System.out.println(s);
		}
		System.out.println("\n");
		//Printing the size of our list
		System.out.println(names.size());
		
		//Checking if our list contains a specific item
		//and printing whether it is in our list or not
		if(names.contains("Henry")) {
			System.out.println("Henry is in the list!");
		}
		else {
			System.out.println("Henry is not in the list.");
		}
		
		//Getting a specific element from our list using an index
		//and printing it out
		System.out.println(names.get(2));
		
		//Clearing our list of all items
		names.clear();
		
		//--------------------------------------------------------------------------
		
		System.out.println("Here's an ArrayList of Integers:\n");
		//Creating an ArrayList of Integers
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding items to our list
		numbers.add(7);
		numbers.add(-24);
		numbers.add(1);
		numbers.add(1040);
		numbers.add(-2327);
		
		//Iterating through our list with a standard for-loop
		for(int i = 0; i < numbers.size(); i++){
			Integer j = numbers.get(i);
			System.out.println(j);
		}
		System.out.println("\n");
		
		//Setting an element in our list to be something new
		numbers.set(2, 9001);
				
		//Iterating through our list with a for-each loop
		for(Integer j : numbers){
			System.out.println(j);
		}
		System.out.println("\n");
		
		//Printing the size of our list
		System.out.println(numbers.size());
		
		//Checking if our list contains a specific item
		//and printing whether it is in our list or not
		if(numbers.contains(-24)) {
			System.out.println("-24 is in the list!");
		}
		else {
			System.out.println("-24 is not in the list.");
		}
		
		//Getting a specific element from our list, using an index
		//and printing it out
		System.out.println(numbers.get(2));
		
		//Clearing our list of all items
		numbers.clear();
	}
}
