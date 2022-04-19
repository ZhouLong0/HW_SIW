package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private LocalDate dataInizio;
	
	private Long durataMesi;
	
	@ManyToMany(fetch = FetchType.EAGER) // quando guardo un corso mi potrebbe interessare sapere quali allievi partecipano al corso
	private List<Allievo> allievi;
	
	@ManyToOne
	private Docente docente;
}
