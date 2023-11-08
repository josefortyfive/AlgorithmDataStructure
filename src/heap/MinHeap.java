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
	
	// Decrease value of given key to new_val
	// It is assumed that new_val is smaller than heapArray[key].
	
	public void decreaseKey(int key, int new_val) {
		heapArray[key] = new_val;
		
		while(key != 0 && heapArray[key] < heapArray[parent(key)]) {
			swap(heapArray, key, parent(key));
			key = parent(key);
		}
	}
	
	
	public int getMin() {
		return heapArray[0];
	}
	
	
	public int extractMin() {
		if(current_heap_size <= 0) {
			return Integer.MAX_VALUE;
		}
		
		if(current_heap_size == 1) {
			current_heap_size--;
			
			return heapArray[0];
		}
		
		int root = heapArray[0];
		
		
		heapArray[0] = heapArray[current_heap_size - 1];
		current_heap_size--;
		MaxHeapify(0);
		
		return root;
	}
	
	
	// This function deletes key at the given index. It first reduced value
	// to minus infinite, then calls extractMin()
	
	public void deleteKey(int key) {
		decreaseKey(key, Integer.MIN_VALUE);
		extractMin();
	}
	// A recursive method to heapify a subtree
	
	private void MinHeapify(int key) {
		int l = left(key);
		int r = right(key);
		
		int smallest = key;
		
		if( l < current_heap_size && heapArray[l] < heapArray[smallest]) {
			smallest = l;
		}
		
		if( r < current_heap_size && heapArray[r] < heapArray[smallest]) {
			smallest = r;
		}
		
		if(smallest != key) {
			swap(heapArray, key, smallest);
			MinHeapify(smallest);
		}
	}
	
	// Increases the value of given key to new_val.
	// It is assumed that new_val is greater
	// than heapArray[key].
	// Heapify from the given key
	
	public void increaseKey(int key, int new_val) {
		heapArray[key] = new_val;
		MinHeapify(key);
	}
	
	// Changes value on a key
	
	public void changeValueOnAKey(int key, int new_val) {
		if(heapArray[key] == new_val) {
			return;
		}
		
		if(heapArray[key] < new_val) {
			increaseKey(key, new_val);
		} else {
			decreaseKey(key, new_val);
		}
	}
}
