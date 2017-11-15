package mx.com.mwm.dao;

import java.util.List;

import mx.com.mwm.model.Persona;

public interface PersonaDao {
	public List<Persona> findAllPersonas();

	public Persona findPersonaById(Persona persona);

	public Persona findPersonaByEmail(Persona persona);

	public void insertPersona(Persona persona);

	public void updatePersona(Persona persona);

	public void deletePersona(Persona persona);

}
