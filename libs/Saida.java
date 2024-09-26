package libs;

public class Saida {
    public static void mostrarInteiros(int[] vetor, String separador){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(separador);
            }
        }
    }

    public static void mostrarVetIntQuebrados(int[] vetor, String separador, int sequencia){
        for (int i = 0; i < vetor.length; i+=sequencia) {
            mostrarInteiros(Vetores.subVetorInt(vetor, i, i+sequencia), separador);
            System.out.println();
        }
    }

    public static void mostrarChar(char[] vetor, String separador){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(separador);
            }
        }
    }

    public static void mostrarVetCharQuebrados(char[] vetor, String separador, int sequencia){
        for (int i = 0; i < vetor.length; i+=sequencia) {
            mostrarChar(Vetores.subVetorChar(vetor, i, i+sequencia), separador);
            System.out.println();
        }
    }

    public static void mostrarString(String[] vetor, String separador){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(separador);
            }
        }
    }

    public static void mostrarVetStringQuebrados(String[] vetor, String separador, int sequencia){
        for (int i = 0; i < vetor.length; i+=sequencia) {
            mostrarString(Vetores.subVetorString(vetor, i, i+sequencia), separador);
            System.out.println();
        }
    }

    public static int[] filtrarMaiores(int[] vetor, int qnt){
        int[] outVetor = new int[qnt];
        int p = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            boolean maior = true;
            
            for (int j = i; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    maior = false;
                    break;
                }
            }
            
            if (maior) {
                outVetor[p] = vetor[i];
                p++;
            }
        }
        return Vetores.subVetorInt(outVetor, 0, p);// subvetorInt vai ir ate o numero de ca
    }

}
