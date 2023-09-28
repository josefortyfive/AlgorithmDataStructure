package linkedlist;

public class DoublyLinkedList<E> {

	// nested Node class
	
	public static class Node<E>{
		private E element;
		private Node<E> prev;
		private Node<E> next;
		
		public Node(E e, Node<E> p, Node <E> n) {
			element = e;
			prev = p;
			next = n;
		}
		
		
		public E getElement() { return element; }
		public Node<E> getPrev() { return prev; }
		public Node<E> getNext() { return next; }
		public void setPrev(Node<E> p) { prev = p; }
		public void setNext(Node<E> n) { next = n; }
	}
	
	public Node<E> header;			// header sentinel
	public Node<E> trailer;			// trailer sentinel
	public int size = 0;
	
	public DoublyLinkedList() {
		header = new Node<> (null, null, null); // create header
		trailer = new Node<>(null, header, null); 		// trailer is preceded by header
		header.setNext(trailer);
	}
	
	
	public int size() { return size; }
	
	public boolean isEmpty() { return size == 0; }
	
	public E first() {
		if(isEmpty()) return null;
		return header.getNext().getElement();
	}
	
	
	public E last() {
		if(isEmpty()) return null;
		return trailer.getPrev().getElement();  // return the last element is before trailer;
	}
	
	
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());  // place just after the header
	}
	
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	public E removeFirst() {
		if(isEmpty()) return null;			// nothing to remove
		return remove(header.getNext());	// first element is beyond header
	}
	
	public E removeLast() {
		if(isEmpty()) return null;
		return remove(trailer.getPrev());			//last element is before trailer
	}
	
	
	//private update methods
	// Adds element e to the linked list in between the given nodes */
	
	public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		// create and link a new node
		
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	
	public E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> sucessor = node.getNext();
		predecessor.setNext(sucessor);
		sucessor.setPrev(predecessor);
		size--;
		
		return node.getElement();
	}
	
	
	
	
}
