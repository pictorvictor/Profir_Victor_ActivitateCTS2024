package main;

import classes.Medic;
import classes.PersonalSpital;
import classes.fabrica.FabricaPersonal;
import classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabrica = new FabricaPersonal();
        try {
            PersonalSpital medic = fabrica.createType(TipPersonal.MEDIC, "CICI", 200);
            PersonalSpital asistent = fabrica.createType(TipPersonal.ASISTENT, "FRACSU LU CICI", 300);
            PersonalSpital brancardier = fabrica.createType(TipPersonal.BRANCARDIER, "SORSA LU CICI", 500);
            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}