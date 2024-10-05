package Trabalho;

public class AED2024_3B_T01 {
    public static void mostrarVetInt(int vet[]){
        System.out.print("[");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
            if (i < vet.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]"); 
    }

    public static void mostrarInteiros(int[] vetor, String separador){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(separador);
            }
        }
        System.out.println();
    }

    public static int[] subVetorInt(int[] vet, int posIni, int posFim){ // igual o substring, mas com inteiros
        if (posIni >=  vet.length) posIni = vet.length;
        if (posIni < 0) posIni = 0;
        if (posFim > vet.length) posFim = vet.length;
        if (posFim < 0) posFim = 0;

        int tamanho = posFim - posIni;
        if (tamanho < 0) return new int[0];

        int[] vetSaida = new int[tamanho];
        int aux =0;

        for (int i = posIni; i < posFim; i++) {
            vetSaida[aux] = vet[i];
            aux++;
        }
        return vetSaida;
    }

    public static int[] filtrarMaiores(int[] vetor, int num_min){
        int[] outVetor = new int[vetor.length];
        int p = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > num_min) {
                outVetor[p] = vetor[i];
                p++;
            }
        }
        return subVetorInt(outVetor, 0, p);// subvetorInt vai ir ate o numero de ca
    }

    public static int[] filtrarMenores(int[] vetor, int num_max){
        int[] outVetor = new int[vetor.length];
        int p = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < num_max) {
                outVetor[p] = vetor[i];
                p++;
            }
        }
        return subVetorInt(outVetor, 0, p);// subvetorInt vai ir ate o numero de ca
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
}
