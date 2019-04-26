package com.infotel.TpNote26AvrilGLechevretel.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infotel.TpNote26AvrilGLechevretel.Metier.Etudiant;

@Service

public class ServiceImpl implements Iservice {
	
	@Autowired
	private com.infotel.TpNote26AvrilGLechevretel.Dao.Idao dao;

	public int ajouterEtudiant(Etudiant e) {
		return dao.ajouterEtudiant(e);
	}

	public com.infotel.TpNote26AvrilGLechevretel.Dao.Idao getDao() {
		return dao;
	}

	public void setDao(com.infotel.TpNote26AvrilGLechevretel.Dao.Idao dao) {
		this.dao = dao;
	}
	
	

}
