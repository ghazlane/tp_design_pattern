package observer.observer_methode_1;


// Technique push
import observer.observer_methode_1.observable.ObservableImpl;
import observer.observer_methode_1.observers.Observer;
import observer.observer_methode_1.observers.ObserverImpl1;
import observer.observer_methode_1.observers.ObserverImpl2;

public class TestObserver {
public static void main(String[] args) {
	ObservableImpl observable = new ObservableImpl(); 
	Observer observer1 = new ObserverImpl1();
	Observer observer2 = new ObserverImpl2();
	
	// abonnement des deux observateurs
	observable.subscribe(observer1);
	observable.subscribe(observer2);
	
	observable.setEtat(90);
	System.out.println("-------------------");
	observable.setEtat(60);
	
	System.out.println("--------------------test 2---------");
	observable.unsubscribe(observer2);
	observable.setEtat(87);
	
}
}
