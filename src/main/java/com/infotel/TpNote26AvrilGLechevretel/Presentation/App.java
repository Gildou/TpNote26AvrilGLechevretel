package com.infotel.TpNote26AvrilGLechevretel.Presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpNote26AvrilGLechevretel.Metier.Etudiant;
import com.infotel.TpNote26AvrilGLechevretel.Metier.Formation;
import com.infotel.TpNote26AvrilGLechevretel.Service.Iservice;
import com.infotel.TpNote26AvrilGLechevretel.Service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Etudiant e = context.getBean("etudiant",Etudiant.class);
    	e.setNom("Toto");
    	e.setPrenom("Tata");
    	
    	
    	Iservice service = context.getBean("serviceImpl",ServiceImpl.class);
    	service.ajouterEtudiant(e);
    }
}
