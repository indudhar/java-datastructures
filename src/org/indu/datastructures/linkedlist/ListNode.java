package org.indu.datastructures.linkedlist;

/**
 *  Node for a Linked List 
 * 
 * @author Indu Devanath
 *
 */
public class ListNode<T> {

	private T item;
	private ListNode<T> nextNode;  //reference to itself
	
	/**
	 * Creates a new ListNode taking item and reference to next node.
	 * @param i
	 * @param n
	 */
	public ListNode(T i, ListNode<T> n){
		this.item = i;
		this.nextNode = n;
	}
	
	/**
	 * Creates an node with just an item and reference to null.
	 * This is how a list starts.
	 * This will also be the right most tip of the linked list.
	 * @param i
	 */
	public ListNode(T i){
		this.item = i;
		this.nextNode = null;
	}
	
	public T getItem() {
		return item;
	}

	public ListNode<T> getNextNode() {
		return nextNode;
	}
	
	@Override
	public String toString(){
		return this.item.toString();
	}
	
}
