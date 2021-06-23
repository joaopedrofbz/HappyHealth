
package iade.pt.HappyHealth.Models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity @Table(name="aulas")
public class Aula {
    @Id @GeneratedValue
        (strategy = GenerationType.IDENTITY)
    @Column (name ="Au_id") private int id;
    @Column (name ="Au_nome") private int Nome;
    @Column (name ="Au_Tempo") private int Tempo;
    @Column (name ="Au_Local") private Local Local;
    @Column (name ="Au_Tipo") private String Tipo;
    @Column (name ="Au_Data") private LocalDate Data; 

    public Aula(){}   

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

    public Local getLocal() {
        return Local;
    }

    public void setLocal(Local local) {
        Local = local;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }
    
}