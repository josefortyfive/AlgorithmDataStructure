package linkedlist;


public class CicularlyLinkedList<E> {

	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E e, Node<E>n) {
			element = e;
			next = n;
		}
		
		public E getElement() { return element; }
		public Node<E> getNext(){ return next; }
		public void setNext(Node<E> n) { next = n; }
	}
	
	private Node<E> tail = null; 			// we store tail (but not the head)
	private int size = 0;					// number of nodes in the list
	public CicularlyLinkedList() { }		// Constructor is empty
	
	//access methods
	
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E first() {
		if(isEmpty()) { return null;}
		return tail.getNext().getElement();			// the head is *after * the tail
	}
	
	
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	public void rotate() {
		if(tail != null) {					// if empty, do nothing
			tail = tail.getNext();			// the old head becomes new tail;
		}
	}
	
	
	public void addFirst(E e) {
		if(size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail);			// link to itself circularly
		}
		else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	public void addLast(E e) {			// adds element e to the end of the list
		addFirst(e);					// insert new element at front of list
		tail = tail.getNext();			// now new element becomes the list
	}
	
	public E removeFirst() {
		if(isEmpty()) return null;			// nothing to remove;
		Node<E> head = tail.getNext();			
		if(head == tail) tail = null; 		//must be the only node left
		else {
			tail.setNext(head.getNext());		//removes "head" from the list
		}
		size--;
		return head.getElement();
	}
	
}
