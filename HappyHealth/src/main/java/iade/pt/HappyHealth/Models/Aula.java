
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
    @Column (name ="Au_id") private int auid;
    @Column (name ="Au_nome") private String auNome;
    @Column (name ="Au_Tempo") private int auTempo;
    @Column (name ="Au_Local") private String auLocal;
    @Column (name ="Au_Tipo") private String auTipo;
    @Column (name ="Au_Data") private String auData; 

    public Aula(){}   // Need empty constructor
    // other constructors getters and setters

    public int getAuid() {
        return auid;
    }

    public void setAuid(int auid) {
        this.auid = auid;
    }

    public String getAuNome() {
        return auNome;
    }

    public void setAuNome(String auNome) {
        this.auNome = auNome;
    }

    public int getAuTempo() {
        return auTempo;
    }

    public void setAuTempo(int auTempo) {
        this.auTempo = auTempo;
    }

    public String getAuLocal() {
        return auLocal;
    }

    public void setAuLocal(String auLocal) {
        this.auLocal = auLocal;
    }

    public String getAuTipo() {
        return auTipo;
    }

    public void setAuTipo(String auTipo) {
        this.auTipo = auTipo;
    }

    public String getAuData() {
        return auData;
    }

    public void setAuData(String auData) {
        this.auData = auData;
    }

    
}