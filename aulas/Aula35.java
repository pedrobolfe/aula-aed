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
        System.out.println("== Aula 35 - Filas ==");

        String[] exp = {"2", "3", "+", "5", "5", "*"};

        double resp = calcularPolonesaReversa(exp);

        //System.out.println("Resultado da expressão é "+ resp);

        ex03();
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
}
