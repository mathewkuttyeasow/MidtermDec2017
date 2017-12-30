package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){

        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){

                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        for (int i =1; i <array.length; i++){
            for (int x = i; x > 0; x--){
                if (array[i] < array[x-1]){
                    int temp = array[x];
                    array[x] = array[x - 1];
                    array[x - 1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i = 0; i < array.length; i++){
            for (int x = 1; x <array.length -1; x++){
                if (array[x - 1] > array[x]) {
                    int temp = array[x - 1];
                    array[x - 1] = array[x];
                    array[x] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] quickSort(int [] array){}
        int [] list = array;
        //implement here

    public int[] quickSort(int[] array, int low, int high){
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        if (low < high) {
            int n = part(array, low, high);
            quickSort(array, n + 1, n - 1;
            quickSort(array, n + 1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long exectionTime = endTime - startTime;
        this.executionTime = exectionTime;
        return list;
    }
    public int [] heapSort(int [] array){}
        int [] list = array;
        //implement here

    public int[] heapSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int i = array.length - 1; i >= 1; i--) {
            int t = array[0];
            array[0] = array[i];
            array[i] = t;
            heapSorting(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executiveTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] bucketSort(int [] array){}
        int [] list = array;
        //implement here

    public int [] bucketSort (int [] array) {
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        int value = getMax(array);
        int[] bucket = new int[value + 1];
        for (int i = 0; i < bucket.length; i ++) {
            bucket [i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            bucket[array [i]]++;
        }
        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
