package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
names.add("HI");
names.add("IM");
names.add("VERY");
names.add("STRANGE");
		//3. Print all the Strings using a standard for-loop
for(int i = 0; i < names.size(); i++){
	String s = names.get(i);
	System.out.println("String at element " + i + " " + s);
}
System.out.println("\n");
		//4. Print all the Strings using a for-each loop
for(String s : names){
	System.out.println(s);
}
System.out.println("\n");
		//5. Print only the even numbered elements in the list.
for (int i = 0; i<names; i++) {
	
}
if(names%2=0) {
	
}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
