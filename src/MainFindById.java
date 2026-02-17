import model.dao.DaoFactory;
import model.dao.PersonasDao;
import model.entities.Personas;

public class MainFindById {

    public static void main(String[] args) {
        PersonasDao personasDAO = DaoFactory.createPersonasDao();
        Personas personas = personasDAO.findById(1);

        System.out.println(personas);
    }
}
