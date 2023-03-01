
package punto.pkg3.pkg2.t.pkg2;

import java.util.Scanner;


public class Punto32T2 {

    
    public static void main(String[] args) {
        System.out.println("\t\tBienvenido al programa de David Rodríguez y Juan Esteban Rodríguez\n\n");
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la palabra que desee: ");
        String palabra = read.next();


        SortMethods sortMethods = new SortMethods();
        char[] wordChar = sortMethods.string2Char(palabra);
        char moda = sortMethods.moda(wordChar);
        sortMethods.replaceVocals(moda, wordChar);
    }
    
}
