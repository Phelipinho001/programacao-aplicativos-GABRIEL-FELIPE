/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menorpeso;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class MenorPeso {
    
    private double peso[];
    private double pesopessoa;
public MenorPeso(double pesopessoa){
    this.peso = new double[10];
    this.pesopessoa = pesopessoa;
}
public double Peso(){
    Scanner input = new Scanner(System.in); 
    for(int i = 0 ; i < 10 ; i++){
        System.out.println("Qual o peso da " + (i+1)+ "º pessoa : ");
        peso[i] = input.nextDouble(); 
            }
}
public double peso {
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
