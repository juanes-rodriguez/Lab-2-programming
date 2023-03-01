package punto31;

class SortMethods {
    void bubbleSort(int array[])
    {
        int lenght = array.length;
        for (int i = 0; i < lenght - 1; i++){
            for (int j = 0; j < lenght - i - 1; j++){
                if (array[j] > array[j + 1]) {
                    int valorTemp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = valorTemp;
                }
            }
        }
    }
    void printArray(int array[])
    {
        int lenght = array.length;
        for (int i = 0; i < lenght; ++i)
            System.out.print( "\n\tEL número " + (i+1) +" es: \t" + array[i]);
        System.out.println();
    }

    void calculateProm(int array[]){
        float suma = 0;
        int lenght = array.length;
        for (int i = 0; i < lenght; i++) {
            suma += array[i];
        }
        System.out.println("\n\tLa media de los datos es: \t" + (suma/lenght));
    }
    void calculateMedium(int array[]) {

        int lenght = array.length;
        int mitad = array.length / 2;
        float mediana = 0;

        if (lenght % 2 == 0) {

            mediana = (array[mitad] + array[mitad-1])/2;
            System.out.println("\n\tla mediana de los datos es: "+ mediana);
        }
        else {

            mediana = (array[mitad - (int) 0.5]);
            System.out.println("\n\tla mediana de los datos es: "+ mediana);

        }


    }
    void calculateVarianza(int array[]){
        float suma = 0;
        float promedio;
        double sumatoria = 0;
        double resta=0;
        double acumulativo = 0;
        int lenght = array.length;
        for (int i = 0; i < lenght; i++) {
            suma += array[i];
        }
        promedio = suma/lenght;


        for (int i = 0; i < lenght; i++) {

            resta = array[i] - promedio;
            sumatoria = Math.pow(resta,2);
            acumulativo += sumatoria;
        }
        System.out.println("\n\tLa varianza es: " +acumulativo/lenght);
    }

    void calculateDeviation(int array[]){
        float suma = 0;
        float promedio;
        double sumatoria = 0;
        double resta=0;
        double acumulativo = 0;
        int lenght = array.length;
        for (int i = 0; i < lenght; i++) {
            suma += array[i];
        }
        promedio = suma/lenght;


        for (int i = 0; i < lenght; i++) {

            resta = array[i] - promedio;
            sumatoria = Math.pow(resta,2);
            acumulativo += sumatoria;
        }
        System.out.println("\n\tLa desviación estándar es: " + Math.sqrt(acumulativo/lenght));
    }

    void  moda ( int array[]) {
        int lenght = array.length;
        int frecuencia = 0;
        int frecModa = 0;
        int modaResult = -1;

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
    }
    
}
