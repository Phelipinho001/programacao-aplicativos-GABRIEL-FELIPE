package mesano;
import java.util.Scanner;

public class MesAno {

    private int mes;

    
    public MesAno(int mes) {
        this.mes = mes;
    }

   
    public String mes() {
        String namemes;
        switch (mes) {
            case 1 -> namemes = "Janeiro";
            case 2 -> namemes = "Fevereiro";
            case 3 -> namemes = "Março";
            case 4 -> namemes = "Abril";
            case 5 -> namemes = "Maio";
            case 6 -> namemes = "Junho";
            case 7 -> namemes = "Julho";
            case 8 -> namemes = "Agosto";
            case 9 -> namemes = "Setembro";
            case 10 -> namemes = "Outubro";
            case 11 -> namemes = "Novembro";
            case 12 -> namemes = "Dezembro";
            default -> namemes = "Mês inválido";
        }
        return namemes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        int numeroMes = scanner.nextInt();

        MesAno mesAno = new MesAno(numeroMes);

        System.out.println("O mês correspondente é: " + mesAno.mes());
    }
}
