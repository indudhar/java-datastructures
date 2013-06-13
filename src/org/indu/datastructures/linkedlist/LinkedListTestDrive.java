package org.indu.datastructures.linkedlist;

import org.indu.logging.Logger;

/**
 * Testing ListNode class
 * 
 * @author Indu Devanath
 *
 */
public class LinkedListTestDrive {

	private static StringBuffer listString;
	
	public static void main(String... args) {
		//creating an empty linked list;
		LinkedList<String> linkedList = new LinkedList<>();
		displayList(linkedList.getHead());
		
		//add a node to the empty linked list
		linkedList.insertAfter("South Africa");
		displayList(linkedList.getHead());
		
		//add a node at the head of the list
		linkedList.insertAfter("Norway");
		displayList(linkedList.getHead());
		
		//add another node at the head of the list
		linkedList.insertAfter("Lithuania");
		displayList(linkedList.getHead());
		
		//.... and so on
		
	}
	
	private static void displayList(ListNode<String> node){
		if(node==null){
			Logger.info("empty list");
			return;
		}
		if(listString==null){
			listString = new StringBuffer(node.toString());
		}else{
			listString.append(" -> "+node.toString());
		}
		if(node.getNextNode()!=null){
			displayList(node.getNextNode());
		}else{
			Logger.info(listString);
			listString = null;
		}
	}

}
