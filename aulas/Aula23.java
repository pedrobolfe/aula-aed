package aulas;

public class Aula23 {
    public static int obterPosicaoProxChar (String frase, int pos_ini, char c) {
        for (int i = pos_ini; i < frase.length(); i++) {
            if (frase.charAt(i) == c) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int pos = obterPosicaoProxChar("abacate", 2, 'e');
        System.out.println(pos);
    }
}
