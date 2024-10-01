package aulas;
import libs.*;

public class Aula31 {
    public static void aula(){
        System.out.println("== Aula 28: Matrizes");

        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrizB = {{5, 6}, {7, 8}, {9, 10}};
        
        int[][] aa = Matrizes.multiplicaMatrizes(matrizA, matrizB);

        Matrizes.mostrarMatriz(aa);
        //Vetores.mostrarVetInt(aa);
        //boolean saida = Matrizes.comparaMatrizes(matrizA, matrizB);
        //System.out.println(saida);
    }

}
