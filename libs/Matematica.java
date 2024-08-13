package libs;

public class Matematica {
    public static int menor(int a, int b){
        return a < b ? a : b;
    }

    public static int fatorial(int num) {
        int aux = 1;

        for (int i = num; i > 1; i--){
            aux*=i;
        }
        return aux;
    }

    public static int fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public static int mdc(int num_a, int num_b){
        int aux=0;
        for (int i = 1; i <= num_a; i++) {
            if (num_a%i == 0 && num_b%i == 0) {
                aux = i;
            }
        }
        return aux;
    }

    public static int mmc(int num_a, int num_b){
        int maior = num_a < num_b ? num_a : num_b; // descobrir o maior valor entre os numeros 

        for (int i = maior; i <= num_a*num_b; i++) {
            if (i%num_a == 0 && i%num_b == 0) {
                return i;
            }
        }
        return 0;
    }

    public static boolean primo(int num){
        for (int i = 2 ; i < num; i++) { // for para pegar a divisao e saber se eh primo
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean perfeito(int num){ // numeros perfeitos num intervalo de 1 a 10000
        int aux=0;
        for (int i = 1; i < num; i++) {
            if (num%i == 0){
                aux+=i;
            }
        }
        if (aux == num){
            return true;
        } return false;

    }
}