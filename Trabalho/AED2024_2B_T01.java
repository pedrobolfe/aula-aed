package Trabalho;
import java.nio.channels.Pipe.SourceChannel;

import libs.*;

public class AED2024_2B_T01 {
    public static int obterSomaPrimosIntervalo(int m, int n){
        int soma = 0;
        for (int i = m; i < n; i++) {
            if (Matematica.primo(i) == true){
                soma+=i;
            }
        }
        return soma;
    }

    public static boolean potN(int x, int n){
        int aux = n;
        while (x >= aux) {
            if (x <= aux) break;
            aux*=n;
        }
        return x==aux ? true : false;
    }

    public static double obterDistanciaCartesiana(int x1, int y1, int x2, int y2){
        double dist =  Math.pow((double) (x2-x1), 2) + Math.pow((double) (y2-y1), 2);

        return Math.sqrt(dist);
    }

    public static float converterTemperatura(double temperatura, String in_temp, String out_temp){
        if (in_temp.equals("C") || in_temp.equals("c")){ // FEITO
            if (out_temp.equals("C")) return (float) temperatura;
            if (out_temp.equals("K")) return (float) (temperatura + 273.15);
            if (out_temp.equals("F")) return (float) ((9/5 * temperatura) + 32);
            if (out_temp.equals("R")) return (float) (temperatura * 4/5);
        }
        else if (in_temp.equals("K") || in_temp.equals("k")){ // FEITO
            if (out_temp.equals("K")) return (float) temperatura;
            if (out_temp.equals("F")) return (float) (1.8 * (temperatura - 273.15) + 32);
            if (out_temp.equals("R")) return (float) ((temperatura - 273.15) * 0.8);
            if (out_temp.equals("C")) return (float) (temperatura - 273.15);
        }
        else if (in_temp.equals("F") || in_temp.equals("f")){
            if (out_temp.equals("F")) return (float) temperatura;
            if (out_temp.equals("K")) return (float) ((temperatura + 459.57) * 5/9);
            if (out_temp.equals("R")) return (float) ((temperatura - 32) / 2.25);
            if (out_temp.equals("C")) return (float) ((temperatura - 32) * 5/9);
        } 
        else if (in_temp.equals("R") || in_temp.equals("r")){
            if (out_temp.equals("R")) return (float) temperatura;
            if (out_temp.equals("K")) return (float) ((temperatura / 0.8) + 273.15);
            if (out_temp.equals("F")) return (float) ((temperatura  * 9/4) +32);
            if (out_temp.equals("C")) return (float) (temperatura * 5/4);
        } else {
            System.out.println("Erro, parametros invalidos");
        }
        return (float) temperatura;
    }

    public static String obterFrequencia(String frase){
        String freq = "";
        char c_atual;
        int qnt = 0;
        boolean jaTem = false;

        for (int i = 0; i < frase.length(); i++){
            c_atual = frase.charAt(i);
            for (int p = 0; p < freq.length(); p++){ // for para verificar se o caracter ja foi contado
                if (freq.charAt(p) == frase.charAt(i)){
                    jaTem = true;
                    break;
                }
            }
            if (jaTem == false){ // se o caracter nao foi contado, contar as ocorrencias do caracter e concatenar na string
                for (int j = i;j < frase.length(); j++){
                    if (c_atual == frase.charAt(j)){
                        qnt++;
                    }
                }
                freq += c_atual + "" + qnt;
                qnt=0;
            }
            jaTem=false;
        }

        return freq;
    }

    public static boolean verificaAnagrama(String palavra_a, String palavra_b){
        if (palavra_a.length() != palavra_b.length()) return false;
        String saida = obterFrequencia(palavra_a.toLowerCase());
        String saidb = obterFrequencia(palavra_b.toLowerCase());

        int tam = saida.length(), cont = 0;
        String aux, aux2;

        for (int i = 0; i < tam; i+=2){
            aux = saida.substring(i, i+2);
            for (int j = 0; j < tam; j+=2){
                aux2 = saidb.substring(j, j+2);
                if (aux.equals(aux2)){
                    cont+=2;
                }
            }
        }

        return cont == tam ? true : false;
    }

    public static String repeticoesSequencia(String entrada){ // ..,,aaaAAAAA--------!!!!!!!!!!!!!!!999999900      .
        if (entrada.length() == 0) return "";
        String saida = "";
        int aux = 0;
        char ultimo_c = entrada.charAt(0);
        for (int i = 0; i < entrada.length(); i++){
            if (entrada.charAt(i) == ultimo_c){
                aux ++;
            } else{
                saida += aux + ""+ ultimo_c+",";
                aux=1;
            }
            ultimo_c = entrada.charAt(i);
        }// nao vai pegar a ultima (posicao "-1") letra e nem a contagem, entao concatenar na string
        saida += aux + "" + entrada.charAt(entrada.length()-1);
        return saida; // 2.,2,,3a,5A,8-,15!,79,20,6 ,1.
    }

    public static String repCaractere(String num, char caracter){ // metodo para repetir caracter
        String saida = "";

        for (int j = 0; j < convertNum(num); j++){ // for para repetir as letras pela quantidade indicada
            saida += "" + caracter;
        } 
        return saida;
    }

    public static boolean verificaNum(char num){ 
        if (num == '1' || num == '2' || num == '3' || num == '4' || num == '5' || num == '6' || num == '7' || num == '8' || num == '9' || num == '0') return true;
        return false;
    }

