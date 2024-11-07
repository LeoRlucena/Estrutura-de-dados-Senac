/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author Léo
 */
public class Lista {
    private No inicio;
    
       public Lista() {
        this.inicio = null;
    }
       
    // criar a lista
 
    // inserção de nos
       
    public void insereInicio(Object elemento) {
        No novoNo = new No(elemento, null);
        novoNo.setProx((this.inicio));
        this.inicio = novoNo;
    }
    
    // remoção de nos
    
    public Object removeInicio() {
        No auxiliar = this.inicio;
        this.inicio = auxiliar.getProx();
        return auxiliar.getElemento();
    }
    
    // impressão
    
    public void imprimeLista() {
        No auxiliar = this.inicio;
        System.out.println("Início da Lista Ligada");
        while (auxiliar != null) {   
            System.out.println(auxiliar.getElemento());
            auxiliar = auxiliar.getProx();
        }
        System.out.println("Fim da Lista Ligada");
    }

    // buscar elemento
    
    public Object buscaElemento(long posicao) {
        No auxiliar = this.inicio;
        while ((posicao > 0) && (auxiliar != null)) 
        {
            if (posicao == 1)
            return auxiliar.getElemento();
                posicao--;
            auxiliar.getProx();
        }
        return null;
    }
    
    // liberar lista (limpar)
    
    public void LiberaLista() {
        while (inicio != null) {
            inicio.getProx();
        }
    }
}
