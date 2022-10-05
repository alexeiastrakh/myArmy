package com.solvd.Army.dao;

import com.solvd.Army.Airplane;
import com.solvd.Army.ArmoredPersonnelCarrier;

import java.util.List;

public interface IArmoredPersonnelCarrierDAO {
    List<ArmoredPersonnelCarrier> getAllArmoredPersonnelCarrier();
    List<ArmoredPersonnelCarrier> getArmoredPersonnelCarrierByArmament();
}