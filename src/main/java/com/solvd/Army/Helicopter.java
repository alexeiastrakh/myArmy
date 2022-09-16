package com.solvd.Army;

public class Helicopter {

    private Long id;
    private int rotorDiameter;
    private int Aviation_id;

    public Helicopter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getRotorDiameter(){
        return rotorDiameter;
    }

    public void setRotorDiameter(int rotorDiameter){
        this.rotorDiameter=rotorDiameter;
    }

    public int getAviation_id(){
        return Aviation_id;
    }

    public void setAviation_id(int Aviation_id){
        this.Aviation_id=Aviation_id;
    }
}
