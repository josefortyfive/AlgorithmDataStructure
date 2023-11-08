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
	
	private void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}

	private int parent(int key) {
		return (key - 1 ) / 2;
		
	}
	
	
	private int left(int key) {
		return 2 * key + 1;
	}
	
	private int right(int key) {
		return 2 * key + 2;
	}
	
	
	public boolean insertKey(int key) {
		
		if(current_heap_size == capacity) {
			
			// if heap is full return false
			
			return false;
		}
		
		// First insert the new key at the end
		
		int i = current_heap_size;
		heapArray[i] = key;
		current_heap_size++;
		
		while(i != 0 && heapArray[i] < heapArray[parent(i)]) {
			swap(heapArray, i, parent(i));
			i = parent(i);
		}
		
		return true;
	}
}
