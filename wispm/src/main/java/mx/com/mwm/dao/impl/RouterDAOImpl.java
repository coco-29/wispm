package mx.com.mwm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mx.com.mwm.dao.Router;
import mx.com.mwm.util.HibernateUtil;

public class RouterDAOImpl {
	
	private static Transaction transObj;
	private static Session sessionObj = HibernateUtil.getSessionFactory().openSession();
	
	public void guardarRouterEnDb(Router routerObj) {
		try {
			transObj = sessionObj.beginTransaction();
			sessionObj.save(routerObj);
			System.out.println("Router con Id: "+ routerObj.getId() + " Fue exitosamente creado en la DB");
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("CreadoRouterID", routerObj.getId());                       
		}catch (Exception exceptionObj ) {
			exceptionObj.printStackTrace();
			transObj.rollback();
		} 
		finally {
			transObj.commit();
		}
		
	}
	@SuppressWarnings({"unchecked","unused"})
	public List<Router> getRouter() {
		Router routerObj = new Router();
		List routersList = new ArrayList();
		try {
			transObj=sessionObj.beginTransaction();
			Query queryObj = sessionObj.createQuery("from Router");
			routersList=queryObj.list();
			System.out.println("Mostrando Routers");
		} catch (Exception exceptioObj) {
			exceptioObj.printStackTrace();
		}finally {
			transObj.commit();
		}
		return routersList;
	}
	

}
