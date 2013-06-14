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
	
	/**
	 * Insert a node at the specified index
	 * @param index
	 * @param node
	 */
	public void insertAt(long index, ListNode<T> node){
		
	}
	
	/**
	 * This deletes the node that is at the head of the list
	 */
	public void deleteNode(){
		this.head = this.head.getNextNode();
		this.size--;
	}
	
	/**
	 * Get a node at a specified index
	 * The index is in the range from 1 to n
	 * Head is index 1 and tail is index n
	 * 
	 * @param index
	 * @return
	 */
	public ListNode<T> getNode(long index) throws IndexOutOfBoundsException{
		if(index>this.size || index<1){
			throw new IndexOutOfBoundsException("index "+index+" is not in the range " +
					"of 1 and "+this.size);
		}
		ListNode<T> node = this.getHead();
		for(long i = 1; i<index; i++){
			node = node.getNextNode();
		}
		return node;
	}

	public ListNode<T> getHead() {
		return this.head;
	}

	public long getSize() {
		return size;
	}
}
