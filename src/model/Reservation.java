package model;

public abstract class Reservation {
	private String date;

	public Reservation(int mois ,int jour) {
		this.date = jour+"/"+mois;
	}
	
	public String toString() {
		return"Le " + date+"\n";
	}
}
