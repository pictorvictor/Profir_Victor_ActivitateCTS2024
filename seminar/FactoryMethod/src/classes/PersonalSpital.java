package classes;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void afisareDetalii();
}
