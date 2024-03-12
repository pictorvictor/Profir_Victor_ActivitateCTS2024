package classes.factory;

import classes.Infirmier;
import classes.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
