package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UniversidadeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUniversidade;
	
	public UniversidadeModel() {
		
	}

	public UniversidadeModel(int idUniversidade, String nome) {
		this.idUniversidade = idUniversidade;
		this.nome = nome;
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}






}
