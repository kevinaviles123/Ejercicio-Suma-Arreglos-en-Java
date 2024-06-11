package com.mycompany.sumadearreglos;

public class SumaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sumaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("La suma total de los elementos de la matriz es: " + sumaTotal);
    }
}
