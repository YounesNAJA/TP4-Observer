package ma.ensa.Observateur;

import ma.ensa.Observable.Gps;

public class AfficheComplet implements Observateur {
	private Gps gps;
	
	public void setGps(Gps gps) {
		this.gps = gps;
	}
	
	@Override
	public void actualiser() {
		System.out.println("Affichage complet : ");
		System.out.println("Position : " + gps.getPositionnement());
		System.out.println("Precision : " + gps.getPrecision());
	}

}
