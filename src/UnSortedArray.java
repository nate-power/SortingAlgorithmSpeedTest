public class UnSortedArray {
    private int[] data;
    private int maxSize;
    private int numElements;
    
    public UnSortedArray (int size) {
        maxSize = size;
        data = new int[size];
        numElements = 0;
    }
    
    public int[] getData() {
        return data;
    }
    
    // To add items to array at the end
    public void addLast(int item) {
        if (numElements < maxSize) {
            data[numElements] = item;
            numElements++;
        }
    }
    
    // All sorts are in ascending order
    
    // Selection Sort
    public void selectionSort() {
        for (int start = 0; start < numElements - 1; start++) {
            int smallestLoc = start;
            for (int pos = start + 1; pos < numElements; pos++) {
                if (data[pos] < data[smallestLoc]) {
                    smallestLoc = pos;                 
                }
            }
            int temp = data[start];
            data[start] = data[smallestLoc];
            data[smallestLoc] = temp; 
        }
    }
    
    // Insertion Sort
    public void insertionSort() {
        for (int start = 1; start < numElements; start++) {
            int temp = data[start];
            int pos = start - 1;            
            while (pos >= 0 && data[pos] > temp){
                data[pos + 1] = data[pos];
                pos--;
            }
            data[pos + 1] = temp;            
        }
    }
    
    // Merge Sort
    public void mergeSort() {
        mergeSortWorker(0, numElements - 1);
    }
    
    private void mergeSortWorker(int lowerBound, int upperBound) {
        int mid;
        if (lowerBound < upperBound){
            mid = (lowerBound + upperBound) / 2;
            mergeSortWorker(lowerBound, mid);
            mergeSortWorker(mid + 1, upperBound);
            merge(lowerBound, mid, upperBound);
        }
    }  
    
    private void merge(int lo, int mid, int hi) {
        int i, j, k;
        int[] temp = new int[hi - lo + 1];
        i = lo; j = mid+1; k = 0;
        while (i <= mid && j <= hi) {
            if (data[i] < data[j]) {
               temp[k] = data[i];
               i++;               
            }
            else {
               temp[k] = data[j];
               j++;
            }
            k++;
        }
        while (i <= mid) {
           temp[k] = data[i];
           k++;
           i++;              
        }
        while (j <= hi) {
           temp[k] = data[j];
           k++;
           j++;
        }
        for (i = lo; i <= hi; i++){
            data[i] = temp[i - lo];
        }
    }
    
    // Quick Sort
    public void quickSort() {
        quickSortHelper(0, numElements - 1);
    }
    
    private void quickSortHelper(int low, int high) {
        if (low < high) {
            int pivotPosition = partition(low, high);
            quickSortHelper(low, pivotPosition - 1);
            quickSortHelper(pivotPosition + 1, high);
        }
    }
    
    private int partition(int low, int high) {
        int pivot = high; // highest index is the pivot
        int left = low;
        int right = high - 1;
        while (left <= right) {
            while(data[left] < data[pivot]) {
                left++;
            }
            while(right >= 0 && data[right] > data[pivot]) {
                right--;
            }
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }
        int temp = data[left];
        data[left] = data[pivot];
        data[pivot] = temp;
        return left;           
    }    
}
