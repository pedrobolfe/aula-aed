package aulas;

import libs.*;

public class Aula29 {
    public static void aula(){
        System.out.println("-- Aula do dia 17/09/2024 --");
        int[] in_vet = {1, 2, 3, 4, 5, 6, 7};
        int[] vetor = Vetores.subVetorInt(in_vet, 10, -15);

        Vetores.mostrarVetInt(vetor);
        
    }

    public static void modificaVetor(int[] vetor) {
       vetor[1] = 6;
    }


}
