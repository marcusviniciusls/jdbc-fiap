import model.dao.DaoFactory;
import model.dao.PersonasDao;
import model.entities.Personas;

import java.math.BigDecimal;

public class MainUpdateById {

    public static void main(String[] args) {
        Personas personas = new Personas();
        personas.setName("Marcus");
        personas.setLastName("Silva");
        personas.setAge(30);
        personas.setSalary(BigDecimal.valueOf(4000));
        personas.setId(1);

        PersonasDao personasDAO = DaoFactory.createPersonasDao();
        int rowsAffected = personasDAO.updateById(personas);

        System.out.println("quantidade de linhas afetadas = " + rowsAffected);
    }
}
