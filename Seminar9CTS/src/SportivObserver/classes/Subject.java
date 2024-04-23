package SportivObserver.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject(List<Observer> observers) {
        this.observers = observers;
    }

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observator) {
        observers.add(observator);
    }

    public void stergeAbonat(Observer obs) {
        observers.remove(obs);
    }

    public void notificaAbonati(String mesaj) {
        for (Observer obs : observers) {
            obs.primesteNotificare(mesaj);
        }
    }
    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciHandbal();
    public abstract void notificaMeciVolei();
}
