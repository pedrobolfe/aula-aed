package aulas;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import libs.Vetores;

public class Aula35 {
    public static void aula() {
        System.out.println("== Aula 34 - Busca ==");

        trabalho4bimestre();
    }

    public static void ex01(){
        System.out.println("# FILAS # -- FIFO - First in First Out");
        Queue<Integer> fila = new LinkedList<>();

        fila.add(23);
        fila.add(42);
        fila.add(63);
        fila.add(4);
        fila.add(72);
        fila.add(242);
        fila.add(402);
        fila.add(72);

        int x = fila.poll();

        System.out.println(fila.isEmpty());
        System.out.println(x);


        System.out.println("## retirando todos os elementos ##");

        while (!fila.isEmpty()) {
            x = fila.poll();
            System.out.println(x);
        }
    }

    public static void ex02(){
        System.out.println("# PILHAS # -- FILO - First in Last Out");

        Stack<Integer> pilha = new Stack<>();
        int x;

        pilha.push(35);
        pilha.push(8675);
        pilha.push(34);
        pilha.push(855);
        pilha.push(554);
        pilha.push(6234);


        while (!pilha.isEmpty()){
            x = pilha.pop();
            System.out.println(x);
        }
    }

    public static double calcularPolonesaReversa(String[] valores){
        double saida = 0.00;

        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < valores.length; i++){
            if (valores[i] == "+"){
                saida += (pilha.pop() + pilha.pop());
            } else if (valores[i] == "-"){
                saida += (pilha.pop() - pilha.pop());
            } else if (valores[i] == "/"){
                saida += (pilha.pop() / pilha.pop());
            } else if(valores[i] == "*"){
                saida += (pilha.pop() * pilha.pop());
            } else {
                int num = Integer.parseInt(valores[i]);
                pilha.push(num);
            }
        }
        return saida;
    }

    public static void ex03(){
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(20);
        conjunto.add(50);

        for (int y : conjunto){
            System.out.println(y);
        }
        
        System.out.println(conjunto.contains(30));
    }

    public static void trabalho4bimestre(){
        System.out.println("Executando o trabalho do 4 bimestre");
        /// gerar os vetores para ordenar (100,	1000,	10000,	100000,	1000000,	10000000) e medir o tempo de gerar numeros
        System.out.println("Gerando numeros..");
        long tempIniGerar = Vetores.medirTempoIniciar();
        int[] vet100 = Vetores.gerarValoresAleatorios(100, 0, 100_000_000);
        int[] vet1000 = Vetores.gerarValoresAleatorios(1000, 0, 100_000_000);
        int[] vet10_000 = Vetores.gerarValoresAleatorios(10_000, 0, 100_000_000);
        int[] vet100_000 = Vetores.gerarValoresAleatorios(100_000, 0, 100_000_000);
        int[] vet1_000_000 = Vetores.gerarValoresAleatorios(1_000_000, 0, 100_000_000);
        int[] vet10_000_000 = Vetores.gerarValoresAleatorios(10_000_000, 0, 100_000_000);
        double tempFimGerar = Vetores.medirTempoFinalizarSegundos(tempIniGerar);

        System.out.println("O tempo para gerar os numeros aleatorios foi de "+ ((int) tempFimGerar/60) +":" + ((int) tempFimGerar%60));

        // vetor 100 posicoes
        long vet100tempIni = Vetores.medirTempoIniciar();
        Vetores.quickSort(vet100, 0, vet100.length-1);
        double vet100tempFim = Vetores.medirTempoFinalizarSegundos(vet100tempIni);
        System.out.println("Tempo para ordenar vetor de 100 posicoes foi de " + vet100tempFim + " segundos");

        // vetor 1000 posicoes
        long vet1000tempIni = Vetores.medirTempoIniciar();
        Vetores.quickSort(vet1000, 0, vet1000.length-1);
        double vet1000tempFim = Vetores.medirTempoFinalizarSegundos(vet1000tempIni);
        System.out.println("Tempo para ordenar vetor de 1.000 posicoes foi de " + vet1000tempFim + " segundos");

        // vetor 10_000 posicoes
        long vet10_000tempIni = Vetores.medirTempoIniciar();
        Vetores.quickSort(vet10_000, 0, vet10_000.length-1);
        double vet10_000tempFim = Vetores.medirTempoFinalizarSegundos(vet10_000tempIni);
        System.out.println("Tempo para ordenar vetor de 10.000 posicoes foi de " + vet10_000tempFim + " segundos");

        // vetor 100_000 posicoes
        long vet100_000tempIni = Vetores.medirTempoIniciar();
        Vetores.quickSort(vet100_000, 0, vet100_000.length-1);
        double vet100_000tempFim = Vetores.medirTempoFinalizarSegundos(vet100_000tempIni);
        System.out.println("Tempo para ordenar vetor de 100.000 posicoes foi de " + vet100_000tempFim + " segundos");

        // vetor 1_000_000 posicoes
        long vet1_000_000tempIni = Vetores.medirTempoIniciar();
        Vetores.quickSort(vet1_000_000, 0, vet1_000_000.length -1);
        double vet1_000_000tempFim = Vetores.medirTempoFinalizarSegundos(vet1_000_000tempIni);
        System.out.println("Tempo para ordenar vetor de 1.000.000 posicoes foi de " + vet1_000_000tempFim + " segundos");

        // vetor 10_000_000 posicoes
        long vet10_000_000tempIni = Vetores.medirTempoIniciar();
        Vetores.quickSort(vet10_000_000, 0, vet10_000_000.length-1);
        double vet10_000_000tempFim = Vetores.medirTempoFinalizarSegundos(vet10_000_000tempIni);
        System.out.println("Tempo para ordenar vetor de 10.000.000 posicoes foi de " + vet10_000_000tempFim + " segundos");
    }
}
