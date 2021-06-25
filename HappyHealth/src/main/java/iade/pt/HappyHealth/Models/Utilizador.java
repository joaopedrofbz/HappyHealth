package iade.pt.HappyHealth.Models;



import java.time.LocalDate; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity @Table(name="utilizadores")
public class Utilizador {
    @Id @GeneratedValue
        (strategy = GenerationType.IDENTITY)
    @Column (name ="UT_id") private int id;
    @Column (name ="UT_NProprio") private String Nome;
    @Column (name ="UT_Apelido") private String Apelido;
    @Column (name ="UT_datanasc") private LocalDate datanascimento;
    @Column (name ="UT_genero") private char genero;
    @Column (name ="UT_nif") private int nif;
    @Column (name="UT_TotalPontos") private int TotalPontos;
    
    public Utilizador(){}

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

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String apelido) {
        Apelido = apelido;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public int getTotalPontos() {
        return TotalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        TotalPontos = totalPontos;
    }
}
    
    


