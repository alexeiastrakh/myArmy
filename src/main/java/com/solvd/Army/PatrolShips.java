package com.solvd.Army;

public class PatrolShips {

    private Long id;
    private int enginePower;
    private int Fleet_id;

    public PatrolShips() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getEnginePower(){
        return enginePower;
    }

    public void setEnginePower(int enginePower){
        this.enginePower=enginePower;
    }

    public int getFleet_id(){
        return Fleet_id;
    }

    public void setFleet_id(int Fleet_id){
        this.Fleet_id=Fleet_id;
    }
}
