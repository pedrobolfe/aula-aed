package aulas;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Aula32 {
    public static void aula() {
        System.out.println("== Arquivos ==");

        //ex01(); // criação e escrita
        calculaMediaNnumeros();
    }

    public static void ex01(){
        String nome_arq = "/numeros.txt";
        try{
            FileWriter arquivo = new FileWriter(nome_arq);

            for (int i =0; i <=10; i++){
                arquivo.write(i+"\n");

            }
            arquivo.close();
        } catch (Exception e){
            System.err.println("Erro");
            System.err.println(e);
        }
    }

    public static void ex02(){
        String nome_arq = "arquivos/valores.txt";
        try{
            File arquivo = new File(nome_arq);

            Scanner entrada = new Scanner(arquivo);

            int val = entrada.nextInt();
            System.out.println(val);

            entrada.close();
        } catch (Exception e){
            System.err.println("Erro");
            System.err.println(e);
        }
    }

    public static void calculaMedia(){
        String nome_arq = "arquivos/valores.txt";
        try{
            int soma = 0;
            File arquivo = new File(nome_arq);

            Scanner entrada = new Scanner(arquivo);

            for (int i = 0; i < 10; i++){
                soma += (int) entrada.nextInt();
            }
            
            System.out.println(soma/10);

            entrada.close();
        } catch (Exception e){
            System.err.println("Erro");
            System.err.println(e);
        }
    }

    public static void calculaMediaNnumeros(){
        String nome_arq = "arquivos/valores_n.txt";
        try{
            int soma = 0;
            File arquivo = new File(nome_arq);

            Scanner entrada = new Scanner(arquivo);

            int n = entrada.nextInt();
            for (int i = 0; i < n; i++){
                soma += (int) entrada.nextInt();
            }
            
            System.out.println(soma/n);

            entrada.close();
        } catch (Exception e){
            System.err.println("Erro");
            System.err.println(e);
        }
    }
}
