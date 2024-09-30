package aulas;
import libs.*;

public class Aula31 {
    public static void aula(){
        System.out.println("== Aula 28: Matrizes");

        ex3();
    }

    public static void mostarMatriz(int[][] arr){
        //int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]\n");
            // if (i < arr.length -1){
            //     System.out.print(",\n");
            // }
        } 
    }

    public static void ex2(){
        int[][] arr = new int[5][15];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length -1) {
                    arr[i][j] = 1;
                }
            }
        } 

        mostarMatriz(arr);
    }

    public static void ex3(){
        int[][] arr = new int[9][9];
        int exp;
        for (int i = 0; i < arr.length; i++) {
            //for (int j = 0; j < arr[i].length; j++) {
                    exp = arr[i].length-1 -i;
                    arr[i][i] = 1;
                    arr[i][exp] =1;
            //}
        }
        
        mostarMatriz(arr);
    }

    public static void ex4(){
        int[][] arr = new int[10][10];
        int cont;
        for (int i = 0; i < arr.length; i++) {
            cont = arr.length/2;
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length -1) {
                    arr[i][j] = 1;
                }
            }
        }
        
        mostarMatriz(arr);
    }
}
