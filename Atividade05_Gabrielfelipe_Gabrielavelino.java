/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06_gabrielfelipe_gabrielavelino;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Aluno
 */
public class Atividade06_Gabrielfelipe_Gabrielavelino {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // 1
        /*
        System.out.print("N: ");
        int N = scanner.nextInt();
        
        int counter = 0;
        
        while (counter != N) {
            counter += 1;
            System.out.println(counter);
        }
        */
        
        // 2
        /*
        int cnt;
        System.out.println("Digite um numero : ");
        cnt = scanner.nextInt();
        while(cnt != -1){
            cnt += 1;
            System.out.println(cnt);
        }
        */
        
        // 3
        /*
        String Senha = "";
        
        while (!Senha.equals("Java123")){
        System.out.print("Senha: ");
        Senha = scanner.nextLine();
        
        if (!Senha.equals("Java123")) {
            System.out.println("Senha Incorreta.");
        }}
        System.out.println("Senha Correta.");
        */
        
        // 4
        /*
        int opcao = 10;
        
        while (opcao != 0) {
            
            System.out.println("Escolha a Operacao :");
                
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("0 - Sair");
        
            System.out.println("Escolha: ");
            opcao = scanner.nextInt(); 
        
            switch (opcao) {
             case 1 ->                 {
                     System.out.println("prim. Num: ");
                     double n1 = scanner.nextDouble();
                     System.out.println("seg. Num: ");
                     double n2 = scanner.nextDouble();
                     System.out.println("Resultado = "+ (n1 + n2));
                }
             case 2 ->                 {
                     System.out.println("prim. Num: ");
                     double n1 = scanner.nextDouble();
                     System.out.println("seg. Num: ");
                     double n2 = scanner.nextDouble();
                     System.out.println("Resultado = "+ (n1 - n2));
                }
             case 3 ->                 {
                     System.out.println("prim. Num: ");
                     double n1 = scanner.nextDouble();
                     System.out.println("seg. Num: ");
                     double n2 = scanner.nextDouble();
                     System.out.println("Resultado = "+ (n1 * n2));
                }
             default -> {
                }
            }
        }

        */
        
        // 5
        
        /*
        System.out.print("N!: ");
        int n = scanner.nextInt();
       
        int counter = n;
        int res = 1;
        
        if (n <= 0) {
            System.out.println("N invalido (menor que 0)");
        }
        else {
            while (counter > 1) {
                res *= counter;
                counter-- ;
            }
            System.out.println(res);
        }
        */
        
        // 6
        /*
        System.out.print("N: ");
        int n = scanner.nextInt();

        int a = 0; 
        int b = 1; 
        
        int prox = a + b;
        
        System.out.print("Fibonacci ate " + n + ": ");

        System.out.println(a);
        if (b <= n) {
            System.out.println(b);
        }

        while (prox <= n) {
            System.out.println(prox);
            a = b;
            b = prox;
            prox = a + b;
        }
        */
        
        // 7
        /*
        System.out.println("N: ");
        int n = scanner.nextInt(); 
        
        int d = 2;
        boolean primo = true;
        
        if (n >= 2) {
            while (d * d <= n) {
                if (n % d == 0) {
                    primo = false;
                    break;
                }
                d++;
            }
            
            if (primo) {
                System.out.println(n + " e primo.");
            } else {
                System.out.println(n + " nao e primo.");
            }
        } else {
            System.out.println("Valor Invalido (menor que 2).");
        }
        */
        
        // 8
        
        /*
        System.out.print("Adicione um Numero Positivo (Negativo para encerrar): ");
        int n = scanner.nextInt();
        
        int soma = 0;
        while (n >= 0) {
            soma += n;
            System.out.print("+ ");
            n = scanner.nextInt();
        }
        System.out.print("Soma = " + soma);
        */
        
        // 9 
        // a)
        
        /*
        System.out.print("Adicione um Numero: ");
        int n = scanner.nextInt();
        
        int qtdD = 0;
        
        while (n > 0) {
            qtdD++;
            n /= 10;
        }
        System.out.print("Qtd. de Digitos: "+ qtdD);
        */
        
        // b)
        /*
        System.out.print("Adicione um Numero: ");
        int n = scanner.nextInt();
        
        int somaD = 0;
        
        while (n > 0) {
            int D = n % 10;
            somaD += D;
            n /= 10;
        }
        System.out.print("Soma de Digitos: "+ somaD);
        */
        
        // c)
        
        // eta
        
        // 10
        /*
        System.out.print("Adicione um Numero: ");
        int n = scanner.nextInt();
        
        while (n > 1) {
            if (n % 2 == 0) {
                n = n/2;
                System.out.println(n);
            } else {
                n = 3*n + 1;
                System.out.println(n);
            }
        }
        */
    }
}
        // TODO code application logic here
    
    

