package com.solvd.Army;

public class ArmoredWeapons {

    private Long id;
    private int combatWeight;
    private int maximumHighwaySpeed;
    private int crew;

    private String nameModel;
    private int ArmyCorps_id;

    public ArmoredWeapons() {
    }

    public ArmoredWeapons(Long id, int combatWeight, int maximumHighwaySpeed, int crew, String nameModel,int ArmyCorps_id) {
        this.id = id;
        this.combatWeight = combatWeight;
        this.maximumHighwaySpeed = maximumHighwaySpeed;
        this.crew = crew;
        this.nameModel = nameModel;
        this.ArmyCorps_id = ArmyCorps_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getCombatWeight(){
        return combatWeight;
    }

    public void setCombatWeight(int combatWeight){
        this.combatWeight=combatWeight;
    }

    public int getMaximumHighwaySpeed(){
        return maximumHighwaySpeed;
    }

    public void setMaximumHighwaySpeed(int maximumHighwaySpeed){
        this.maximumHighwaySpeed=maximumHighwaySpeed;
    }
    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }
    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    @Override
    public String toString() {
        return "ArmoredWeapons{" +
                "id=" + id +
                ", combatWeight=" + combatWeight +
                ", maximumHighwaySpeed=" + maximumHighwaySpeed +
                ", crew=" + crew +
                ", nameModel='" + nameModel + '\'' +
                '}';
    }
}
