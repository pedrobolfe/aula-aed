package aulas;

import libs.*;

public class Aula30 {
    public static void aula(){
        System.out.println("-- Aula do dia 14/09/2024 --");
        String[] in_vet = {"abacaxi", "maca", "abacaxi", "pera"};

        int[] vetor = Vetores.obterIndicesCadeiaCaracter(in_vet, "pera");

        //System.out.println("pos dos 5 " + vetor);
        Vetores.mostrarVetInt(vetor);
        
    }

    public static void modificaVetor(int[] vetor) {
       vetor[1] = 6;
    }


}
