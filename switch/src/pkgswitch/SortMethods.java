
package pkgswitch;
public class SortMethods {
    void bubbleSort(int array[])
    {
        long startTimeN = System.nanoTime(); 

        int lenght = array.length;
        for (int i = 0; i < lenght - 1; i++){
            for (int j = 0; j < lenght - i - 1; j++){
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int valorTemp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = valorTemp;
                }
            }
        }
        long endTimeN = System.nanoTime();

        System.out.println(" " + (endTimeN - startTimeN));
    }
    void insertionSort(int array[])
    {
       
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
        
        long endTimeN = System.nanoTime();

        System.out.println(" " + (endTimeN - startTimeN));

    }
    void selectionSort(int array[])
    {
        long startTimeN = System.nanoTime();
        int length = array.length;

        for (int i = 0; i < length-1; i++)
        {
            int valorPeque = i;
            for (int j = i+1; j < length; j++)
                if (array[j] < array[valorPeque])
                    valorPeque = j;

            int temp = array[valorPeque];
            array[valorPeque] = array[i];
            array[i] = temp;
        }
        long endTimeN = System.nanoTime();
        System.out.println(" " + (endTimeN - startTimeN));
    }
    
    
 void merge(int array[], int izq, int mitad, int der)
    {
     
        
        int primeraMitad = mitad - izq + 1;
        int segundaMitad = der - mitad;
  
     
        int izquierda[] = new int[primeraMitad];
        int derecha[] = new int[segundaMitad];
        
        for (int i = 0; i < primeraMitad; ++i)
            izquierda[i] = array[izq + i];
        for (int j = 0; j < segundaMitad; ++j)
            derecha[j] = array[mitad + 1 + j];
  
       
        int i = 0, j = 0;
        
        int inicial = izq;
        while (i < primeraMitad && j < segundaMitad) {
            if (izquierda[i] <= derecha[j]) {
                array[inicial] = izquierda[i];
                i++;
            }
            else {
                array[inicial] = derecha[j];
                j++;
            }
            inicial++;
        }
        
        while (i < primeraMitad) {
            array[inicial] = izquierda[i];
            i++;
            inicial++;
        }
        
        while (j < segundaMitad) {
            array[inicial] = derecha[j];
            j++;
            inicial++;
        }

       
    }
 
    void sort(int array[], int izq, int der)
    {
        
        if (izq < der) {
           
            int m = izq + (der- izq) / 2;
            sort(array, izq, m);
            sort(array, m + 1, der);
            merge(array, izq, m, der);
        }
 
    }
  
    int[] fillArray(int numeros[], int cantNumeros)
    {
  
        for (int i = 0; i < cantNumeros; i++) {
            numeros[i]=((int)(Math.random()*(100)+1));
        }
        numeros = new int[numeros.length];
        return numeros;
    }
    
   int seleccionarCantNumeros(int columna){
    int cantNumeros = 0;
    
    //System.out.println("\n\t1\t100\n\t2\t500\n\t3\t1000\n\t4\t5000\n\t5\t10000");
       
    if (columna == 1) {
           cantNumeros = 100; 
       }else if (columna == 2) {
           cantNumeros = 500; 
       }else if (columna == 3) {
           cantNumeros = 1000;
       }else if (columna == 4) {
           cantNumeros = 5000;
       }else if (columna == 5 ) {
           cantNumeros = 10000; 
       }
   
    return cantNumeros; 
   }
    
}
