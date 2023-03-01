package punto.pkg3.pkg2.t.pkg2;

class SortMethods {
    void bubbleSort(int array[])
    {
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
    }
    
    void printArray(char array[])
    {
        int lenght = array.length;
        for (int i = 0; i < lenght; ++i) {
            System.out.print(" " + array[i]);
            System.out.println();
        }
    }

    char[] string2Char (String word){

        char[] wordChar = new char[word.length()];

        for (int i=0; i < word.length(); i++){
            wordChar[i] = word.charAt(i);
            System.out.println(""+word.charAt(i));
        }
        return wordChar;
    }

    char  moda ( char array[]) {
        
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
