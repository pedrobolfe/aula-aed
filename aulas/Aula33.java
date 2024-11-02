package aulas;
import libs.Vetores;

public class Aula33 {
    public static void aula() {
        System.out.println("== Aula 33 - Trabalho ==");
        
        int[][] vet = {
            {1, 1, 4},
            {2, 2, 2},
            {3, 4, 5}
        };
        

        int[][] saida= Trabalho.T3.matrizPermutacaoLinhas(vet, 1, 2);
        Trabalho.T3.mostrarMatriz(saida);
        System.out.println();
    }

    
}
