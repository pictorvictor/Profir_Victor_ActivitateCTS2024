package classes.factory;

import classes.Brancardier;
import classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
