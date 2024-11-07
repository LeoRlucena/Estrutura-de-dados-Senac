/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pti_dados;

import arvore.ArvoreBinaria;
import arvore.No;
/**
 *
 * @author Léo
 */
public class PTI_Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        arvore.inserir(555);
        arvore.inserir(333);
        arvore.inserir(888);
        arvore.inserir(111);
        arvore.inserir(444);
        arvore.inserir(999);
        
        int esquerdaFestiva = arvore.contarNosEsquerdaFestiva();
        System.out.println("Numero de nós da esquerda festiva: " + esquerdaFestiva);
        
        System.out.println("Árvore com recuos: ");
        arvore.imprimeArvore();
    }
    
}
