package com.dsa.demo;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation<String> str = new StackImplementation();
		str.push("Yaseen");
		str.push("Yaseen");
		str.push("Yaseen");
		str.push("Yaseen");
		str.push("Yaseen");
		str.push("Yaseen"); 
		
		           Iterator<String> itr= str.iterator();
		           while(itr.hasNext()) {
		        	   
		        	    System.out.println(itr.next());
		           }
		
	}

}
