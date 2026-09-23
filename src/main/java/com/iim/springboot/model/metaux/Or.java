package com.iim.springboot.model.metaux;

public class Or extends MetauxAbstractClass{

    public Or(String origine) {
        this.origine = origine;
        this.forme = "minerai";
        this.temperatureFonte = 1064.18F;
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
