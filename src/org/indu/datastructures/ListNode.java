package org.indu.datastructures;

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
	
	/**
	 * Creates a new node and inserts it right next to this node containing the new item.
	 * @param i
	 */
	public void insertAfter(T i){
		this.nextNode = new ListNode<T>(i,this.nextNode);
	}

	public T getItem() {
		return item;
	}

	public ListNode<T> getNextNode() {
		return nextNode;
	}
	
}
