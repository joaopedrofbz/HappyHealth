package iade.pt.HappyHealth.Models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="professor")
public class Professor {
    @Id @GeneratedValue
        (strategy = GenerationType.IDENTITY)
    @Column (name ="prof_id") private int id;
    @Column (name ="prof_NomeProp") private int Nome;
    @Column (name ="prof_Apelido") private int Tempo;
    @Column (name ="prof_genero") private char genero;
    @Column (name ="prof_datanasc") private LocalDate datanascimento;
    @Column (name ="prof_nif") private int nif;

    public Professor(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNome() {
        return Nome;
    }

    public void setNome(int nome) {
        Nome = nome;
    }

    public int getTempo() {
        return Tempo;
    }

    public void setTempo(int tempo) {
        Tempo = tempo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

}