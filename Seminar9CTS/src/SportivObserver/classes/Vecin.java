package SportivObserver.classes;

public class Vecin implements Observer {
    private float distanta;

    public Vecin(float distanta, String nume) {
        this.distanta = distanta;
        this.nume = nume;
    }

    private String nume;
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " sala aflata la o distanta de " + distanta + " a trimis la abonati urmatorul mesaj: " + mesaj);
    }
}
