package sequenciafibonacci;
import java.util.Scanner;

public class SequenciaFibonacci {


    private int N;

    public SequenciaFibonacci() {
        this.N = 0;
    }

    public void gerarSequencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos termos da sequência Fibonacci você quer ver? ");
        N = input.nextInt();

        int a = 0; 
        int b = 1; 
        int soma;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            soma = a + b;
            a = b;        
            b = soma;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        SequenciaFibonacci sf = new SequenciaFibonacci();
        sf.gerarSequencia();
    }
}
