package menorpeso;
import java.util.Scanner;

public class MenorPeso {
    private double[] peso;

    public MenorPeso() {
        this.peso = new double[10];
    }

   
    public void lerPesos() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < peso.length; i++) {
            System.out.print("Qual o peso da " + (i + 1) + "º pessoa: ");
            peso[i] = input.nextDouble();
        }
    }

    
    public double menorPeso() {
        double menor = peso[0];
        for (int i = 1; i < peso.length; i++) {
            if (peso[i] < menor) {
                menor = peso[i];
            }
        }
        return menor;
    }

   
    public static void main(String[] args) {
        MenorPeso mp = new MenorPeso(); 
        mp.lerPesos(); 
        double menor = mp.menorPeso(); 
        System.out.println("O menor peso é: " + menor + " kg");
    }
}
