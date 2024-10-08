package Trabalho;

public class T3 {
    public static void mostrarMatriz(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(",\t");
                }
            }
            System.out.print("]\n");
        } 
    }
    
    public static void mostrarVetLogico(boolean vet[]){
        System.out.print("[");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
            if (i < vet.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]"); 
    }

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

    public static boolean[] aplicarELogico(boolean[] vetA, boolean[] vetB){
        boolean[] vetSaida = new boolean[vetA.length];

        for(int i=0; i < vetA.length; i++){
            vetSaida[i] = vetA[i] & vetB[i];
        }
        return vetSaida;    
    }

    public static boolean[] aplicarOuLogico(boolean[] vetA, boolean[] vetB){
        boolean[] vetSaida = new boolean[vetA.length];

        for(int i=0; i < vetA.length; i++){
            vetSaida[i] = vetA[i] || vetB[i];
        }
        return vetSaida;    
    }

    public static int[] aplicarMascara(int[] vetor, boolean[] mask){
        int[] vetSaida = new int[vetor.length];
        int cont =0;
        for (int i = 0; i < vetSaida.length; i++){
            if (mask[i]){
                vetSaida[cont] = vetor[i];
                cont++;
            }
        }
        return subVetorInt(vetSaida, 0, cont);
    }

    public static boolean seValorIntExistir(int[] vetor, int valor_buscar){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor_buscar){
                return true;
            }
        }
        return false;
    }

    public static int[] uniao(int[] vetA, int[] vetB){
        int[] vetSaida = new int[vetA.length + vetB.length];
        int cont =0;

        for (int i=0; i < vetA.length; i++){
            if (!seValorIntExistir(vetSaida, vetA[i])){
                vetSaida[cont] = vetA[i];
                cont++;
            } 
            if (!seValorIntExistir(vetSaida, vetB[i])){
                vetSaida[cont] = vetB[i];
                cont++;
            }
        }

        return subVetorInt(vetSaida, 0, cont);
    }

    public static int[] intersecao(int[] vetA, int[] vetB){
        int[] vetSaida = new int[vetA.length + vetB.length];
        int cont =0;

        for (int i = 0; i < vetA.length; i++){
            if (seValorIntExistir(vetB, vetA[i])){
                if (!seValorIntExistir(vetSaida, vetA[i])){
                    vetSaida[cont] = vetA[i];
                    cont++;
                }
            }
        }
        return subVetorInt(vetSaida, 0, cont);
    }

    public static int[] diferencaVetA(int[] vetA, int[] vetB){
        int[] vetSaida = new int[vetA.length + vetB.length];
        int cont =0;

        for (int i = 0; i < vetA.length; i++){
            if (!seValorIntExistir(vetB, vetA[i])){
                if (!seValorIntExistir(vetSaida, vetA[i])){
                    vetSaida[cont] = vetA[i];
                    cont++;
                }
            }
        }
        return subVetorInt(vetSaida, 0, cont);
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

    public static int [][] matrizTranspor(int[][] matrizA){
        int[][] transposta = new int[matrizA[0].length][matrizA.length];

        for (int i=0; i < matrizA.length; i++){
            for (int j =0; j<matrizA[0].length; j++){
                transposta[j][i] = matrizA[i][j];
            }
        }
        return transposta;
    }

    // preencher a diagonal e a coluna 0
    public static int[][] inicializandoTriangulo(int tam){
        int[][] arr = new int[tam][tam];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][0] = 1;
        }
        return arr;
    }

    public static int[][] trianguloPascal(int tamLinhas){
        int[][] vetSaida = inicializandoTriangulo(tamLinhas);
        // usando a 1 propriedade
        for (int i = 0; i < tamLinhas; i++) {
            for (int j = 1; j < i; j++) { 
                // pegar os valores a cima da linha, um em cima do da posicao j e o outro ao lado esquerdo dele e faz a soma
                vetSaida[i][j] =  vetSaida[i-1][j] + vetSaida[i-1][j -1];
            }
        }
        return vetSaida;
    }

    public static int[][] matrizPermutacaoLinhas(int[][] matriz, int linha1, int linha2){
        int[][] vetSaida = matriz;
        int[] temp;
        //for (int i = 0; i< matriz[0].length; i++){
        temp = matriz[linha2-1];
        matriz[linha2-1] = matriz[linha1-1];
        matriz[linha1-1] =temp;

        //}
        return matriz;
    }

}