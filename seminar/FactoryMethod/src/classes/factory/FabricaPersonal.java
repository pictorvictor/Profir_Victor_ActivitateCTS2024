package classes.factory;

import classes.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
