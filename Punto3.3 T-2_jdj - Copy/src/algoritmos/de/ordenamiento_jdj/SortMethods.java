
package algoritmos.de.ordenamiento_jdj;



public class SortMethods {
    
    void bubbleSort(int array[])
    {
        long startTime = System.currentTimeMillis();
        long startTimeN = System.nanoTime();

        int n = array.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int valorTemp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = valorTemp;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long endTimeN = System.nanoTime();

        System.out.println("Duración nanosegundos: " + (endTimeN - startTimeN));
        System.out.println("Duración milisegundos: " + (endTime - startTime));
        System.out.println("Duración segundos: " + ((endTime - startTime)/1000));
        System.out.println("Duración segundos: " + ((endTimeN - startTimeN)/1000000000));

        printArray(array);
    }
    void insertionSort(int array[])
    {
        long startTime = System.currentTimeMillis();
        long startTimeN = System.nanoTime();

        int length = array.length;
        for (int i = 1; i < length; ++i) {
            int startPoint = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > startPoint) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = startPoint;
        }

        long endTime = System.currentTimeMillis();
        long endTimeN = System.nanoTime();

        System.out.println("Duración nanosegundos: " + (endTimeN - startTimeN));
        System.out.println("Duración milisegundos: " + (endTime - startTime));
        System.out.println("Duración segundos: " + ((endTime - startTime)/1000));
        System.out.println("Duración segundos: " + ((endTimeN - startTimeN)/1000000000));

        printArray(array);
    }
    void selectionSort(int array[])
    {
        int length = array.length;

        for (int i = 0; i < length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
    void printArray(int array[])
    {
        int lenght = array.length;
        for (int i = 0; i < lenght; ++i)
            System.out.print( "\t" + array[i]);
        System.out.println();
    }


}
