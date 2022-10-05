package com.solvd.Army;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "submarine")
@XmlAccessorType(XmlAccessType.FIELD)
public class Submarine implements Serializable {

    private Long id;
    private int immersionDepth;
    private int Fleet_id;

    public Submarine() {
    }

    public Submarine(Long id, int immersionDepth, int fleet_id) {
        this.id = id;
        this.immersionDepth = immersionDepth;
        Fleet_id = fleet_id;
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
