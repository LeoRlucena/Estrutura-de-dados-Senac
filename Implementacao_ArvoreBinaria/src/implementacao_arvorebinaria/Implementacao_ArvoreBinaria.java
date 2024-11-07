/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementacao_arvorebinaria;

import arvore.ArvoreBinaria;
import arvore.No;
/**
 *
 * @author Léo
 */
public class Implementacao_ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(10,"A");
        a.insere(5,"B");
        a.insere(15,"C");
        a.insere(2,"D");
        a.insere(7,"E");
        a.insere(12,"F");
        a.insere(6,"G");
        a.insere(8,"H");
        
        a.imprimeElementosArvore();
        System.out.println("Altura: " + a.alturaArvore());
    }
    
}
