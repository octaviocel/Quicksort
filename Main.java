/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSortListas;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        Lista listita= new Lista();

        
        for (int i = 0; i < 1000000; i++) {//un millon de elementos
            listita.insertar(ran.nextInt(2035));
        }
        
        System.out.println("Lista normal");
        listita.imprimir();
        System.out.println();
        
        System.out.println("Lista con QuickSort");
        listita.quickSort();
        listita.imprimir();
         
    }
}
