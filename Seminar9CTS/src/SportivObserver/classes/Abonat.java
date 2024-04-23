package SportivObserver.classes;

public class Abonat implements Observer {
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " a primit urmatorul mesaj: " + mesaj);
    }
}
