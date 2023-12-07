package array;

import java.util.Arrays;
import java.util.Comparator;
 
public class ReorderArray {
 
    // Comparator function to sort pairs based on the second
    // element
    static class PairComparator
        implements Comparator<int[]> {
        @Override
        public int compare(int[] pair1, int[] pair2)
        {
            // Sort in ascending order of index values
            return Integer.compare(pair1[1], pair2[1]);
        }
    }
 
    // Function to reorder elements of arr[] according to
    // index[]
    static void reorder(int[] arr, int[] index, int n)
    {
        // Create a 2D array to store pairs (original
        // element, index)
        int[][] pairs = new int[n][2];
 
        // Populate the pairs array
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = index[i];
        }
 
        // Sort the pairs array based on the second element
        // (index)
        Arrays.sort(pairs, new PairComparator());
 
        // Copy the sorted elements back to the original
        // arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = pairs[i][0];
        }
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int[] arr = { 50, 40, 70, 60, 90 };
        int[] index = { 3, 0, 4, 1, 2 };
        int n = arr.length;
 
        // Call the reorder function to rearrange elements
        // in arr[] based on index[]
        reorder(arr, index, n);
 
        System.out.println("Reordered array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}