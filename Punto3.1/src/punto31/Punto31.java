package punto31;

import java.util.Scanner;


public class Punto31 {


    public static void main(String[] args) {
        
        System.out.println("\t\tBienvenido al programa de David Rodríguez y Juan Esteban Rodríguez\n\n");
        int cant;
        int[] numeros;
        Scanner read = new Scanner(System.in); 
        System.out.println("\tIngrese el tamaño de la lista:\n");
        cant = read.nextInt();
        numeros = new int[cant];
 
        SortMethods sortMethods = new SortMethods();

        for (int i = 0; i < cant; i++) {
            numeros [i] = (0 +(int)(Math.random()*(100-0)+ 1)); //(valor minimo + (tipo dato)(Math.random()*((máximo-minimo)+1)
        }

        sortMethods.bubbleSort(numeros);
        sortMethods.printArray(numeros);
        sortMethods.calculateProm(numeros);
        sortMethods.calculateMedium(numeros);
        sortMethods.calculateVarianza(numeros);
        sortMethods.calculateDeviation(numeros);
        sortMethods.moda(numeros);
    }
    
}
