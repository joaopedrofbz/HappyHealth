package iade.pt.HappyHealth.Models;


import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity @Table(name="inscrever")
public class Inscricao {
    @Id @GeneratedValue
        (strategy = GenerationType.IDENTITY)
    @Column (name ="Insc_id") private int id;
    @Column (name ="Insc_Data") private LocalDate Datainsc;

    public Inscricao(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDatainsc() {
        return Datainsc;
    }

    public void setDatainsc(LocalDate datainsc) {
        Datainsc = datainsc;
    }  
    
}

