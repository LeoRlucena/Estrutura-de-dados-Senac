package arvore;

public class No {
    private long id;
    private No esq, dir;
    
    public No(long id) {
        this.id = id;
        this.esq = null;
        this.dir = null;
    }

    public long getId() { return id; }

    public No getEsq() { return esq; }

    public void setEsq(No esq) { this.esq = esq; }

    public No getDir() { return dir; }

    public void setDir(No dir) { this.dir = dir; }
    
}
