package com.solvd.Army.dao;

import com.solvd.Army.Fleet;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FleetDAO implements IFleetDAO{
    private IFleetDAO entityDAO;
    private Class<IFleetDAO> DAOClass = IFleetDAO.class;
    @Override
    public void addFleet(Fleet fleet) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addFleet(fleet);
        session.commit();
        session.close();
    }

    @Override
    public void updateFleet(Fleet fleet) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateFleet(fleet);
        session.commit();
        session.close();
    }

    @Override
    public void deleteFleet(int idFleet) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteFleet(idFleet);
        session.commit();
        session.close();
    }

    @Override
    public List<Fleet> getAllFleet() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Fleet> entities = entityDAO.getAllFleet();
        session.close();
        return entities;
    }
}
