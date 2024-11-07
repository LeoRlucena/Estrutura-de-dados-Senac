/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author Léo
 */
public class No {
    private long id;
    private No esq;
    private No dir;
    
    public No(long id) {
        this.id = id;
        this.esq = null;
        this.dir = null;
    }

    public long getId() {
        return id;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }
    
    
}
