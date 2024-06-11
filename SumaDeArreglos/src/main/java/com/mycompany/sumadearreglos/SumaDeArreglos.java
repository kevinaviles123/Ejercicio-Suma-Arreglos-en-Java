package com.mycompany.sumadearreglos;

public class SumaDeArreglos {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {5, 4, 3, 2, 1};
        int[] suma = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            suma[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.println("La suma de los arreglos es:");
        for (int i = 0; i < suma.length; i++) {
            System.out.print(suma[i] + " ");
        }
    }
}
