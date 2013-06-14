package org.indu.datastructures.linkedlist;

import org.indu.logging.Logger;

/**
 * 7. Testing ListNode class
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
		Logger.info("size = "+linkedList.getSize());

		//add a node to the empty linked list
		linkedList.insertAfter("South Africa");
		displayList(linkedList.getHead());
		Logger.info("size = "+linkedList.getSize());

		//add a node at the head of the list
		linkedList.insertAfter("Norway");
		displayList(linkedList.getHead());
		Logger.info("size = "+linkedList.getSize());

		//add another node at the head of the list
		linkedList.insertAfter("Lithuania");
		displayList(linkedList.getHead());
		Logger.info("size = "+linkedList.getSize());

		//get node nth node
		ListNode<String> node = linkedList.getNode(0);
		Logger.info(" 1 -> "+node.toString());

		//delete node at the head of the list
		linkedList.deleteNode();
		displayList(linkedList.getHead());
		Logger.info("size = "+linkedList.getSize());



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
