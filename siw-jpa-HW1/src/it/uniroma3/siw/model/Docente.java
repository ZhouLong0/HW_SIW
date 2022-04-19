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

@Entity
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	@Column(unique = true, nullable = false)
	private Long partitaIva;
	
	@OneToMany(mappedBy = "docenti",cascade = { CascadeType.PERSIST, CascadeType.REMOVE})	//quando inserisco un nuovo docente voglio inserire anche il suo corso
	private List<Corso> corsi;
	
	
	public Docente(String nome, String cognome, LocalDate dataNascita, String luogoNascita, Long partitaIva,
			List<Corso> corsi) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.partitaIva = partitaIva;
		this.corsi = corsi;
	}
}