    public static String addNum(String entrada, int ini, int fim){ 
        String num="";

        for (int j = ini+1; j < fim; j++){
            num += entrada.charAt(j);
        }
        return num;
    }

    public static String repeticosSequenciaInverso(String entrada){ //2.,2,,3a,5A,8-,15!,79,20,6 ,1.
        if (entrada.length() == 0) return "";

        String saida= "", num = "";
        char carac_repet = ' ';
        int pos_ultima_virgula = -1;
        entrada+=", ";
        for (int i =0; i <= entrada.length() -1; i++){
            if (entrada.charAt(i) == ','){
                if (entrada.charAt(i+1) == ','){
                    carac_repet = entrada.charAt(i);
                    num += addNum(entrada, pos_ultima_virgula, i);
                    pos_ultima_virgula = i+1;
                }  else {
                    carac_repet = entrada.charAt(i-1);
                    num += addNum(entrada, pos_ultima_virgula, i-1);
                    pos_ultima_virgula = i;
                    
                }
                saida += repCaractere(num, carac_repet);
            }

            num="";
        }
        return saida;//..,,aaaAAAAA--------!!!!!!!!!!!!!!!999999900      .
    }

    public static int convertNum(String num){ // "181234" obs: nao da para usar char como parametro, caso usar, concatene com "" a esquerda
        // https://www.alura.com.br/apostila-java-orientacao-objetos/o-pacote-java-lang
        int aux = 0;
        for (int i = 0; i < num.length(); i++){
            int n = num.charAt(i) - '0'; // converte o caractere para inteiro
            aux += n* Math.pow(10, num.length() -i -1); // n * a casa decimal dele, para chagar na casa deciaml pego a posicao do char pelo tamanho da string - a posicao do i - 1
        }
        return aux;// 151234
    }

    public static boolean validarCPF(String cpf){// "987.654.321-00"
        // validar formato => ###.###.###-##
        if (cpf.charAt(3) != '.' || cpf.charAt(7) != '.'  || cpf.charAt(11) != '-'){
            return false;
        }

        int somadv1 = 0, somadv2 = 0, digitodv1 = 0, digitodv2 = 0;
        String cpf_limpo = "";
        for (int t = 0; t < cpf.length(); t++){
            if (verificaNum(cpf.charAt(t)) == true){
                cpf_limpo += cpf.charAt(t);
            }
        }

        //cpf = cpf.replace(".","").replace("-", ""); //98765432100
        if (cpf_limpo.length() != 11) return false; // se nao tiver o tamanho 11, cpf invalido
        System.out.println("CPF = " + cpf + " CPF limpo = " + cpf_limpo);
        int carac_cpf;

        // percorrer o cpf ate os 9 primeiros digitos
        for (int i = 0; i < 9; i++){ // 9 == in_cpf.length()-2
            carac_cpf = convertNum(""+cpf_limpo.charAt(i));
            somadv1 += carac_cpf * (i + 1); // x*1 + x*2... obs: i tem q ir ate 9
            somadv2 += carac_cpf * i; // x*0 + x*1... obs: i tem q ir ate 10

            if (i==8) { // fazer a ultima soma do dv2
                somadv2 += convertNum(""+cpf_limpo.charAt(i+1))*(i+1);
                // pegar os digitos verificadores
                digitodv1 = convertNum(""+cpf_limpo.charAt(i+1)); // digito na posicao 10
                digitodv2 = convertNum(""+cpf_limpo.charAt(i+2)); // digito na posicao 11
            }
            System.out.println(" soma dv1: " + somadv1 + ", soma dv2: " + somadv2);
        }

        somadv1 = somadv1%11 == 10 ? somadv1%11 -10 : somadv1%11; // se o resto da divisao por 11 for 10, considerar 0
        somadv2 = somadv2%11 == 10 ? somadv2%11 -10 : somadv2%11;

        if (somadv1 == digitodv1 && somadv2 == digitodv2){
            System.out.println("Correto");
            return true;
        } 
        return false;
    }
    
    public static String substituirSubfraseTodas(String frase, String fraseDe, String frasePara){
        int ultima_pos = 0;
        String saida="", palavra;

        for (int i = 0; i < frase.length()-fraseDe.length(); i++){//ACCBBC
            palavra = frase.substring(i, i +fraseDe.length());
            if (palavra.equals(fraseDe)){
                saida+= frase.substring(ultima_pos, i) + frasePara;
                ultima_pos = i+fraseDe.length();
            }
        }
        return saida+= frase.substring(ultima_pos, frase.length());//ABBBBB
    }

    public static char mudaLetra(char letra, int n){
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char saida='a';

        for (int i = 0; i < alfabeto.length(); i++){
            if (alfabeto.charAt(i) == letra){
                if (n>0) return alfabeto.charAt((i
                +n)%26);
                //System.out.println("==== " + (i-(26+n)));
                return alfabeto.charAt(i-(26+n));
            }
        }

        return saida;
    }

    public static String cifrarCesar(String texto, int n, boolean cifrar){
        //Codigo aqui
        char letra;
        if (cifrar == false){
            letra = mudaLetra('a', -n);
        } else{
            letra = mudaLetra('z', n);
        }
        


        
        return letra+"";
    }

}
