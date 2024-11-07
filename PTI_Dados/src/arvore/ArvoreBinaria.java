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

    public ArvoreBinaria() { this.raiz = null; }

    public void inserir(long id) {
        raiz = inserirRecursivo(raiz, id);
    }

    private No inserirRecursivo(No atual, long id) {
        if (atual == null) {
            return new No(id);
        }

        if (id < atual.getId()) {
            atual.setEsq(inserirRecursivo(atual.getEsq(), id));
        } else if (id > atual.getId()) {
            atual.setDir(inserirRecursivo(atual.getDir(), id));
        }

        return atual;
    }

    public int contarNosEsquerdaFestiva() {
        return contarNosEsquerdaFestiva(raiz, false);
    }

    private int contarNosEsquerdaFestiva(No no, boolean isEsquerda) {
        if (no == null) {
            return 0;
        }

        int contador = 0;
        if (isEsquerda) {
            contador++;
        }

        contador += contarNosEsquerdaFestiva(no.getEsq(), true);
        contador += contarNosEsquerdaFestiva(no.getDir(), false);

        return contador;
    }

    public void imprimeArvore() 
    {
        No atual = this.raiz;
        int qnt = 0;
        ArvoreBinaria.preFixado(atual, qnt);
    }

    private static void preFixado(No atual, int qnt) {
        String espaço = "";
        for (int i = 1; i <= qnt; i++) {
            espaço += "   ";
        }
        if (atual != null) {
            qnt++;

            System.out.println(espaço + atual.getId());
            if (atual.getEsq() == null) {
                System.out.println(espaço + "   -");
            }
            if (atual.getDir() == null) {
                System.out.println(espaço + "   -");
            }
            preFixado(atual.getEsq(), qnt);
            preFixado(atual.getDir(), qnt);
        }
    }
}
