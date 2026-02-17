package model.dao;


import db.DB;
import model.dao.impl.PersonasDaoImpl;

public class DaoFactory {

    public static PersonasDao createPersonasDao(){
        return new PersonasDaoImpl(DB.getConnections());
    }
}
