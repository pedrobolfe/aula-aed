package Introducao.Trabalho;

public class Main {
    public static boolean domotica(boolean sLuz, boolean sPresenca){// 
        return !sLuz && sPresenca;
    }

    public static boolean irrigacao(boolean t35, boolean t10, boolean sChuva, boolean sDia, boolean sUmidade){
        return !t35 && t10 && sDia && !sChuva && sDia && sUmidade;
    }

    public static boolean toldo(boolean sol, boolean chuva, boolean vento, boolean frio){ // 1 para abaixar o toldo
        return sol && chuva && vento && frio;
    }

    public static void main(String[] args) {
        System.out.println("A lâmpada esta ? " + domotica(true, true));
        System.out.println("Irrigacao vai funcionar " + irrigacao(false, true, false, true, true));
    }
}
 