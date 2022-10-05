package com.solvd.Army.dao;

import com.solvd.Army.Airplane;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirplaneDAO implements IAirplaneDAO{
    private IAirplaneDAO entityDAO;
    private Class<IAirplaneDAO> DAOClass = IAirplaneDAO.class;
    @Override
    public List<Airplane> getAllAirplanes() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Airplane> entities = entityDAO.getAllAirplanes();
        session.close();
        return entities;
    }
}
