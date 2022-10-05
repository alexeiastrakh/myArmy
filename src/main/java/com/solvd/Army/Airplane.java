package com.solvd.Army;

public class Airplane {

    private Long id;
    private int wingspan;
    private int wingArea;
    private int Aviation_id;

    public Airplane() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getWingspan(){
        return wingspan;
    }

    public void setWingspan(int wingspan){
        this.wingspan=wingspan;
    }

    public int getWingArea(){
        return wingArea;
    }

    public void setWingArea(int wingArea){
        this.wingArea=wingArea;
    }

    public int getAviation_id(){
        return Aviation_id;
    }

    public void setAviation_id(int Aviation_id){
        this.Aviation_id=Aviation_id;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", wingspan=" + wingspan +
                ", wingArea=" + wingArea +
                ", Aviation_id=" + Aviation_id +
                '}';
    }
}
