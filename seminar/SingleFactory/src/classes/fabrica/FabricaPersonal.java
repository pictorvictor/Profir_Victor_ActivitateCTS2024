package classes.fabrica;

import classes.*;

public class FabricaPersonal {
    public PersonalSpital createType(TipPersonal tip, String nume, int salariu) throws Exception {
        switch(tip){
            case MEDIC:
                return new Medic(nume, salariu);
            case ASISTENT:
                return new Asistent(nume, salariu);
            case BRANCARDIER:
                return new Brancardier(nume, salariu);
            case INFIRMIER:
                return new Infirmier(nume, salariu);
            default:
                throw new Exception("Tip necunoscut");
        }
    }
}
