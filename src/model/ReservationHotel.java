package model;

public class ReservationHotel extends Reservation {
    private int nbLitSimple=0;
    private int nbLitDouble=0;
    private int noChambre;
	public ReservationHotel(int jour, int mois,int nbLitSimple,int nbLitDouble,int noChambre) {
		super(mois, jour);
		this.nbLitSimple=nbLitSimple;
		this.nbLitDouble=nbLitDouble;
		this.noChambre=noChambre;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return super.toString()+" : Chambre n°"+ noChambre +" avec " + nbLitSimple +" lit simple et " + nbLitDouble +" lit double";
	}

}
