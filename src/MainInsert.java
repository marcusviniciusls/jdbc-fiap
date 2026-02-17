import model.dao.DaoFactory;
import model.dao.PersonasDao;
import model.entities.Personas;

import java.math.BigDecimal;

public class MainInsert {

    public static void main(String[] args) {
        Personas personas = new Personas();
        personas.setName("Marcus");
        personas.setLastName("Silva");
        personas.setAge(30);
        personas.setSalary(BigDecimal.valueOf(4000));

        PersonasDao personasDAO = DaoFactory.createPersonasDao();

        personasDAO.insert(personas);
    }
}
