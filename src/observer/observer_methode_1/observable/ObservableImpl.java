package observer.observer_methode_1.observable;

import java.util.ArrayList;
import java.util.List;

import observer.observer_methode_1.observers.Observer;

public class ObservableImpl implements Observable {

	private int etat;

	private List<Observer> observeres = new ArrayList<>();

	@Override
	public void subscribe(Observer observre) {
		observeres.add(observre);
	}

	@Override
	public void unsubscribe(Observer observer) {
		// TODO Auto-generated method stub
		observeres.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observeres) {
			// technique push
			observer.update(etat);
		}
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
		this.notifyObserver();
	}

}
