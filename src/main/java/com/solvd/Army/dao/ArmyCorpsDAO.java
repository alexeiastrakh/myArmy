package com.solvd.Army.dao;

import com.solvd.Army.ArmyCorps;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ArmyCorpsDAO implements IArmyCorpsDAO{
    private IArmyCorpsDAO entityDAO;
    private Class<IArmyCorpsDAO> DAOClass = IArmyCorpsDAO.class;
    @Override
    public List<ArmyCorps> getAllArmyCorps() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<ArmyCorps> entities = entityDAO.getAllArmyCorps();
        session.close();
        return entities;
    }
}
