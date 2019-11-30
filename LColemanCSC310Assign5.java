package lcolemancsc310assign5;

// Java program to implement a Heap with remove_max() capabilities 
public class LColemanCSC310Assign5 {
    public void sort(int arr[]){ 
        int n = arr.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        // Extract one element at a time from heap 
        for (int i=n-1; i>=0; i--){ 
            // Move root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
             
            heapify(arr, i, 0); 
        } 
    }
    
   
    void heapify(int arr[], int n, int i){ 
        int largest = i;  
        int l = 2*i + 1; 
        int r = 2*i + 2; 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        // If largest is not root 
        if (largest != i){ 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    } 
  
    // A function to print array 
    static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) { 
        int arr[] = {9,7,5,2,6,4}; 
        int n = arr.length; 
  
        LColemanCSC310Assign5 ob = new LColemanCSC310Assign5(); 
        ob.sort(arr); 
  
        System.out.println("Sorted array is"); 
        printArray(arr); 
    } 
}
