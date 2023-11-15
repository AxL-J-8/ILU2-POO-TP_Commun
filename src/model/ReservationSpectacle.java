package model;

public class ReservationSpectacle extends Reservation {
    private int noZone;
    private int noChaise;
	public ReservationSpectacle(int jour, int mois,int noZone,int noChaise) {
		super(mois, jour);
		this.noChaise=noChaise;
		this.noZone=noZone;
	}
	public String toString() {
		return super.toString()+" : Chaise n°"+ noChaise + " situe a la zone n° " +noZone ;
	}
}
