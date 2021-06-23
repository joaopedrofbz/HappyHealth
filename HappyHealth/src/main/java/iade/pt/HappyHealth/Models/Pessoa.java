package iade.pt.HappyHealth.Models;


import java.time.LocalDate;



public class Pessoa { //ignore

    private String nproprio;
    private String apelido;
    private LocalDate datanasc; 
    private String genero;
    private int nif;
    private char contactos;
    


    public Pessoa() {}


    /*
    public Pessoa(String nproprio, String apelido, LocalDate datanasc, String genero, int nif, char contactos){
        this.nproprio = nproprio;
        this.apelido = apelido;
        this.datanasc = datanasc;
        this.genero = genero;
        this.nif = nif;
        this.contactos = contactos;
    }
    */
    public String getNproprio() {
        return nproprio;
    }


    public void setNproprio(String nproprio) {
        this.nproprio = nproprio;
    }


    public String getApelido() {
        return apelido;
    }


    public void setApelido(String apelido) {
        this.apelido = apelido;
    }


    public LocalDate getDatanasc() {
        return datanasc;
    }


    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getNif() {
        return nif;
    }


    public void setNif(int nif) {
        this.nif = nif;
    }


    public char getContactos() {
        return contactos;
    }


    public void setContactos(char contactos) {
        this.contactos = contactos;
    }
}

