/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menucalc;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class MenuCalc {
    
    private double A;
    private double B;

public MenuCalc (double A , double B ){
    this.A = A ;
    this.B = B;
    
}
public double soma(){
    return A + B ;
}    

public double subtracao(){
    return A - B ; 
}

public double mutiplicacao(){
    return A * B;
}

public double divisao(){
    return A / B;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        double resultado = 0 ;
        
       System.out.println("Escreva dois numeros inteiros : ");
       int numb1 = input.nextInt();
       int numb2 = input.nextInt();
        
        System.out.println("===MENU===");
        System.out.println("1 Soma");
        System.out.println("2 Subtração");
        System.out.println("3 Mutiplicação");
        System.out.println("4 Divisão");
        
        System.out.println(" Qual operação vc dejesa usar com esses numeros ");
        int menu = input.nextInt();
            
        MenuCalc calc = new MenuCalc(numb1,numb2);
        switch(menu){
            case 1 -> resultado = calc.soma();
            case 2 -> resultado = calc.subtracao();
            case 4 -> resultado = calc.divisao();
            case 3 -> resultado = calc.mutiplicacao();
            default -> {
                System.out.println("!!!Opção invalida!!!");
            }
        }
        System.out.println(" ");
        System.out.println( "resultado : " + resultado );
// TODO code application logic here
    }
    
}
