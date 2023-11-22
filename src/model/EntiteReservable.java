package model;

public abstract class EntiteReservable<F extends Formulaire> {
 protected int numero;
 protected CalendrierAnnuel calendrier;

 
 
public CalendrierAnnuel getCalendrier() {
	return calendrier;
}

public EntiteReservable(int numero, CalendrierAnnuel calendrier) {
	this.numero = numero;
	this.calendrier = calendrier;

}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}
 
public boolean estLibre(F formulaire){
	int jour=formulaire.getJour();
	int mois= formulaire.getMois();
	return calendrier.estLibre(jour,mois);
	
}

public abstract boolean compatible(F formulaire);

public abstract Reservation reserver(F formulaire) ;


}
