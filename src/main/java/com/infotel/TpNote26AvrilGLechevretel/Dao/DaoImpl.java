package com.infotel.TpNote26AvrilGLechevretel.Dao;

import org.springframework.stereotype.Repository;

import com.infotel.TpNote26AvrilGLechevretel.Metier.Etudiant;

@Repository

public class DaoImpl implements Idao {

	public int ajouterEtudiant(Etudiant e) {
		System.out.println("L'étduiant "+e+" a été ajouté");
		return e.getIdEtudiant();
	}
	

}
