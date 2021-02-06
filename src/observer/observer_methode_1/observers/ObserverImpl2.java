package observer.observer_methode_1.observers;

public class ObserverImpl2 implements Observer{

	private double lastState;
	@Override
	public void update(int etat) {
		// TODO Auto-generated method stub
		if(etat - lastState > 0)
			System.out.println("Observateur 2 ==> Augmentation de la surpresion");
		else if(etat - lastState <0)
			System.out.println("Observateur  ==> depression ");
		else 
			System.out.println("Observateur ==> stabilité");
		lastState = etat; 
	}
	
	

}
