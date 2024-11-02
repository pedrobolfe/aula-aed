package aulas;

import libs.Vetores;

public class Aula34 {
    public static void aula() {
        System.out.println("== Aula 34 - Busca ==");

        System.out.println("Gerando numeros..");
        long tempIniGerar = Vetores.medirTempoIniciar();
        int[] arr = Vetores.gerarValoresAleatoriosOrdenado(100_000_000, 0, 100_000_000);
        double tempFimGerar = Vetores.medirTempoFinalizarSegundos(tempIniGerar);

        System.out.println("Tempo em segundos para gerar um array ordenado " + tempFimGerar);

        long tempIniSequencial = Vetores.medirTempoIniciar();
        int pos1 = Vetores.buscaSequencial(arr, 499_080);
        double tempFimSequencial = Vetores.medirTempoFinalizarSegundos(tempIniSequencial);

        long tempIni = Vetores.medirTempoIniciar();
        int pos2 = Vetores.buscaBinaria(arr, 499_080);
        double tempFim = Vetores.medirTempoFinalizarSegundos(tempIni);

        System.out.println("Tempo da busca binaria, encontrado na posicao = " + pos2 + " em " + tempFim + " segundos");
        System.out.println("Tempo da busca sequencial, encontrado na posicao = " + pos1 + " em " + tempFimSequencial + " segundos");

    }
}
