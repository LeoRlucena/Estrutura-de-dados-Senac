/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author Léo
 */
public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void insere(long id, Object elemento) // método para inserção de elemento
    {
        No novoNo = new No(id, elemento, null, null);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            No atual = raiz;
            No pai;
            while (true) {
                pai = atual;
                if (id < atual.getId()) { // vai inserir à esquerda
                    atual = atual.getEsq();
                    if (atual == null) { // pode inserir à esquerda
                        pai.setEsq(novoNo);
                        return;
                    } // se não é nulo, vai tentar o próximo filho
                } else { // vai inserir à direita
                    atual = atual.getDir();
                    if (atual == null) { // pode inserir à direita
                        pai.setDir(novoNo);
                        return;
                    }
                }
            }
        }
    }

    private void preFixado(No atual) {
        if (atual != null) {
            System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
            preFixado(atual.getEsq());
            preFixado(atual.getDir());
        }
    }

    private void posFixado(No atual) {
        if (atual != null) {
            posFixado(atual.getEsq());
            posFixado(atual.getDir());
            System.out.println("Id: " + atual.getId() + "Elemento: " + atual.getElemento());
        }
    }

    private void simFixado(No atual) {
        if (atual == null) {
            simFixado(atual.getEsq());
            System.out.println("Id: " + atual.getId() + "Elemento: " + atual.getElemento());
            simFixado(atual.getDir());
        }
    }

    public void imprimeElementosArvore() {
        preFixado(raiz);
    }

    public long calcAltura(No atual, long a) {
        if (atual != null) {
            long e, d;
            e = calcAltura(atual.getEsq(), a) + 1;
            d = calcAltura(atual.getDir(), a) + 1;
            if (e > d) {
                return a + e;
            } else {
                return a + d;
            }
        }
        return a;
    }

    public long alturaArvore() {
        long a = 0;
        return calcAltura(raiz, a);
    }
}
