package linkedlist;

/**
 *@author Aung Thet Pay
 * Programming Project 1 Start Project
 * CS131ON
 * 
 * @param <T> the type of data stored in the node
 * @version 1.0
 */
public class GenericNode<T> {
	
	private T data;           // data that the object stores
	private GenericNode<T> nextNode; // pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor to create a new node with null data and null next node.
	 */
	public GenericNode() {
		data = null;
		nextNode = null;
	}
	
	/**
	 * Constructor to create a new node with the given data and null next node.
	 * 
	 */
	public GenericNode(T data) {
		this.data = data;
		nextNode = null;
	}
	
	/**
	 * This method sets the data of the node.
	 * 
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * This method returns the data of the node.
	 * 
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * This method returns itself to the caller.
	 * 
	 */
	public GenericNode<T> getNode() {
		return this;
	}
	
	/**
	 * This method updates the pointer for the next node.
	 */
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	/**
	 * This method returns the node stored in the next node pointer.
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;
	}
}
