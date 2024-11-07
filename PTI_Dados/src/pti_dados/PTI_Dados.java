package pti_dados;

import arvore.ArvoreBinaria;

public class PTI_Dados {
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
        
        arvore.imprimeArvore();
    }   
}
