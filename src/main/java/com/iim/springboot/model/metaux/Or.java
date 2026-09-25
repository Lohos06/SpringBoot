package com.iim.springboot.model.metaux;

import jakarta.persistence.*;

@Entity
@Table(name = "metaux_or")
public class Or extends MetauxAbstractClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Or() {
    }

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

    public Long getId() {
        return this.id;
    }
}
