package com.solvd.Army.dao;

import com.solvd.Army.PatrolShips;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PatrolShipsDAO implements IPatrolShipsDAO{
    private IPatrolShipsDAO entityDAO;
    private Class<IPatrolShipsDAO> DAOClass = IPatrolShipsDAO.class;
    @Override
    public List<PatrolShips> getAllPatrolShips() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<PatrolShips> entities = entityDAO.getAllPatrolShips();
        session.close();
        return entities;
    }
}
