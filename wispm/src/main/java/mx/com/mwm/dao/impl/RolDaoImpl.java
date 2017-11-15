package mx.com.mwm.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.com.mwm.dao.RolDao;
import mx.com.mwm.model.Rol;

public class RolDaoImpl implements RolDao{
	private static EntityManager em;
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mwisp");
	
	
	@Override
	public Rol deleteRol(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> findAllRol() {
		em=emf.createEntityManager();
		List<Rol> rol =(List<Rol>) em.createQuery("from Rol").getResultList();
			return rol;
	}
	@Override
	public Rol findRolById(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Rol insertRol(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public void  mostrarTodoRol() {
		em=emf.createEntityManager();
		List<Rol> rol =(List<Rol>) em.createQuery("from Rol").getResultList();
		System.out.println("En la base de datos hay "+rol.size()+" Roles.");
		for (Rol rol2 : rol) {
			System.out.println(rol2);
		}	
	}
	
	public void modificarRol(String nombre_Tipo, String estado, int id) {
		
		em=emf.createEntityManager();
		
		em.getTransaction().begin(); 	
		Rol r=em.find(Rol.class,id);
		r.setNombre_Tipo(nombre_Tipo);
		r.setEstado(estado);
		em.getTransaction().commit();
		
		em.close();
		
		
		
		
	}
	

}
