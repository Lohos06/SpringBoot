package com.iim.springboot;

import com.iim.springboot.model.Forgeron;
import com.iim.springboot.model.metaux.Fer;
import com.iim.springboot.model.metaux.MetauxAbstractClass;
import com.iim.springboot.model.metaux.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Quel est vote nom ?");
        String forgeronNom = myObj.next();
        System.out.println("Quel est votre maitrise de la forge (entre 1 et 10) ?");
        int forgeronMaitrise = myObj.nextInt();

        Forgeron forgeron = new Forgeron(forgeronNom, forgeronMaitrise);

        System.out.println("Quel metal choisissez vous ? (Fer | Or)");
        String metalChoisi = myObj.next();
        System.out.println("D'ou vient votre minerai ?");
        String origine = myObj.next();

        MetauxAbstractClass metal = null;

        if (Objects.equals(metalChoisi, "Fer")) {
            System.out.println("Quel est le taux de carbonne de votre Fer ?");
            float tauxCarbonne = myObj.nextFloat();
            metal = new Fer(origine, tauxCarbonne);
        } else if (Objects.equals(metalChoisi, "Or")) {
            metal = new Or(origine);
        }

        while (true) {
            System.out.println("Quel est prochaine action ?");
            String response = myObj.next();

            if (Objects.equals(response, "fondre")) {
                forgeron.fonte(metal);
            }

        }
    }

}
