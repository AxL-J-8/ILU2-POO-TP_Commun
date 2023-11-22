package model;

public class ReservationRestaurant extends Reservation {
	private String[] service= {"premier","deuxieme"};
    private String noService;
    private int noTable;
	public ReservationRestaurant(int jour, int mois,int noService,int noTable) {
		super(mois, jour);
		this.noService=service[noService-1];
		this.noTable=noTable;
		
	}
	

	public String toString() {
		return super.toString()+"Table "+ noTable + " pour le " +noService + " service.";
	}
	

}
