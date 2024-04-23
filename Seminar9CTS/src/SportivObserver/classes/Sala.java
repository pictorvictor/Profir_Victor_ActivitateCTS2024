package SportivObserver.classes;

import java.util.List;

public class Sala extends Subject{
    public Sala(List<Observer> observers) {
        super(observers);
    }

    public Sala() {
    }

    @Override
    public void notificaMeciFotbal() {
        String mesaj = "In data de 23.04.2024 va avea loc un meci de fotbal";
        this.notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandbal() {
        String mesaj = "In data de 23.04.2024 va avea loc un meci de handbal";
        this.notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj = "In data de 23.04.2024 va avea loc un meci de volei";
        this.notificaAbonati(mesaj);
    }
}
