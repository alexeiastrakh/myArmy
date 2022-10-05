package com.solvd.Army.dao;

import com.solvd.Army.ArmoredPersonnelCarrier;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ArmoredPersonnelCarrierDAO implements IArmoredPersonnelCarrierDAO {
    private IArmoredPersonnelCarrierDAO entityDAO;
    private Class<IArmoredPersonnelCarrierDAO> DAOClass = IArmoredPersonnelCarrierDAO.class;
    @Override
    public List<ArmoredPersonnelCarrier> getAllArmoredPersonnelCarrier() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<ArmoredPersonnelCarrier> entities = entityDAO.getAllArmoredPersonnelCarrier();
        session.close();
        return entities;
    }

    @Override
    public List<ArmoredPersonnelCarrier> getArmoredPersonnelCarrierByArmament() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<ArmoredPersonnelCarrier> entities = entityDAO.getArmoredPersonnelCarrierByArmament();
        session.close();
        return entities;
    }
}
