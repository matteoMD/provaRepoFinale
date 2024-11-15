/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acest
 */
public class Aula {

    private int posti;
    private boolean riempimento;
    private int a;

    public Aula(int posti, boolean riempimento, int a) {
        this.posti = posti;
        this.riempimento = riempimento;
        this.a = a;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean getRiempimento() {
        return this.riempimento;
    }

    public void setRiempimento(boolean riempimento) {
        this.riempimento = riempimento;
    }

}
