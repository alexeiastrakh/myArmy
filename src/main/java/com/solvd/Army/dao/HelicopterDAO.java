package com.solvd.Army.dao;

import com.solvd.Army.Helicopter;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HelicopterDAO implements IHelicopterDAO{
    private IHelicopterDAO entityDAO;
    private Class<IHelicopterDAO> DAOClass = IHelicopterDAO.class;
    @Override
    public List<Helicopter> getAllHelicopter() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Helicopter> entities = entityDAO.getAllHelicopter();
        session.close();
        return entities;
    }
}
