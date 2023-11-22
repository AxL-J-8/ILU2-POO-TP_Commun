package model;

public class Restaurant {
CentraleReservation<Table> centrale;
public Restaurant() {
	this.centrale=new CentraleReservation<>(new Table[100]);
}
public void ajouterTable(int nbChaises)

{
	Table table=new Table(nbChaises);
	centrale.ajouterEntite(table);
}

public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
	return centrale.donnerPossibilites(formulaire);
}

public Reservation reserver(int numEntite,Formulaire formulaire) {
	return centrale.reserver(numEntite, formulaire);
}
}
