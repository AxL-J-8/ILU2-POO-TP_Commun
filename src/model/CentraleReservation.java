package model;

public class CentraleReservation<E extends EntiteReservable> {
	E[] tabEntite;
	int nbEntite = 0;

	public CentraleReservation(E[] tabEntite) {
		this.tabEntite = tabEntite;
	}

	public int ajouterEntite(E entite) {
		
		tabEntite[nbEntite++]=entite;
		return nbEntite;
	}
	
	public int[] donnerPossibilites(Formulaire formulaire) {
		int[] possibilites= new int[nbEntite];
		for(int i=0;i<nbEntite;i++) {
			if(tabEntite[i].compatible(formulaire)) {
				possibilites[i]=(i+1);
			}
			else {
				possibilites[i]=0;
			}
		}
		return possibilites;
		
	}
	
	public Reservation reserver(int numEntite,Formulaire formulaire) {
		tabEntite[numEntite].setNumero(numEntite);
		return tabEntite[numEntite].reserver(formulaire);
	}
	
}
