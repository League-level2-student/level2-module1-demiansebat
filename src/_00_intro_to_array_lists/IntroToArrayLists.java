package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
names.add("HELLO");
names.add("IM");
names.add("HIGHLY");
names.add("STRANGE");
names.add("OWO");
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
for (int i = 0;names.size()>i; i++) {
	if(i%2==0) {
		System.out.println(i);
	}
}
		//6. Print all the Strings in reverse order.
for (int i =names.size()-1;i>=0;i--) {
	if(i%2==0) {
		System.out.println(i);
	}
}
		//7. Print only the Strings that have the letter 'e' in them.
for (int i = names.size()-1;i>=0;i--) {
	String a=names.get(i);
	if(a.contains("E")){
		System.out.println(a);
	}
}
	}
}
