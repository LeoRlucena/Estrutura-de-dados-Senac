/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeirotad;


/**
 *
 * @author Léo
 */
public class PrimeiroTAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TADAluno joaozinho = new TADAluno("Joao");
        System.out.println(joaozinho.getNome());
        System.out.println(joaozinho.setNota(5));
    }
    
}
