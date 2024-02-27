package clase.readers.classes;

import clase.Aplicant;
import clase.Student;
import clase.readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

    public StudentReader(String fileName){
        super(fileName);
    }
    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.fileName));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student = new Student();
            super.readAplicant(scanner, student);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}
