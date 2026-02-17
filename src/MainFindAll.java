import model.dao.DaoFactory;
import model.dao.PersonasDao;
import model.entities.Personas;

import java.util.List;

public class MainFindAll {

    public static void main(String[] args) {
        PersonasDao personasDAO = DaoFactory.createPersonasDao();
        List<Personas> listPersonas = personasDAO.findAll();

        listPersonas.forEach(System.out::println);
    }
}
