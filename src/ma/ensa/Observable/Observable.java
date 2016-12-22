package ma.ensa.Observable;

import java.util.ArrayList;
import java.util.List;

import ma.ensa.Observateur.Observateur;

public abstract class Observable {
	protected List<Observateur> observateurs = new ArrayList<Observateur>();

	public void ajouter(Observateur o){
		this.observateurs.add(o);
	}
	
	public void supprimer(Observateur o){
		this.observateurs.remove(o);
	}
	
	public void notifier(){
		for (Observateur observateur : observateurs) {
			observateur.actualiser();
		}
	}
}
