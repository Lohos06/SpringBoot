package com.iim.springboot.model.metaux;

public class Fer extends MetauxAbstractClass{

    float tauxCarbonne;
    String type;

    public Fer(String origine, float tauxCarbonne) {
        this.origine = origine;
        this.forme = "minerai";
        this.temperatureFonte = 1538F;
        this.tauxCarbonne = tauxCarbonne;
        this.type = null;
        typeMetal();
    }


    public float getTauxCarbonne() {
        System.out.println(this.tauxCarbonne);
        return this.tauxCarbonne;
    }
    public String getType() {
        typeMetal();
        System.out.println(this.type);
        return this.type;
    }

    public void typeMetal() {
        if (this.tauxCarbonne <= 0.02) {
            this.type = "Fer pur";
        } else if(this.tauxCarbonne >= 0.02 && this.tauxCarbonne <= 2) {
            this.type = "Acier";
        } else if(this.tauxCarbonne >= 2 && this.tauxCarbonne < 6.67) {
            this.type = "Fonte";
        } else if(this.tauxCarbonne == 6.67) {
            this.type = "Cementite";
        } else if(this.tauxCarbonne > 6.67 && this.tauxCarbonne <= 99.99) {
            this.type = "graphite";
        } else if(this.tauxCarbonne > 99.99) {
            this.type = "Carbone pur";
        }
    }

    public void decarbonnation (float pourcentage) {
        this.tauxCarbonne = this.tauxCarbonne - pourcentage;
        typeMetal();
    }
    public void carbonnation (float pourcentage) {
        this.tauxCarbonne = this.tauxCarbonne + pourcentage;
        typeMetal();
    }


    public void fonte(int temperature) {
        if(temperature >= temperatureFonte){
            this.forme = "liquide";
            System.out.println("Metal Fondu");
        }
        else{
            System.out.println("Augmentez la temperature");
        }
    }
}
