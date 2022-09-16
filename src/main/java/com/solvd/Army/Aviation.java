package com.solvd.Army;

public class Aviation {

    private Long id;
    private int maxSpeed;
    private String crew;
    private int rangeOfFlight;
    private int ArmyCorps_id;
    private String nameModel;

    public Aviation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    public String getCrew(){
        return crew;
    }

    public void setCrew(String crew){
        this.crew=crew;
    }

    public int getRangeOfFlight(){
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight){
        this.rangeOfFlight=rangeOfFlight;
    }

    public int getArmyCorps_id(){
        return ArmyCorps_id;
    }

    public void setArmyCorps_id(int ArmyCorps_id){
        this.ArmyCorps_id=ArmyCorps_id;
    }

    public String getNameModel(){
        return nameModel;
    }

    public void setNameModel(String nameModel){
        this.nameModel=nameModel;
    }
}
