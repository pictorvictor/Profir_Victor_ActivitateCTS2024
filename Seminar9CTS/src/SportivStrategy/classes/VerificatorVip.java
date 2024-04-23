package SportivStrategy.classes;

public class VerificatorVip implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica biletul lui " + nume);
    }
}
