package sustinereExamene.Main;
import BazeDeDate.classes.ConexiuneDB;
import sustinereExamene.classes.Student;
import sustinereExamene.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Robert Beleaua", "robert.beleaua@gmail.com", 3);
        Student student2 = new Student(124, "Cici Beleaua", "cici.beleaua@gmail.com", 3);
        Student student3 = new Student(125, "Gabi Melchior", "gabi.melchior@gmail.com", 3);
        Student student4 = new Student(126, "Nicu Carmen", "nicu.carmen@gmail.com", 3);

        SustinereExamen examenPOO = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCTS = new SustinereExamen("Calitate si testare Software");

        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student2);
        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student3);

    }
}