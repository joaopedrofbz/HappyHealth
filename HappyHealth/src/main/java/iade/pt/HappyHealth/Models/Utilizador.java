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
    @Column (name ="UT_id") private int UTid;
    @Column (name ="UT_NProprio") private String UTNome;
    @Column (name ="UT_Apelido") private String UTApelido;
    @Column (name ="UT_Datanasc") private LocalDate UTdatanascimento;
    @Column (name ="UT_Genero") private String UTgenero;
    @Column (name ="UT_nif") private int UTnif;
    @Column (name="UT_TotalPontos") private int UTTotalPontos;
    

    public Utilizador(){}
    
    public int getUTid() {
        return UTid;
    }
    public void setUTid(int uTid) {
        UTid = uTid;
    }
    public String getUTNome() {
        return UTNome;
    }
    public void setUTNome(String uTNome) {
        UTNome = uTNome;
    }
    public String getUTApelido() {
        return UTApelido;
    }
    public void setUTApelido(String uTApelido) {
        UTApelido = uTApelido;
    }
    public LocalDate getUTdatanascimento() {
        return UTdatanascimento;
    }
    public void setUTdatanascimento(LocalDate uTdatanascimento) {
        UTdatanascimento = uTdatanascimento;
    }
    public String getUTgenero() {
        return UTgenero;
    }
    public void setUTgenero(String uTgenero) {
        UTgenero = uTgenero;
    }
    public int getUTnif() {
        return UTnif;
    }
    public void setUTnif(int uTnif) {
        UTnif = uTnif;
    }
    public int getUTTotalPontos() {
        return UTTotalPontos;
    }
    public void setUTTotalPontos(int uTTotalPontos) {
        UTTotalPontos = uTTotalPontos;
    }
  
}