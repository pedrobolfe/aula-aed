package aulas;
import libs.*;

public class Aula20{
    public static void aula(){
        System.out.println("-- Aula do dia 09/08/2024 --");
        exLerInteiro();
        System.out.println(Matematica.menor(1,3));
    }

    public static void exLerInteiro(){
        Entrada.abrir();
        int x = Entrada.lerInt("Digite um numero: ");
        System.out.println("O valor digitado foi " + x);
        Entrada.fechar();
    }
}