/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomeprocurado;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class NomeProcurado {
    
    private String nomes[];
    private String nome;
public NomeProcurado(){
   
    this.nomes = new String[10];
}
public String nome (){
    Scanner input = new Scanner(System.in);
    for(int i = 0  ;i < nomes.length; i++){
        System.out.println("Escreva o "+(i+1)+ " nome");
        nomes[i] = input.nextLine();
    }
    return "" ;
}
public void Procurado(){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o nome procurado :");
    nome = input .nextLine();
    
  boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) { 
                System.out.println("Nome encontrado na posição " + i);
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println(-1);
        }

        input.close();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NomeProcurado np = new NomeProcurado();
        np.nome();      
        np.Procurado();
        // TODO code application logic here
    }
    
}
