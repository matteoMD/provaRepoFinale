
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acest
 */
public class Studente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private LocalDate data_nascita;
    private String matricola;

    public Studente(String nome, String cognome, String codiceFiscale, LocalDate data_nascita, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.data_nascita = data_nascita;
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    
    
    
    
}
