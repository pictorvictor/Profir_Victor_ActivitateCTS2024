package main;

import classes.PersonalSpital;
import classes.factory.*;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariu) {
        PersonalSpital personal = fabrica.createPersonal(nume, salariu);
        personal.afisareDetalii();
    }
    public static void main(String[] args) {
        prelucrarePersonal(new FabricaAsistent(), "asistentul", 1);
        prelucrarePersonal(new FabricaMedic(), "medicul", 2);
        prelucrarePersonal(new FabricaBrancardier(), "bombardierul", 3);
        prelucrarePersonal(new FabricaInfirmier(), "infirmierul", 4);
    }
}