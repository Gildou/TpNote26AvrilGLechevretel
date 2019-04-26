package com.infotel.TpNote26AvrilGLechevretel.Metier;

public class Dev {
	private int idDev;
	private String nom;
	private int experience;
	public int getIdDev() {
		return idDev;
	}
	public void setIdDev(int idDev) {
		this.idDev = idDev;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Dev [idDev=" + idDev + ", nom=" + nom + ", experience=" + experience + "]";
	}
	
	

}
