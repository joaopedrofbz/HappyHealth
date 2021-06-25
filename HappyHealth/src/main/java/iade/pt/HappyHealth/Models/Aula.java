
package iade.pt.HappyHealth.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity @Table(name="aulas")
public class Aula {
    @Id @GeneratedValue
        (strategy = GenerationType.IDENTITY)
    @Column (name ="Au_id") private int id;
    @Column (name ="Au_nome") private String Nome;
    @Column (name ="Au_Tempo") private int Tempo;
    @Column (name ="Au_Local") private String Local;
    @Column (name ="Au_Tipo") private String Tipo;
    @Column (name ="Au_Data") private String Data; 

    public Aula(){}   // Need empty constructor
    // other constructors getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getTempo() {
        return Tempo;
    }

    public void setTempo(int tempo) {
        Tempo = tempo;
    }

    public String  getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }
    
}