/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06_gabrielfelipe;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Aluno
 */
public class Atividade06_Gabrielfelipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);   
        
        // 1
//        
//        double nt;
//        do {
//         System.out.printf("Qual a nota : ");
//         nt = input.nextDouble();
//         
//            
//        }while (nt > 10 || nt <0);
//        
//        System.out.println("Nota valida "+ nt);
//        

        //2
//        int num,sm,contador,media;
//        sm = 0;
//        contador = 0;
//        do{
//            System.out.print("Digite um numero:(Zero encerra)");
//            num = input.nextInt();
//            
//        sm = sm + num;
//        contador++;
//        media = sm / contador;
//        
//        }while(num != 0);
//        
//        System.out.println("Soma :" + sm);
//        System.out.println("Quantidade :" + (contador-1) );
//        System.out.println("Media:" + media );

            //3
//            int num,chute;
//              num =(int)(Math.random()*100)+1;
//            
//          do{
//              System.out.println("Tente adivinhar o número   :  (de 0 a 100)  ");
//              chute = input.nextInt();
//              
//            
//              
//          }while(chute != num);
//          System.out.println("Parabens você acertou , c quiser presente pede a professora 1 ponto ");
          
            //4          
        
            
//        int numb;
//        String opc;
//        
//        do{
//            System.out.print("Digite um numero valido positivo : ");
//            numb = input.nextInt();
//            if (numb > 0){
//                for(int i =0 ;i < numb ; i++){
//                    System.out.print(numb - i);
//                }
//            }
//            
//            System.out.println("Deseja repetir ? (S/N)");
//            opc = input.next();
//            if (!opc.equalsIgnoreCase("N") && !opc.equalsIgnoreCase("S"))
//                System.out.print("Digite uma opção valida!!");
//                
//            }while (opc.equalsIgnoreCase("S") || numb <= 0 );

            //5
          
//            String snh,tnt;
//            snh = "Biel620";
//            int num = -1;
//            boolean senhacorreta = false;
//            do{ 
//                num++;
//                System.out.print("Qual sua senha : ("+ (3 - num) +" tentativas)");
//                tnt = input.next();
//                
//                if (tnt.equals(snh)) {
//                senhacorreta = true;
//                System.out.println("Senha correta!");
//            } else {
//                System.out.println("Senha incorreta!");
//            }
//
//            }while(!senhacorreta && num < 3 );

            //6
            
//                double numb;
//                
//                System.out.print("Digite um numero :");
//                numb = input.nextDouble();
//                
//                for(int i = 1 ; i <= 10; i++){
//                    double resultado = numb * i;
//                    System.out.println(numb+" x "+i+" = "+resultado);
//                }
                    
//                    7
//                int n ,par,imp;
//                
//                System.out.println("Digite um numero inteiro positivo ");
//                n = input.nextInt();
//                par = 0;
//                imp = 0;
//                if ( n <= 0 ){
//                    System.out.println("Seu numero é invalido");
//                }
//                else {
//                    
//                for (int i = 1 ; i <= n;i++){
//                    if(i % 2 == 0 ){
//                        par += i;
//                    }
//                    else{
//                        imp += i; 
//                    }
//                        }
//                }
//                System.out.println("Soma dos numeros pares são" + par);
//                System.out.println("Soma dos numeros impares são" + imp);

//                  8

        int n;

        System.out.print("Digite um número positivo acima de 1: ");
        n = input.nextInt();

        if (n <= 1) {
            System.out.println("Digite um número acima de 1");
        } else {
            for (int i = 2; i <= n; i++) {
                boolean primo = true;
                for (int k = 2; k * k <= i; k++) {
                    if (i % k == 0) {
                        primo = false;
                        break;
                    }
                }

                if (primo == true ) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
                    
                    


// TODO code application logic here

