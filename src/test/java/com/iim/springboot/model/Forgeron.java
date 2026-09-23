package com.iim.springboot.model;

import com.iim.springboot.model.metaux.MetauxAbstractClass;

public class Forgeron {

    String nom;
    int maitrise;

    Forgeron(String nom, int maitrise) {
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
        if (Metal.getForme() != "liquide") {
            Metal.setForme("liquide");
            System.out.println("Metal fondu");
        } else {
            System.out.println("Metal deja liquide");
        }
    }
}
