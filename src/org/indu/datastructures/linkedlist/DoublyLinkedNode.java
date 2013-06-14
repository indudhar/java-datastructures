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
}
