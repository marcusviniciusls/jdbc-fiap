package model.dao.impl;

import db.DB;
import exception.PersonasNotFound;
import model.dao.PersonasDao;
import model.entities.Personas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonasDaoImpl implements PersonasDao {

    private final Connection connection;

    public PersonasDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Personas persona) {
        PreparedStatement preparedStatement = null;
        try {
            String sqlInsert = "Insert into Personas (name, lastname, salary, age) VALUE (?, ?, ? ,?)";
            preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, persona.getName());
            preparedStatement.setString(2, persona.getLastName());
            preparedStatement.setBigDecimal(3, persona.getSalary());
            preparedStatement.setInt(4, persona.getAge());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public int updateById(Personas persona) {
        PreparedStatement preparedStatement = null;
        findById(persona.getId());
        try {
            String sqlUpdateById = "update personas set name = ?, lastname = ?, " +
                    "salary = ?, age = ? where id = ?";
            preparedStatement = connection.prepareStatement(sqlUpdateById);
            preparedStatement.setString(1, persona.getName());
            preparedStatement.setString(2, persona.getLastName());
            preparedStatement.setBigDecimal(3, persona.getSalary());
            preparedStatement.setInt(4, persona.getAge());
            preparedStatement.setInt(5, persona.getId());

            return preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public int deleteById(Integer id) {
        PreparedStatement preparedStatement = null;
        findById(id);
        try {
            String sqlDeleteById = "Delete from personas where id = ?";
            preparedStatement = connection.prepareStatement(sqlDeleteById);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public Personas findById(Integer id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sqlConsultById = "Select * from personas where id = ?";
            preparedStatement = connection.prepareStatement(sqlConsultById);
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                return getPersonas(resultSet);
            } else {
                throw new PersonasNotFound("Personas Not Found");
            }
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }

    @Override
    public List<Personas> findAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Personas> listPersonas = new ArrayList<>();
        try {
            String sqlConsultAll= "Select * from personas";
            preparedStatement = connection.prepareStatement(sqlConsultAll);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                listPersonas.add(getPersonas(resultSet));
            }
            return listPersonas;
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }

    private Personas getPersonas(ResultSet resultSet) throws SQLException {
        Personas personas = new Personas();
        personas.setId(resultSet.getInt("id"));
        personas.setName(resultSet.getString("name"));
        personas.setLastName(resultSet.getString("lastname"));
        personas.setMiddleName(resultSet.getString("middlename"));
        personas.setSalary(resultSet.getBigDecimal("salary"));
        personas.setAge(resultSet.getInt("age"));
        return personas;
    }
}
