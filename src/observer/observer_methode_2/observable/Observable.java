package observer.observer_methode_2.observable;

import observer.observer_methode_2.observers.Observer;

public interface Observable {
	void subscribe(Observer observre); 
	void unsubscribe(Observer observer); 
	void notifyObserver(); 
}
