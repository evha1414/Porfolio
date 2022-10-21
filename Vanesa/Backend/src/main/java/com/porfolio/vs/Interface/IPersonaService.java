package com.porfolio.vs.Interface;

import com.porfolio.vs.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //buscar una persona y lo buscamos por ID
    public Persona findPersona(Long id);
}
