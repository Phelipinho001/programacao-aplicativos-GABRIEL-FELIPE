package estatisticasalario;

import java.util.Scanner;

public class EstatisticaSalario {
    private int quantidade;
    private double[] salarios;

  
    public EstatisticaSalario(int quantidade) {
        this.quantidade = quantidade;
        this.salarios = new double[quantidade];
    }

    
    public void lerSalarios() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o salário do " + (i + 1) + "º funcionário: ");
            salarios[i] = input.nextDouble();
        }
    }

  
    public double Media() {
        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += salarios[i];
        }
        return soma / quantidade;
    }
    
   public int acimaMedia() {
        double media = this.Media();
        int contador = 0;
        for (int i = 0; i < quantidade; i++) {
            if (salarios[i] > media) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos funcionários você quer cadastrar? ");
        int qtd = input.nextInt();

        EstatisticaSalario estatistica = new EstatisticaSalario(qtd);
        estatistica.lerSalarios();

      

        int qtdAcimaMedia = estatistica.acimaMedia();
        System.out.println("Quantidade de funcionários com salário acima da média: " + qtdAcimaMedia);
    }
}
