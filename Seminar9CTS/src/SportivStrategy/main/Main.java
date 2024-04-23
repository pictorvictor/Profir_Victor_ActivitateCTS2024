package SportivStrategy.main;

import SportivStrategy.classes.Portar;
import SportivStrategy.classes.VerificatorTribuna;
import SportivStrategy.classes.VerificatorVip;

public class Main {
    public static void main(String[] args) {
        Portar portar = new Portar();
        String suporter1 = "VIP";
        String suporter2 = "Peluza";
        String suporter3 = "Tribuna";

        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter3);

        portar.setStrategie(new VerificatorVip());
        portar.verificaSuporter(suporter1);
    }
}