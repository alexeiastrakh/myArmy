package com.solvd.Army;

public class Submarine {

    private Long id;
    private int immersionDepth;
    private int Fleet_id;

    public Submarine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getImmersionDepth(){
        return immersionDepth;
    }

    public void setImmersionDepth(int immersionDepth){
        this.immersionDepth=immersionDepth;
    }

    public int getFleet_id(){
        return Fleet_id;
    }

    public void setFleet_id(int Fleet_id){
        this.Fleet_id=Fleet_id;
    }
}
