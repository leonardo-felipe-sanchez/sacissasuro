package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Centro {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentro;

    private String nome;
    
    public Centro() {
    }
    
    public Centro(int idCentro, String nome) {
        this.idCentro = idCentro;
        this.nome = nome;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

}
