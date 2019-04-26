package com.infotel.TpNote26AvrilGLechevretel.Metier;

import org.springframework.stereotype.Component;

@Component


public class Etudiant {
	private int idEtudiant;
	private String nom;
	private String prenom;
	private Formation formation;
	
	
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", formation=" + formation
				+ "]";
	}
	
	
	

}
