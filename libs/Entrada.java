package libs;
import java.util.Scanner;

public class Entrada {
static Scanner entrada;
// Módulo para abrir a entrada
    public static void abrir() {
        entrada = new Scanner(System.in);
    }

    // Módulo para fechar a entrada
    public static void fechar() {
        entrada.close();
    }

    // Módulo para ler um valor inteiro
    public static int lerInt() {
        return entrada.nextInt();
    }

    // Módulo para ler um valor inteiro e mostrar uma mensagem
    public static int lerInt(String mensagem) {
        // mostra a mensagem
        System.out.print(mensagem);
        // lê o valor e o retorna para que seja atribuído à variável
        return entrada.nextInt();
    }

    // Módulo para ler um valor float
    public static float lerFloat() {
        return entrada.nextFloat();
    }

    // Módulo para ler um valor inteiro e mostrar uma mensagem
    public static float lerFloat(String mensagem) {
        // mostra a mensagem
        System.out.println(mensagem);
        // lê o valor e o retorna para que seja atribuído à variável
        return entrada.nextFloat();
    }

    // Módulo para ler um valor String
    public static String lerString() {
        return entrada.next();
    }

    // Módulo para ler um valor inteiro e mostrar uma mensagem
    public static String lerString(String mensagem) {
        // mostra a mensagem
        System.out.println(mensagem);
        // lê o valor e o retorna para que seja atribuído à variável
        return entrada.next();
    }
}