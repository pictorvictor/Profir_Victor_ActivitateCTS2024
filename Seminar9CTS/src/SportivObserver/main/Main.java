package SportivObserver.main;

import SportivObserver.classes.*;

public class Main {
    public static void main(String[] args) {
        Observer ab1 = new Abonat("abonat1");
        Observer ab2 = new Abonat("abonat2");
        Observer ve1 = new Vecin(300, "vecin1");

        Subject sala = new Sala();
        sala.adaugaAbonat(ab1);
        sala.adaugaAbonat(ab2);
        sala.adaugaAbonat(ve1);
        sala.notificaMeciFotbal();

        sala.stergeAbonat(ab2);
        sala.notificaMeciHandbal();
    }
}