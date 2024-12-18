package libs;

import java.util.Arrays;
import java.util.Random;

public class Vetores {

    public static int[] lerInteiros(int n){
        int[] saida = new int[n];
        Entrada.abrir();

        for (int i = 0; i < n; i++){
            saida[i] = Entrada.lerInt();
        }
        Entrada.fechar();
        return saida;
    }

    public static int obterPosicaoInteiro(int[] vetor, int valor_buscar, int pos_inicial){
        for (int i = pos_inicial; i < vetor.length; i++){
            if (vetor[i] == valor_buscar){
                return i;
            }
        }
        return -1;
    }

    public static int obterPosicaoReal(double[] vetor, double valor_buscar, int pos_inicial){
        for (int i = pos_inicial; i < vetor.length; i++){
            if (vetor[i] == valor_buscar){
                return i;
            }
        }
        return -1;
    }

    public static int obterPosicaoLogico(boolean[] vetor, boolean valor_buscar, int pos_inicial){
        for (int i = pos_inicial; i < vetor.length; i++){
            if (vetor[i] == valor_buscar){
                return i;
            }
        }
        return -1;
    }

    public static int obterPosicaoCaractere(char[] vetor, char valor_buscar, int pos_inicial){
        for (int i = pos_inicial; i < vetor.length; i++){
            if (vetor[i] == valor_buscar){
                return i;
            }
        }
        return -1;
    }

    public static int obterPosicaoCadeiaDeCaracteres(String[] vetor, String valor_buscar, int pos_inicial){
        for (int i = pos_inicial; i < vetor.length; i++){
            if (vetor[i].equals(valor_buscar)){
                return i;
            }
        }
        return -1;
    }

