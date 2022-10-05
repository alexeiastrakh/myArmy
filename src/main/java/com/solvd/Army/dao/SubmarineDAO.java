package com.solvd.Army.dao;

import com.solvd.Army.Helicopter;
import com.solvd.Army.Submarine;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SubmarineDAO implements ISubmarineDAO{
    private ISubmarineDAO entityDAO;
    private Class<ISubmarineDAO> DAOClass = ISubmarineDAO.class;
    @Override
    public List<Submarine> getAllSubmarines() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Submarine> entities = entityDAO.getAllSubmarines();
        session.close();
        return entities;
    }
}
