package org.indu.datastructures.linkedlist;

/**
 * Nodes in a Doubly Linked list
 * They have references to both the next node and the previous node.
 * 
 * @author Indu Devanath
 *
 */
public class DoublyLinkedNode<T> {
	private DoublyLinkedNode<T> nextNode;
	private DoublyLinkedNode<T> previousNode;
	private T item;
	
	/**
	 * Create a head node. This will have no reference to either the next or previous node.
	 * @param i
	 */
	public DoublyLinkedNode(T i){
		this.item = i;
		this.nextNode = null;
		this.previousNode = null;
	}

	/**
	 * 
	 * @param i
	 * @param node
	 */
	public DoublyLinkedNode(T i, DoublyLinkedNode<T> node){
		this.item = i;
		this.nextNode = node;
		this.previousNode = null;
	}
	
	public DoublyLinkedNode<T> getNextNode() {
		return nextNode;
	}

	public DoublyLinkedNode<T> getPreviousNode() {
		return previousNode;
	}

	public T getItem() {
		return item;
	}
	
	@Override
	public String toString(){
		return this.item.toString();
	}
}