    public static int[] obterIndicesInteiros(int[] vetor, int valor_buscar){
        int[] indices;
        int tam = 0;
        int p = 0;

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor_buscar){
                tam++;
            }
        }

        indices = new int[tam];

        for (int j = 0; j < vetor.length; j++){
            if (vetor[j] == valor_buscar) {
                indices[p] = j;
                p++;
            }
        }
        return indices; 
    }

    public static int[] obterIndicesReais(double[] vetor, int valor_buscar){
        int[] indices;
        int tam = 0;
        int p = 0;

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor_buscar){
                tam++;
            }
        }

        indices = new int[tam];
        
        for (int j = 0; j < vetor.length; j++){
            if (vetor[j] == valor_buscar) {
                indices[p] = j;
                p++;
            }
        }
        return indices; 
    }

    public static int[] obterIndicesBoolean(boolean[] vetor, boolean valor_buscar){
        int[] indices;
        int tam = 0;
        int p = 0;

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor_buscar){
                tam++;
            }
        }

        indices = new int[tam];
        
        for (int j = 0; j < vetor.length; j++){
            if (vetor[j] == valor_buscar) {
                indices[p] = j;
                p++;
            }
        }
        return indices; 
    }

    public static int[] obterIndicesCaracter(char[] vetor, char valor_buscar){
        int[] indices;
        int tam = 0;
        int p = 0;

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor_buscar){
                tam++;
            }
        }

        indices = new int[tam];
        
        for (int j = 0; j < vetor.length; j++){
            if (vetor[j] == valor_buscar) {
                indices[p] = j;
                p++;
            }
        }
        return indices; 
    }

    public static int[] obterIndicesCadeiaCaracter(String[] vetor, String valor_buscar){
        int[] indices;
        int tam = 0;
        int p = 0;

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i].equals(valor_buscar)){
                tam++;
            }
        }

        indices = new int[tam];
        
        for (int j = 0; j < vetor.length; j++){
            if (vetor[j].equals(valor_buscar)) {
                indices[p] = j;
                p++;
            }
        }
        return indices; 
    }

    public static int[] alocarInteiros(int qnt) {
        return new int[qnt];
    }

    public static float[] alocarReais(int qnt) {
        return new float[qnt];
    }

    public static boolean[] alocarLogicos(int qnt) {  
        return new boolean[qnt];
    }

    public static String[] alocarCaracteres(int qnt){
        String[] vet = new String[qnt];
        for (int i = 0; i < qnt; i++){
            vet[i]= "0";
        }
        return vet;
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

    public static void mostrarVetFloat(float vet[]){
        System.out.print("[");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
            if (i < vet.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]"); 
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

    public static void mostrarVetCaracter(String vet[]){
        System.out.print("[");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
            if (i < vet.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]"); 
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

    public static char[] subVetorChar(char[] vet, int posIni, int posFim){ // igual o substring, mas com inteiros
        if (posIni >=  vet.length) posIni = vet.length;
        if (posIni < 0) posIni = 0;
        if (posFim > vet.length) posFim = vet.length;
        if (posFim < 0) posFim = 0;

        int tamanho = posFim - posIni;
        if (tamanho < 0) return new char[0];

        char[] vetSaida = new char[tamanho];
        int aux =0;

        for (int i = posIni; i < posFim; i++) {
            vetSaida[aux] = vet[i];
            aux++;
        }
        return vetSaida;
    }

    public static String[] subVetorString(String[] vet, int posIni, int posFim){ // igual o substring, mas com inteiros
        if (posIni >=  vet.length) posIni = vet.length;
        if (posIni < 0) posIni = 0;
        if (posFim > vet.length) posFim = vet.length;
        if (posFim < 0) posFim = 0;

        int tamanho = posFim - posIni;
        if (tamanho < 0) return new String[0];

        String[] vetSaida = new String[tamanho];
        int aux =0;

        for (int i = posIni; i < posFim; i++) {
            vetSaida[aux] = vet[i];
            aux++;
        }
        return vetSaida;
    }

    public static int[] removeRepetidos(int[] vetor){
        int[] outVetor = new int[vetor.length];
        int p = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            boolean repetido = false;
            
            for (int j = 0; j < p; j++) {
                if (vetor[i] == outVetor[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                
                outVetor[p] = vetor[i];
                p++;
            }
        }
        return subVetorInt(outVetor, 0, p);
    }

    public static boolean[] negarVetor(boolean[] vetor){
        boolean[] outVetor = new boolean[vetor.length];

        for (int i = 0; i < vetor.length; i++){
            outVetor[i] = !vetor[i];
        }
        return outVetor;
    }

    public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            // Gera um número aleatório entre min (inclusivo) e max (inclusivo),
            //   e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }
        
        return vetor;
    }

    public static int[] gerarValoresAleatoriosOrdenado(int n, int valor_min, int valor_max) {

        //Obtém um vetor de valores aleatórios
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);

        // Ordena o vetor antes de retornar
        Arrays.sort(vetor);

        return vetor;
    }

    public static long medirTempoIniciar(){
        long tempo_inicio = System.currentTimeMillis();
    
        return tempo_inicio;
    }
    
    //Chamar para parar de contar o tempo
    public static double medirTempoFinalizarSegundos(long tempo_inicio){
        long tempo_fim = System.currentTimeMillis();
    
        double duracao_segundos = (tempo_fim - tempo_inicio) / 1000.0;
    
        return duracao_segundos;
    }

    public static int buscaSequencial(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinaria(int[] arr, int val){
        int ini = 0;
        int fim = arr.length;
        int meio;

        while (ini <= fim) {
            meio = (ini + fim) /2;
            if (val == arr[meio]) {
                return meio;
            } else {
                if (val < arr[meio]) {
                    fim = meio -1;
                } else {
                    ini = meio +1;
                }
            }
        }
        return -1;
    }

    public static int[] troca(int[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;

        return v;
    }

    public static void ordenarInsertionSort(int[] v){
        int i, j;

        for(i = 1; i<v.length; i++){
            
            j = i ;
            while (j>0 && v[j-1] > v[j]){ {
                v = troca(v,j,j-1);
                j--;
            }

        }
    
    }
    }

    public static void ordenarSelectorSort(int[] v){

        int i, j, menor_val, menor_pos;

        for (i = 0; i < v.length-1; i++){
            menor_val = v[i];
            menor_pos = i;

            for (j = i+1; j < v.length; j++){
                if (v[j] < menor_val){
                    menor_val = v[j];
                    menor_pos = j;
                }
            }

            troca(v, i, menor_pos);
        }


    }

    public static void ordenarBubbleSort(int[] v){
        int i, j, troca;
        int[] vet= new int[v.length];
        for (i = 0; i < v.length-1; i++){
            troca = 0;

            for (j = 0; j < v.length-1-i; j++){
                if (v[j] > v[j+1]){
                    vet =troca(v, j, j+1);
                    troca = 1;
                }
            }

            if (troca == 0) {
                break;
            }
        }
    }

    public static int[] merge(int[] va, int[] vb) {
        int i = 0, j = 0, k = 0;
        int[] vc = new int[va.length + vb.length];
    
        while (i < va.length && j < vb.length) {
            if (va[i] < vb[j]) {
                vc[k++] = va[i++];
            } else {
                vc[k++] = vb[j++];
            }
        }
    
        // Copiar os elementos restantes de va (se houver)
        while (i < va.length) {
            vc[k++] = va[i++];
        }
    
        // Copiar os elementos restantes de vb (se houver)
        while (j < vb.length) {
            vc[k++] = vb[j++];
        }
    
        return vc;
    }
    
    public static int[] subVetores(int[] v, int ini, int fim) {
        int[] subVet = new int[fim - ini];
        System.arraycopy(v, ini, subVet, 0, fim - ini);
        return subVet;
    }
    
    public static int[] mergeSort(int[] v) {
        // Vetores com 0 ou 1 elemento já estão ordenados
        if (v.length <= 1) {
            return v;
        }
    
        int meio = v.length / 2;
    
        // Dividindo o vetor em duas partes
        int[] esquerda = subVetores(v, 0, meio);
        int[] direita = subVetores(v, meio, v.length);
    
        // Ordenando as duas partes
        int[] esquerdaOrdenada = mergeSort(esquerda);
        int[] direitaOrdenada = mergeSort(direita);
    
        // Mesclando as duas partes ordenadas
        return merge(esquerdaOrdenada, direitaOrdenada);
    }


    public static int particionar(int[] v, int inicio, int fim) {
        int pivot = v[fim - 1];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (v[j] < pivot) {
                i++;
                troca(v, i, j);
            }
        }

        troca(v, i + 1, fim - 1);

        return i + 1;
    }

    public static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int pos_pivot = particionar(v, inicio, fim);
            quickSort(v, inicio, pos_pivot);
            quickSort(v, pos_pivot + 1, fim);
        }
    }

    public static int obterDigito(int x, int k){
        return (x%(int) Math.pow(10, k))/(int) Math.pow(10, k-1)%10;
    }

    public static int[] countingSort(int[] v) {

        int[] contador = new int[v.length];
        int[] contador_acumulado = new int[v.length];
        int[] resultado = new int[v.length];



        for (int i = 0; i < v.length; i++) {
            contador[v[i]]++;
        }

        for (int i = 1; i < contador.length; i++) {
            contador_acumulado[i] = contador[i-1] + contador_acumulado[i-1];
        }

        for (int i = 0; i < v.length; i++) {
            resultado[contador_acumulado[v[i]]++] = v[i];
        }

        return resultado;
    }

    public static int[] countinGSort(int[] v, int k) {
        int[] cont = new int[10];
        int[] contador_acumulado = new int[10];
        int[] resultado = new int[v.length];
        int  p = 0; 

        for (int i = 0; i < resultado.length; i++) {
            p = obterDigito(v[i], k);
            cont[p]++;
        }

        for (int i = 1; i < cont.length; i++) {
            contador_acumulado[i] = cont[i-1] + contador_acumulado[i-1];
        }

        for (int i = 0; i < v.length; i++) {
            p = obterDigito(v[i], k);
            resultado[contador_acumulado[p]++] = v[i];
        }

        return resultado;
    }
    
    public  static int maiorValorVetor(int [] a){
        int maior_valor = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maior_valor) {
                maior_valor = a[i];
            }
        }

        return maior_valor;
    }

    public static int [] radixSort(int [] v){
        int maior_valor = Vetores.maiorValorVetor(v);
        int k = 1;

        while(maior_valor > Math.pow(10, k)){
          k++;
        }

        for(int i = 1; i<=k; i++){
            v = countinGSort(v, i);
        }
        return v;
    }
}
