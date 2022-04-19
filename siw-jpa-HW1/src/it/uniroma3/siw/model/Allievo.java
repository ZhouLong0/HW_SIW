package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Allievo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(unique = true)
	private Long matricola;
	
	private String nome;
	
	private String cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	private String email;
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
	private Societa societa;
	
	@ManyToMany(mappedBy = "allievi", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Corso> Corsi;
	
	public Allievo(Long matricola, String nome, String cognome, LocalDate dataNascita, String luogoNascita, String email) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.email = email;
	}
	
	public String toString()	{
		return(this.matricola + "  " + this.nome + "  " + this.cognome + "  " + this.dataNascita + "  " + this.luogoNascita + 
				"  " + email + "\n");
	}
	
	
	
}
