/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSortListas;

/**
 *
 * @author DELL
 */
public class Lista {

    Nodo inicio = null;
    Nodo fin = null;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.ant = null;
        nuevo.sig = null;
        nuevo.dato = dato;
        if ((inicio == null) && (fin == null)) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            inicio = nuevo;
        }
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.ant = null;
        nuevo.sig = null;
        nuevo.dato = dato;
        if ((inicio == null) && (fin == null)) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.ant = fin;
            fin.sig = nuevo;
            fin = nuevo;
        }
    }

    boolean isEmpty() {
        return inicio == null && fin == null;
    }

    public void imprimir() {
        Nodo reco = inicio;
        int con=0;
        while (reco != null) {
            System.out.print(reco.dato + " ");
            reco = reco.sig;
            con++;
            if(con == 100){
                System.out.println();
                con=0;
            }
        }
        System.out.println();
    }

    public void quickSort() {
        quickSort2(inicio, fin);
    }

    void quickSort2(Nodo ini, Nodo fi) {
        if ((ini != fi) && (ini != null) && (fi != null)) {
            Nodo pivote = ini;
            Nodo izq = ini.sig;
            Nodo der = fi;
            while ((izq != der)) { //&& (izq.sig != der)  
                while ((der.dato >= pivote.dato) && (izq != der)) {
                    der = der.ant;
                }
                while ((izq.dato < pivote.dato) && (izq != der)) {
                    izq = izq.sig;
                }
                if ((izq != der)) {
                    int aux = izq.dato;
                    izq.dato = der.dato;
                    der.dato = aux;
                }
                //izq = izq.sig;
                //der = der.ant;
            }
            if (izq.dato < pivote.dato) {
                int aux = izq.dato;
                izq.dato = pivote.dato;
                pivote.dato = aux;
            }
            if (izq.ant != null) {
                quickSort2(ini, izq.ant);
            }
            if (izq.sig != null) {
                quickSort2(izq, fi);
            }

        }
    }

}
