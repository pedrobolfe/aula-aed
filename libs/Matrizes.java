package libs;

public class Matrizes {
    public static void mostrarMatriz(int[][] arr){
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

        mostrarMatriz(arr);
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
        
        mostrarMatriz(arr);
    }

    public static void ex4(){
        int[][] arr = new int[10][10];
        int tam = arr[0].length;

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                arr[i][j] = Math.min(Math.min(i, j), Math.min(tam - 1 - i, tam - 1 - j))+1;
            }
        }
        
        mostrarMatriz(arr);
    }

    public static int[][] somaMatrizes(int[][] matrizA, int[][] matrizB){
        int[][] matrizSaida =new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizSaida[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizSaida;
    }

    public static int[][] multiplicaMatrizes(int[][] matrizA, int[][] matrizB){
        if (matrizA.length != matrizB[0].length || matrizA[0].length != matrizB.length) return null;

        int[][] result =new int[matrizA.length][matrizB[0].length];
        int soma = 0;
        
        for (int p = 0; p < matrizA.length; p++){
            for (int i = 0; i < matrizB[0].length; i++){
                soma =0;
                for (int j = 0; j < matrizA[0].length; j++){
                    soma += matrizA[p][j] * matrizB[j][i];
                }
                result[p][i] = soma;
                
            }
        }
        


        return result;
    }

    public static boolean comparaMatrizes(int[][] matrizA, int[][] matrizB){
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) return false;
        
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                if(matrizA[i][j] != matrizB[i][j]) return false;
            }
        }
        return true;
    }

    public static int[][] matrizPreencherInt(int[][] matriz, int val){
        int[][] saida = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < saida.length; i++){
            for (int j = 0; j < saida[i].length; j++){
                saida[i][j] = val;
            }
        }
        return saida;
    }

    public static int[] getLinhaInt(int[][] matriz, int linha){
        return matriz[linha];
    }

}
