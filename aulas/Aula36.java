package aulas;

import libs.Vetores;

public class Aula36 {
    public static void aula() {
        System.out.println("== Aula 36 - Ordenacao ==");

        int[] vet = {27, 19, 21, 12, 92, 71, 05};
        int[] result = Vetores.coutingSort(vet, 1);

        Vetores.mostrarVetInt(result);
    }
}
