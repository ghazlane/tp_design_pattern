package observer.observer_methode_2;

import observer.observer_methode_2.observable.Observable;
// Technique Pop 
import observer.observer_methode_2.observable.ObservableImpl;
import observer.observer_methode_2.observers.Observer;
import observer.observer_methode_2.observers.ObserverImpl1;
import observer.observer_methode_2.observers.ObserverImpl2;

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

		observable.subscribe(new Observer() {
			@Override
			public void update(Observable observable) {
				// TODO Auto-generated method stub
				int etat = ((ObservableImpl) observable).getEtat();
				System.out.println("Observer Anonyme 1 ==> " + etat);
			}
		});
		
		observable.subscribe((observable2)->{
			int etat = ((ObservableImpl) observable2).getEtat();
			System.out.println("Observer Anonyme 2 ==> " + etat);
		});
		
		observable.setEtat(45);

	}
}
