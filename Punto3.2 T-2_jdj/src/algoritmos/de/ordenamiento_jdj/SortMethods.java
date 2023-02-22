
package algoritmos.de.ordenamiento_jdj;



public class SortMethods {
    
    void bubbleSort(int array[])
    {
        //long startTime = System.currentTimeMillis();
        //long startTimeN = System.nanoTime();

        
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
        
        //long endTime = System.currentTimeMillis();
        //long endTimeN = System.nanoTime();

        //System.out.println("Duración nanosegundos: " + (endTimeN - startTimeN));
        //System.out.println("Duración milisegundos: " + (endTime - startTime));
        //System.out.println("Duración segundos: " + ((endTime - startTime)/1000));

    }
  
    /* Prints the array */
    void printArray(char array[])
    {
        int lenght = array.length;
        for (int i = 0; i < lenght; ++i) {
            System.out.print("\n\tLa letra " + (i + 1) + " es: \t" + array[i]);
            System.out.println();
        }
    }

    char[] stringTwoChar (String word){

        char[] wordChar = new char[word.length()];

        for (int i=0; i < word.length(); i++){
            wordChar[i] = word.charAt(i);
            System.out.println(""+word.charAt(i));
        }
        return wordChar;
    }

    char  moda ( char array[]) {
        //int [] array = { 2, 3, 8, 11};
        int lenght = array.length;
        int frecuencia = 0;
        int frecModa = 0;
        char modaResult = (char) 0;

        for ( int i = 0; i < lenght; i++ ) {
            frecuencia = 1;
            for ( int j = i + 1; j < lenght; j++ ) {
                if ( array[i] == array[j] )
                    frecuencia++;
            }
            if ( frecuencia > frecModa ) {
                frecModa = frecuencia;
                modaResult = array[i];
            }
        }

        if (frecModa != 1){
            System.out.println("\n\tLa moda es: "+modaResult);
        }
        else {
            System.out.println("\n\tNo hay moda");
        }
        return modaResult;
    }

    void replaceVocals (char moda, char[] word){

        int lenght = word.length;
        for (int i = 0; i < lenght; ++i) {
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' ||word[i] == 'u' ){
                word[i] = moda;
            }
        }
        printArray(word);
    }

}
