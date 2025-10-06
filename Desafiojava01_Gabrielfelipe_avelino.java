/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojava01_gabrielfelipe_avelino;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Aluno
 */
public class Desafiojava01_Gabrielfelipe_avelino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[]descricao = new String[10];
        Double[] extrato = new Double[10];
        int opc9 = 0;
        int cnt = 0 ;
        int proximo = 0 ;
        // Armazenamento de Dados

        int qtdDeposito = 0;

        do{

            double saldoReais = 100;
            double saldoDolares = 0;
            int[] opcParcela = {6, 12, 18, 24, 30, 36, 40, 48, 56, 60, 72};


            // Menu

            boolean menu = true;

            while (menu) {
                System.out.println("\n=== CAIXA RAPIDO ===");
                System.out.println("1 - Saldo");
                System.out.println("2 - Deposito");
                System.out.println("3 - Extrato");
                System.out.println("4 - Simular Emprestimo");
                System.out.println("5 - Comprar Dolar");
                System.out.println("0 - Sair");

                System.out.print("\nEscolha: ");
                int opcao = scanner.nextInt();

                // Opções



                switch (opcao) {
                    case 1 -> {
                        boolean saldo = true;
                        while (saldo) {
                            System.out.print("\n=== SALDO ===");
                            System.out.printf("\nSaldo em Reais: R$%.2f", saldoReais);
                            System.out.printf("\nSaldo em Dolares: US$%.2f", saldoDolares, "\n");

                            System.out.println("\nDeseja voltar ao menu inicial (V) ou encerrar o programa (E)? ");
                            System.out.print("\nEscolha: ");
                            scanner.nextLine();
                            String opcao1 = scanner.nextLine();
                            if (opcao1.equalsIgnoreCase("E")) {
                                System.out.println("Encerrando o Atendimento. Obrigado por utilizar o Caixa Rápido.");
                                saldo = false;
                                menu = false;
                            } else if (opcao1.equalsIgnoreCase("V")) {
                                saldo = false;
                            } else {
                                System.out.println("Opção inválida! Voltando ao menu.");
                                saldo = false;
                            }
                        }
                        break;
                    }
                    case 2 -> {
                        boolean vardeposito = true;
                        while (vardeposito) {
                            System.out.println("=== DEPOSITO ===");
                            System.out.print("Informe o valor do deposito: R$");
                            double deposito = scanner.nextDouble();
                            scanner.nextLine();

                            if (deposito < 0 || deposito > 5000 ){
                                System.out.println("!!!VALOR INVALIDO!!!");
                                System.out.println("Informe um valor MAIOR que 0,00 e menor ou igual a  5.000,00  ");
                            } else {
                                qtdDeposito++;
                                saldoReais = saldoReais + deposito;
                                descricao[proximo]= "Deposito (+)";
                                extrato[proximo] = deposito;
                                System.out.println("Deposito realizado com sucesso!");
                            }
                            if (cnt < 10 ){
                                cnt++;
                            }

                            System.out.println("\nDeseja voltar ao menu inicial (V) ou encerrar o programa (E)? ");
                            System.out.print("\nEscolha: ");
                            String opcao2 = scanner.nextLine();

                            if (opcao2.equalsIgnoreCase("E")) {
                                System.out.println("Encerrando o Atendimento. Obrigado por utilizar o Caixa Rápido.");
                                vardeposito = false;
                                menu = false;
                            } else if (opcao2.equalsIgnoreCase("V")) {
                                vardeposito = false;
                            } else {
                                System.out.println("Opção inválida! Voltando ao menu.");
                                vardeposito = false;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("=== CAIXA RAPIDO ===");

                        if(cnt == 0){
                            System.out.println("Não a movimentações ainda !");
                        }else {
                            for (int i = 0 ; i < qtdDeposito;i++){
                                System.out.println("Seus mocimentos são :");
                                System.out.println(descricao[i]);
                                System.out.println(extrato[i]);
                            }

                        }

                    }
                    case 4 -> {
                        boolean simEmprestimo = true;

                        while (simEmprestimo) {
                            System.out.println("\n=== SIMULAR EMPRESTIMO ===");
                            System.out.print("Informe o valor do emprestimo: R$");
                            double emprestimo = scanner.nextDouble();
                            scanner.nextLine();

                            if (emprestimo < 200 || emprestimo > 100000) {
                                System.out.print("Valor Invalido");
                                return;
                            }
                                System.out.print("Informe o seu salario bruto: R$");
                                double salarioBruto = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.print("Informe a qtd. desejada de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72): ");
                                int qtdParcelas = scanner.nextInt();
                                scanner.nextLine();

                                boolean parValido = false;
                                for (int i = 0; i < opcParcela.length; i++) {
                                    if (opcParcela[i] == qtdParcelas) {
                                        parValido = true;
                                        break;
                                    }
                                }

                                if (!parValido) {
                                    System.out.println("Qtd. de Parcelas Invalidas.");
                                }

                                double juros = emprestimo * 0.02;
                                double valorTotal = emprestimo + juros;
                                double parcela = valorTotal / qtdParcelas;

                                int EM = 10000 + random.nextInt(90000);
                                double limit = salarioBruto * 0.3;


                                System.out.println("Valor da Parcela: R$"+parcela+" x "+qtdParcelas);
                                System.out.println("Valor do Empréstimo: R$"+emprestimo);
                                System.out.println("Valor Total do Empréstimo a ser pago: R$"+valorTotal);

                                if (parcela <= limit) {
                                    System.out.println("Empréstimo disponivel, entre em contato com a central e informe o numero de protocolo EM"+EM);
                                } else {
                                    System.out.printf("Empréstimo indisponível! O valor da parcela não pode ultrapassar o valor de R$ %.2f%n", limit);
                                }

                                System.out.print("\nDeseja voltar ao menu (V) ou encerrar o programa (E)? ");
                                String opcao4 = scanner.nextLine();

                                if (opcao4.equalsIgnoreCase("E")) {
                                    System.out.println("Encerrando o Atendimento. Obrigado por utilizar o Caixa Rápido.");
                                    simEmprestimo = false;
                                    menu = false;
                                } else if (opcao4.equalsIgnoreCase("V")) {
                                    simEmprestimo = false;
                                } else {
                                    System.out.println("Opção inválida! Voltando ao menu.");
                                    simEmprestimo = false;
                                }
                        }
                    }
                    case 5 -> {
                        System.out.println("=== CAIXA RAPIDO ===");
                    }
                    case 0 -> {
                        String op ;
                        boolean repetee  = true ;

                        while(repetee){
                            System.out.print("Certeza que quer encerrar o sisema (s/n):");
                            scanner.nextLine();
                            op = scanner.nextLine();
                            if ("S".equalsIgnoreCase(op)){
                                opc9 = 0;
                                System.out.println("Encerrando Sistema");
                                break;
                            }
                            else if ("N".equalsIgnoreCase(op)){
                                opc9 =  9;
                                System.out.println("OK! Voltando ao menu");
                                repetee = false;

                            }
                            else {
                                System.out.println("Opção invalida !! coloque \'s' ou 'n\' ");
                                break;
                            }

                        }
                    }
                    default -> {
                        System.out.println("Opcao Invalida.");
                    }
                }
            }
        }

        while(opc9 != 0);

    }
}