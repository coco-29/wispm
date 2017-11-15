package mx.com.mwm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import mx.com.mwm.model.Rol;
import mx.com.mwm.model.TablaCuenta;

public class TestRol {
	// private static EntityManager em;
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mwisp");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
	//	Direccion d=new Direccion( 21321, "San Juan", "23", "323", "D.F", "Lazaron", "Tlalpan");
	Rol r=new Rol("pruebas","activo");
	TablaCuenta tc=new TablaCuenta("ff", "08jg", "dd@gmail");
	tc.setRol(r);
		em.getTransaction().begin();
		em.persist(r);
		em.persist(tc);
		em.getTransaction().commit();
		em.close();
	}

	/*
	 * private static void insertInicial() { Rol r = new Rol("Cliente", "Acivo");
	 * em.getTransaction().begin(); em.persist(r); em.getTransaction().commit(); }
	 * 
	 * @SuppressWarnings("unchecked") public static void imprimirTodo() { List<Rol>
	 * rol =(List<Rol>) em.createQuery("from Rol").getResultList();
	 * System.out.println("En la base de datos hay "+rol.size()+" Roles."); for (Rol
	 * rol2 : rol) { System.out.println(rol2); } }
	 */

}
