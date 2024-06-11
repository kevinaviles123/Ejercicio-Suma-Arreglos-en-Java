package com.mycompany.sumadearreglos;

public class SumaElementosArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int sumaTotal = 0;

        for (int i = 0; i < arreglo.length; i++) {
            sumaTotal += arreglo[i];
        }

        System.out.println("La suma total de los elementos del arreglo es: " + sumaTotal);
    }
}
