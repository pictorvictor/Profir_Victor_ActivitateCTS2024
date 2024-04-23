package SportivStrategy.classes;

public class VerificatorPeluza implements Verificator {
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica bagajele si hainele lui " + nume);
    }
}