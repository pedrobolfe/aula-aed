package aulas;

import libs.*;

public class Aula30 {
    public static void aula(){
        System.out.println("-- Aula do dia 14/09/2024 --");
        int[] in_vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] vetor = Saida.filtrarMaiores(in_vet, 3);

        //System.out.println("====" + vetor);
        //Saida.filtrarMaiores(in_vet, "-", 4);
        Vetores.mostrarVetInt(vetor);
    }

    public static void modificaVetor(int[] vetor) {
       vetor[1] = 6;
    }


}
