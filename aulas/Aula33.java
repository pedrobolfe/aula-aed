package aulas;

public class Aula33 {
    public static void aula() {
        System.out.println("== Aula 32 - Trabalho ==");

        int[][] vet = {
            {1, 1, 4},
            {2, 2, 2}
        };
        

        int[][] saida= Trabalho.AED2024_3B_T01.matrizTranspor(vet);
        Trabalho.AED2024_3B_T01.mostrarMatriz(saida);
        System.out.println();
    }
}
