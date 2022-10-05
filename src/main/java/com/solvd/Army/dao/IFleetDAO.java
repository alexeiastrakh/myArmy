package com.solvd.Army.dao;

import com.solvd.Army.Fleet;

import java.util.List;

public interface IFleetDAO {
    void addFleet(Fleet fleet);
    void updateFleet(Fleet fleet);
    void deleteFleet(int idFleet);
    List<Fleet> getAllFleet();
}
