package com.solvd.Army;

public class ArmoredPersonnelCarrier  {

    private Long id;
    private String armament;
    private int ArmoredWeapons_id;

    public ArmoredPersonnelCarrier() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getArmament(){
        return armament;
    }

    public void setArmament(String armament){
        this.armament=armament;
    }

    public int getArmoredWeapons_id(){
        return ArmoredWeapons_id;
    }

    public void setArmoredWeapons_id(int ArmoredWeapons_id){
        this.ArmoredWeapons_id=ArmoredWeapons_id;
    }

    @Override
    public String toString() {
        return "ArmoredPersonnelCarrier{" +
                "id=" + id +
                ", armament='" + armament + '\'' +
                ", ArmoredWeapons_id=" + ArmoredWeapons_id +
                '}';
    }
}
