package observer.observer_methode_1.observers;

public class ObserverImpl1 implements Observer{
	
	private double somme; 
	
	
	public ObserverImpl1() {
		super();
		this.somme = 0;
	}


	@Override
	public void update(int etat) {
		somme+=etat; 
		System.out.println("Observateur 1 ==> somme = "+somme);
	}
}
