package libs;

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
}
