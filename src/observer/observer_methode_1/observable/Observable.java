package observer.observer_methode_1.observable;

import observer.observer_methode_1.observers.Observer;

public interface Observable {
	void subscribe(Observer observre); 
	void unsubscribe(Observer observer); 
	void notifyObserver(); 
}
