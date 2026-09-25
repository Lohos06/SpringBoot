package com.iim.springboot.model;

import com.iim.springboot.model.metaux.MetauxAbstractClass;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Forgeron {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String nom;
    int maitrise;

    public Forgeron() {
    }

    public Forgeron(String nom, int maitrise) {
        this.nom = nom;
        this.maitrise = maitrise;
    }

    public String getNom() {
        System.out.println(this.nom);
        return this.nom;
    }

    public int getMaitrise() {
        System.out.println(this.maitrise);
        return this.maitrise;
    }

    public void fonte(MetauxAbstractClass Metal) {
        if (!Metal.getForme().equals("liquide")) {
            Metal.setForme("liquide");
            System.out.println("Metal fondu");
        } else {
            System.out.println("Metal deja liquide");
        }
    }
}
