package observer.observer_methode_2.observers;

import observer.observer_methode_2.observable.Observable;
import observer.observer_methode_2.observable.ObservableImpl;

public class ObserverImpl1 implements Observer{
	
	private double somme; 
	
	
	public ObserverImpl1() {
		super();
		this.somme = 0;
	}


	@Override
	public void update(Observable observable) {
		int etat = ((ObservableImpl)observable).getEtat();
		somme+=etat; 
		System.out.println("Observateur 1 ==> somme = "+somme);
	}
}
