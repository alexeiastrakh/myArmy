package com.solvd.Army.dao;

import com.solvd.Army.Aviation;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AviationDAO implements IAviationDAO{
    private IAviationDAO entityDAO;
    private Class<IAviationDAO> DAOClass = IAviationDAO.class;
    @Override
    public void addAviation(Aviation aviation) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addAviation(aviation);
        session.commit();
        session.close();
    }

    @Override
    public void updateAviation(Aviation aviation) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateAviation(aviation);
        session.commit();
        session.close();
    }

    @Override
    public void deletesAviation(int idAviation) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deletesAviation(idAviation);
        session.commit();
        session.close();
    }

    @Override
    public List<Aviation> getAllAviation() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Aviation> entities = entityDAO.getAllAviation();
        session.close();
        return entities;
    }
}
