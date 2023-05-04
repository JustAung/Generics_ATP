package linkedlist;

/**
 * @author Aung Thet Pay
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericLinkedList<T> {
	
	private GenericNode<T> head;
	
	/**
	 * This method checks whether the list is empty.
	 * 
	 * @return boolean true if the list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return (head == null);
	}
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * 
	 * @return GenericNode<T> the head node of the list
	 */
	public GenericNode<T> getHead() {
		return head;
	}
	
	/**
	 * This method adds a new node containing the given data to the end of the list.
	 * 
	 * @param data the data to be added to the list
	 */
	public void add(T data) {
		GenericNode<T> newNode = new GenericNode<>(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		GenericNode<T> currentNode = head;
		while (currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();
		}
		currentNode.setNextNode(newNode);
	}
	
	/**
	 * This method removes the first node containing the given data from the list.
	 * 
	 */
	public void remove(T data) {
		if (isEmpty()) {
			return;
		}
		if (head.getData().equals(data)) {
			head = head.getNextNode();
			return;
		}
		GenericNode<T> previousNode = head;
		GenericNode<T> currentNode = head.getNextNode();
		while (currentNode != null) {
			if (currentNode.getData().equals(data)) {
				previousNode.setNextNode(currentNode.getNextNode());
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
	}
	
	/**
	 * This method returns a string representation of the list.
	 * 
	 */
	@Override
	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		GenericNode<T> currentNode = head;
		while (currentNode.getNextNode() != null) {
			sb.append(currentNode.getData().toString()).append(", ");
			currentNode = currentNode.getNextNode();
		}
		sb.append(currentNode.getData().toString()).append("]");
		return sb.toString();
	}

}
