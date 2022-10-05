package com.solvd.Army.dao;

import com.solvd.Army.InfantryFightingVehicle;
import com.solvd.Army.util.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class InfantryFightingVehicleDAO implements IInfantryFightingVehicleDAO {
    private IInfantryFightingVehicleDAO entityDAO;
    private Class<IInfantryFightingVehicleDAO> DAOClass = IInfantryFightingVehicleDAO.class;
    @Override
    public List<InfantryFightingVehicle> getAllInfantryFightingVehicle() {
        SqlSession session = Session.getSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<InfantryFightingVehicle> entities = entityDAO.getAllInfantryFightingVehicle();
        session.close();
        return entities;
    }
}
