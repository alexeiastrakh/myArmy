package com.solvd.Army.dao;

import com.solvd.Army.ArmoredWeapons;

import java.util.List;

public interface IArmoredWeaponsDAO {
    void addArmoredWeapons(ArmoredWeapons armoredWeapons);
    void updateArmoredWeapons(ArmoredWeapons armoredWeapons);
    void deleteArmoredWeapons(int idArmoredWeapons);
    List<ArmoredWeapons> getAllArmoredWeapons();
}
