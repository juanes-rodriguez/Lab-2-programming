
package pkgswitch;

import java.util.Scanner;

                                                
public class Switch {

    
    public static void main(String[] args) {
        System.out.println("\t\tBienvenido al programa de David Rodríguez y Juan Esteban Rodríguez\n\n");
        int cant=0, cantNumeros, columna;
        int var;
        Scanner read = new Scanner(System.in);
        SortMethods sortMethods = new SortMethods();
      
        //(valor minimo + (tipo dato)(Math.random()*((máximo-minimo)+1)
        
        //System.out.println("\t\tBurbuja\t\tInserción\t\tSelección\t\tMerge Sort");
        //System.out.println("\n100\n\n500\n\n1000\n\n5000\n\n10000");
        
        
        for (int i = 0; i < 4; i++) {
            //System.out.println("\n\t1.\tBurbuja\n\t2.\tInserción\n\t3.\tSelección\n\t4.\tMerge Sort\n\t");
            cant ++;
            //System.out.println("\t" + cant );
            switch (cant) { 
                case 1:
                   System.out.println("\t\tBurbuja");
                    System.out.println("Duración en nanosegundos\n");
                   for (int j = 1; j < 6; j++) {
                       columna = j;
                       cantNumeros = sortMethods.seleccionarCantNumeros(j);
                       var = cantNumeros;
                       int[] numeros = new int[var];
                       sortMethods.fillArray(numeros, cantNumeros);
                       System.out.println("\tPara "+cantNumeros+ ":");
                       sortMethods.bubbleSort(numeros);
                   }
                   break;
                case 2:
                  System.out.println("\n\t\tInserción");
                    System.out.println("Duración en nanosegundos\n");
                   for (int j = 1; j < 6; j++) {
                       columna = j;
                       cantNumeros = sortMethods.seleccionarCantNumeros(j);
                       var = cantNumeros;
                       int[] numeros = new int[var];
                       sortMethods.fillArray(numeros, cantNumeros);
                       System.out.println("\tPara "+cantNumeros+ ":");
                       sortMethods.insertionSort(numeros);
                   }
                    break;
                case 3: 
                   System.out.println("\n\t\tSelección");
                    System.out.println("Duración en nanosegundos\n");
                   for (int j = 1; j < 6; j++) {
                       columna = j;
                       cantNumeros = sortMethods.seleccionarCantNumeros(j);
                       var = cantNumeros;
                       int[] numeros = new int[var];
                       sortMethods.fillArray(numeros, cantNumeros);
                       System.out.println("\tPara "+cantNumeros+ ": ");
                       sortMethods.insertionSort(numeros);
                   }
                    break;
                case 4:
                    System.out.println("\n\t\tMerge Sort");
                    System.out.println("Duración en nanosegundos\n");
                   for (int j = 1; j < 6; j++) {
                       columna = j;
                       cantNumeros = sortMethods.seleccionarCantNumeros(j);
                       var = cantNumeros;
                       int[] numeros = new int[var];
                       sortMethods.fillArray(numeros, cantNumeros);
                       long startTimeN = System.nanoTime();
                       sortMethods.sort(numeros, i, var-1);
                       long endTimeN = System.nanoTime();
                       System.out.println("\tPara "+cantNumeros+ ":");
                       System.out.println(" " + (endTimeN - startTimeN));
                       
                       
                   }
                    break;
                default:
            }
        } 
    }
}
    

