import model.dao.DaoFactory;
import model.dao.PersonasDao;

public class MainDeleteById {

    public static void main(String[] args) {
        PersonasDao personasDAO = DaoFactory.createPersonasDao();
        int rowsAffected = personasDAO.deleteById(11);

        System.out.println("quantidade de linhas afetadas = " + rowsAffected);
    }
}
