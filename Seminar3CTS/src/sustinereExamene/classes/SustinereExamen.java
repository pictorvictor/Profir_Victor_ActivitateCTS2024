package sustinereExamene.classes;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private Map<Integer, Student> listaStudenti = new HashMap<>();
    private String nume;

    public SustinereExamen(String nume) {
        this.nume = nume;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public String getNume() {
        return nume;
    }

    public void inregistrareStudent(Student s) {
        if (listaStudenti.containsKey(s.getId())) {
            System.out.println("Studentul " + s.getNume() + " a sustinut deja examenul de " + nume);
        } else {
            listaStudenti.put(s.getId(), s);
            System.out.println("Studentul " + s.getNume() + " sustine acum examenul de " + nume);
        }
    }
}
