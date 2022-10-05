package com.solvd.Army.dao;

import com.solvd.Army.Aviation;

import java.util.List;

public interface IAviationDAO {
    void addAviation(Aviation aviation);
    void updateAviation(Aviation aviation);
    void deletesAviation(int idAviation);
    List<Aviation> getAllAviation();
}
