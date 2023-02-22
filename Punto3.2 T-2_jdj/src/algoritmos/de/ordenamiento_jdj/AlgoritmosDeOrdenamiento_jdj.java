
package algoritmos.de.ordenamiento_jdj;

import java.util.Scanner; 

public class AlgoritmosDeOrdenamiento_jdj {

    
    public static void main(String[] args) {
        
        System.out.println("\t\tBienvenido al programa de David Rodríguez y Juan Esteban Rodríguez\n\n");
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la palabra que desee: ");
        String palabra = read.next();


        SortMethods sortMethods = new SortMethods();
        char[] wordChar = sortMethods.stringTwoChar(palabra);
        char moda = sortMethods.moda(wordChar);
        sortMethods.replaceVocals(moda, wordChar);

        
    }
    
}
