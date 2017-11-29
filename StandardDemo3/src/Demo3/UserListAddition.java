package Demo3;

import java.util.ArrayList;

public class UserListAddition {

	public static void main(String[] args) {
		//Creating a generic ArrayList to Add Users
        ArrayList<String> userList = new ArrayList<String>();
        //Adding User into list
        userList.add("User A");
        userList.add("User B");
        userList.add("User C");
        userList.add("User D");
 
        //Re check the size after adding elements
        System.out.println("Size of ArrayList after adding elements: " + userList.size());
 
        //Display all contents of ArrayList
        System.out.println("List of all elements: " + userList);
 
        //Remove some elements from the list
        userList.remove("D");
        System.out.println("See contents after removing one element: " + userList);
 
        //Remove element by index
        userList.remove(2);
        System.out.println("See contents after removing element by index: " + userList);
 
        //Check size after removing elements
        System.out.println("Size of arrayList after removing elements: " + userList.size());
        System.out.println("List of all elements after removing elements: " + userList);
 
        //Check if the list contains "K"
        System.out.println(userList.contains("K"));  
	}

}
