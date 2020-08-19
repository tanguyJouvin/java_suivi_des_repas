package fr.eni.javaee.suividesrepas.bo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Repas implements Serializable {

	private static final long serialVersionUID = 1L;

	private int identifiant;
	private LocalDate date;
	private LocalTime heure;
	private List<Aliment> listeAliments;
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getHeure() {
		return heure;
	}
	public void setHeure(LocalTime heure) {
		this.heure = heure;
	}
	public List<Aliment> getListeAliments() {
		return listeAliments;
	}
	public void setListeAliments(List<Aliment> listeAliments) {
		this.listeAliments = listeAliments;
	}
	
	public Repas() {
		this.listeAliments=new ArrayList<>();
	}
	public Repas(LocalDate date, LocalTime heure, List<Aliment> listeAliments) {
		super();
		this.date = date;
		this.heure = heure;
		this.listeAliments = listeAliments;
	}
	public Repas(int identifiant, LocalDate date, LocalTime heure, List<Aliment> listeAliments) {
		this(date, heure, listeAliments);
		this.identifiant = identifiant;
	}
	public Repas(int identifiant, LocalDate date, LocalTime heure) {
		this(identifiant, date, heure, new ArrayList<>());
	}
	@Override
	public String toString() {
		return "Repas [identifiant=" + identifiant + ", date=" + date + ", heure=" + heure + ", listeAliments="
				+ listeAliments + "]";
	}
}

















