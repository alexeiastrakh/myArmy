package com.solvd.Army;

public class InfantryFightingVehicle {

    private Long id;
    private int highwayRange;
    private int ArmoredWeapons_id;

    public InfantryFightingVehicle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getHighwayRange(){
        return highwayRange;
    }

    public void setHighwayRange(int highwayRange){
        this.highwayRange=highwayRange;
    }

    public int getArmoredWeapons_id(){
        return ArmoredWeapons_id;
    }

    public void setArmoredWeapons_id(int ArmoredWeapons_id){
        this.ArmoredWeapons_id=ArmoredWeapons_id;
    }
}
