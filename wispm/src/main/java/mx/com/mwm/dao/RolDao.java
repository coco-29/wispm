package mx.com.mwm.dao;

import java.util.List;

import mx.com.mwm.model.Rol;

public interface RolDao {

	public List<Rol> findAllRol();
	
	public Rol findRolById(Rol rol);
	
	public Rol insertRol(Rol rol);
	
	public Rol deleteRol(Rol rol);
	
	
}

