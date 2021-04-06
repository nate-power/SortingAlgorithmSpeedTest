import java.util.Random;
public class SortTest {

    public static void main(String[] args) {
        UnSortedArray coreData = new UnSortedArray(1000000);       
        long milliseconds;
        long start;
        long end;
        
        // Fill array with 1,000,000 random numbers between 1 and 3,000,000
        Random rand = new Random();
        for (int x = 0; x < 1000000; x++){
            coreData.addLast(rand.nextInt(3000000));
        }
        
        // Fill copies of coreData with the first 50 elements of coreData
        UnSortedArray selection50 = new UnSortedArray(50);
        UnSortedArray insertion50 = new UnSortedArray(50);
        UnSortedArray merge50 = new UnSortedArray(50);
        UnSortedArray quick50 = new UnSortedArray(50);
        
        for (int x = 0; x < 50; x++) {
            selection50.addLast(coreData.getData()[x]);
            insertion50.addLast(coreData.getData()[x]);
            merge50.addLast(coreData.getData()[x]);
            quick50.addLast(coreData.getData()[x]);
        }
        
        // Test each copy with the 4 sorts and print their times for 50 elements
        System.out.println("Sorting 50 elements-");
        start = System.nanoTime();
        selection50.selectionSort();
        end = System.nanoTime();
        System.out.println("\tSelection Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        insertion50.insertionSort();
        end = System.nanoTime();
        System.out.println("\tInsertion Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        merge50.mergeSort();
        end = System.nanoTime();
        System.out.println("\tMerge Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        quick50.quickSort();
        end = System.nanoTime();
        System.out.println("\tQuick Sort: " + (end - start) + " nanoseconds");
        
        
        // Fill copies of coreData with the first 1000 elements of coreData
        UnSortedArray selection1000 = new UnSortedArray(1000);
        UnSortedArray insertion1000 = new UnSortedArray(1000);
        UnSortedArray merge1000 = new UnSortedArray(1000);
        UnSortedArray quick1000 = new UnSortedArray(1000);
        
        for (int x = 0; x < 1000; x++) {
            selection1000.addLast(coreData.getData()[x]);
            insertion1000.addLast(coreData.getData()[x]);
            merge1000.addLast(coreData.getData()[x]);
            quick1000.addLast(coreData.getData()[x]);
        }
        
        // Test each copy with the 4 sorts and print their times for 1000 elements
        System.out.println("Sorting 1000 elements-");
        start = System.nanoTime();
        selection1000.selectionSort();
        end = System.nanoTime();
        System.out.println("\tSelection Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        insertion1000.insertionSort();
        end = System.nanoTime();
        System.out.println("\tInsertion Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        merge1000.mergeSort();
        end = System.nanoTime();
        System.out.println("\tMerge Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        quick1000.quickSort();
        end = System.nanoTime();
        System.out.println("\tQuick Sort: " + (end - start) + " nanoseconds");
        
        // Fill copies of coreData with the first 10000 elements of coreData
        UnSortedArray selection10000 = new UnSortedArray(10000);
        UnSortedArray insertion10000 = new UnSortedArray(10000);
        UnSortedArray merge10000 = new UnSortedArray(10000);
        UnSortedArray quick10000 = new UnSortedArray(10000);
        
        for (int x = 0; x < 10000; x++) {
            selection10000.addLast(coreData.getData()[x]);
            insertion10000.addLast(coreData.getData()[x]);
            merge10000.addLast(coreData.getData()[x]);
            quick10000.addLast(coreData.getData()[x]);
        }
        
        // Test each copy with the 4 sorts and print their times for 10000 elements
        System.out.println("Sorting 10000 elements-");
        start = System.nanoTime();
        selection10000.selectionSort();
        end = System.nanoTime();
        System.out.println("\tSelection Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        insertion10000.insertionSort();
        end = System.nanoTime();
        System.out.println("\tInsertion Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        merge10000.mergeSort();
        end = System.nanoTime();
        System.out.println("\tMerge Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        quick10000.quickSort();
        end = System.nanoTime();
        System.out.println("\tQuick Sort: " + (end - start) + " nanoseconds");
        
        // Fill copies of coreData with the first 100000 elements of coreData
        UnSortedArray selection100000 = new UnSortedArray(100000);
        UnSortedArray insertion100000 = new UnSortedArray(100000);
        UnSortedArray merge100000 = new UnSortedArray(100000);
        UnSortedArray quick100000 = new UnSortedArray(100000);
        
        for (int x = 0; x < 100000; x++) {
            selection100000.addLast(coreData.getData()[x]);
            insertion100000.addLast(coreData.getData()[x]);
            merge100000.addLast(coreData.getData()[x]);
            quick100000.addLast(coreData.getData()[x]);
        }
        
        // Test each copy with the 4 sorts and print their times for 10000 elements
        System.out.println("Sorting 100000 elements-");
        start = System.nanoTime();
        selection100000.selectionSort();
        end = System.nanoTime();
        System.out.println("\tSelection Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        insertion100000.insertionSort();
        end = System.nanoTime();
        System.out.println("\tInsertion Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        merge100000.mergeSort();
        end = System.nanoTime();
        System.out.println("\tMerge Sort: " + (end - start) + " nanoseconds");
        
        start = System.nanoTime();
        quick100000.quickSort();
        end = System.nanoTime();
        System.out.println("\tQuick Sort: " + (end - start) + " nanoseconds");
        
        // Fill copies of coreData with the first 1000000 elements of coreData
        UnSortedArray selection1000000 = new UnSortedArray(1000000);
        UnSortedArray insertion1000000 = new UnSortedArray(1000000);
        UnSortedArray merge1000000 = new UnSortedArray(1000000);
        UnSortedArray quick1000000 = new UnSortedArray(1000000);
        
        for (int x = 0; x < 1000000; x++) {
            selection1000000.addLast(coreData.getData()[x]);
            insertion1000000.addLast(coreData.getData()[x]);
            merge1000000.addLast(coreData.getData()[x]);
            quick1000000.addLast(coreData.getData()[x]);
        }
        
        // Test each copy with the 4 sorts and print their times for 10000 elements
        System.out.println("Sorting 1000000 elements-");
        start = System.nanoTime();
        selection1000000.selectionSort();
        end = System.nanoTime();
        milliseconds = (end - start) / 1000000;
        System.out.println("\tSelection Sort: " + (milliseconds) + " milliseconds");
        
        start = System.nanoTime();
        insertion1000000.insertionSort();
        end = System.nanoTime();
        milliseconds = (end - start) / 1000000;
        System.out.println("\tInsertion Sort: " + (milliseconds) + " milliseconds");
        
        start = System.nanoTime();
        merge1000000.mergeSort();
        end = System.nanoTime();
        milliseconds = (end - start) / 1000000;
        System.out.println("\tMerge Sort: " + (milliseconds) + " milliseconds");
        
        start = System.nanoTime();
        quick1000000.quickSort();
        end = System.nanoTime();
        milliseconds = (end - start) / 1000000;
        System.out.println("\tQuick Sort: " + (milliseconds) + " milliseconds");
    }      
}
