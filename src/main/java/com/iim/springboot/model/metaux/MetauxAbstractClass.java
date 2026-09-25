package com.iim.springboot.model.metaux;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class MetauxAbstractClass {

    public String origine;
    public String forme;
    public float temperatureFonte;

    public String getOrigine() {
        return this.origine;
    }
    public String getForme() {
        return this.forme;
    }
    public float getTemperatureFonte() {
        return this.temperatureFonte;
    }


    public void setOrigine(String origine) {
        this.origine = origine;
    }
    public void setForme(String forme) {
        this.forme = forme;
    }
    public void setTemperatureFonte(float temperatureFonte) {
        this.temperatureFonte = temperatureFonte;
    }


}
