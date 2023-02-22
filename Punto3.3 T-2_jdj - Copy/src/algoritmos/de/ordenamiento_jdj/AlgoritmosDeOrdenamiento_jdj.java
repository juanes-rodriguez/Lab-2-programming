
package algoritmos.de.ordenamiento_jdj;

import java.util.Scanner; 

public class AlgoritmosDeOrdenamiento_jdj {

    
    public static void main(String[] args) {
        
        System.out.println("\t\tBienvenido al programa de David Rodríguez y Juan Esteban Rodríguez\n\n");
        int cant;
        int var = 0;
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[var];
        SortMethods sortMethods = new SortMethods();

        for (int i = 0; i < 50; i++) {
            numeros [i] = (0 +(int)(Math.random()*(100-0)+ 1)); //(valor minimo + (tipo dato)(Math.random()*((máximo-minimo)+1)
        }
        var = numeros.length;
        numeros = new int[numeros.length];

        int[] numerosB = numeros.clone();
        int[] numerosS = numeros.clone();


        sortMethods.bubbleSort(numerosB);
        sortMethods.insertionSort(numerosS);

        
    }
}
