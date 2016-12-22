package ma.ensa.Observateur;

import ma.ensa.Observable.Gps;

public class AfficheResume implements Observateur {
	
	private Gps gps;
	
	public void setGps(Gps gps) {
		this.gps = gps;
	}

	@Override
	public void actualiser() {
		System.out.println("Affichage résumé : ");
		System.out.println(gps.getPositionnement() + " " + gps.getPrecision());
	}

}
