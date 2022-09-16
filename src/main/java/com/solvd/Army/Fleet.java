package com.solvd.Army;

public class Fleet {

    private Long id;
    private String cruisingRange;
    private String crew;
    private int speed;
    private int ArmyCorps_id;
    private String nameModel;

    public Fleet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCruisingRange(){
        return cruisingRange;
    }

    public void setCruisingRange(String cruisingRange){
        this.cruisingRange=cruisingRange;
    }

    public String getCrew(){
        return crew;
    }

    public void setCrew(String crew){
        this.crew=crew;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed=speed;
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
