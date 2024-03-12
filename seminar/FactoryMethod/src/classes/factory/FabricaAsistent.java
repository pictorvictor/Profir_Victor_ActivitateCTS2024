package classes.factory;

import classes.Asistent;
import classes.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
