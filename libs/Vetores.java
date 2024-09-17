package libs;

public class Vetores {
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

    public static int[] subVetorInt(int[] vet, int posIni, int posFim){
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
}
