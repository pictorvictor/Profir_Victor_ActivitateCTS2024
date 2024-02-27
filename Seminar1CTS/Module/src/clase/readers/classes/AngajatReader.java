package clase.readers.classes;

import clase.Angajat;
import clase.Aplicant;
import clase.Student;
import clase.readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {

    public AngajatReader(String fileName){
        super(fileName);
    }
    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.fileName));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = (scanner.next()).toString();
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
