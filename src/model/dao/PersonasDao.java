package model.dao;

import model.entities.Personas;

import java.util.List;

public interface PersonasDao {

    void insert(Personas personas);
    int updateById(Personas personas);
    int deleteById(Integer id);
    Personas findById(Integer id);
    List<Personas> findAll();
}
