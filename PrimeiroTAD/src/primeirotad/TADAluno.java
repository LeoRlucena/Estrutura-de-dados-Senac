/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeirotad;

/**
 *
 * @author Léo
 */
public class TADAluno {
    private String nome;    
    private String RA;
    private int nota;
    
    public TADAluno (String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getRA() {
        return this.RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public int getNota() {
        return this.nota;
    }

    public boolean setNota(int nota) {
        this.nota = nota;
        if ((nota < 0) || (nota > 10)) {
            return false;
        }
        else {
            this.nota = nota;
            return true;
        }
    }
}
