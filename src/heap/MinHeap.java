package heap;

public class MinHeap {
	
	private int[] heapArray;
	
	
	private int capacity;
	
	private int current_heap_size;
	
	
	public MinHeap(int n) {
		capacity = n;
		heapArray = new int[capacity];
		current_heap_size = 0;
	}

}
