package com.solvd.Army.dao;

import com.solvd.Army.ArmoredWeapons;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ArmoredWeaponsDAO implements IArmoredWeaponsDAO {
    private IArmoredWeaponsDAO entityDAO;
    private Class<IArmoredWeaponsDAO> DAOClass = IArmoredWeaponsDAO.class;

    @Override
    public void addArmoredWeapons(ArmoredWeapons armoredWeapons) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addArmoredWeapons(armoredWeapons);
        session.commit();
        session.close();
    }

    @Override
    public void updateArmoredWeapons(ArmoredWeapons armoredWeapons) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateArmoredWeapons(armoredWeapons);
        session.commit();
        session.close();
    }

    @Override
    public void deleteArmoredWeapons(int idArmoredWeapons) {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteArmoredWeapons(idArmoredWeapons);
        session.commit();
        session.close();
    }

    @Override
    public List<ArmoredWeapons> getAllArmoredWeapons() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<ArmoredWeapons> entities = entityDAO.getAllArmoredWeapons();
        session.close();
        return entities;
    }
}
