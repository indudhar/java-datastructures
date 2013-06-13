package org.indu.datastructures.linkedlist;

/**
 * Linked List - a recursive data type (reference to itself)
 * 
 * Advantages over array lists:
 *   
 *   Inserting in the middle of the list takes small amount of time assuming
 *   we have reference to the previous hook
 *   
 *   ListNode can grow as long as it wants!
 *   
 * Disadvantages
 * 
 *   Finding nth item in a linked list is expensive.
 *   You have to start at the head and walk through until (n-1) nodes.
 *   
 *   
 * 
 * @author Indu Devanath
 *
 */

public class LinkedList<T> {

	private ListNode<T> head;
	private long size;
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	/**
	 * Creates a new node and inserts it right next to this node containing the new item.
	 * @param i
	 */
	public void insertAfter(T i){
		this.head = new ListNode<T>(i,this.head);
		size++;
	}

	public ListNode<T> getHead() {
		return this.head;
	}

	public long getSize() {
		return size;
	}
}
