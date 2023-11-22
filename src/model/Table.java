package model;

public class Table extends EntiteReservable<FormulaireRestaurant> {
	private int nbChaises;
	private CalendrierAnnuel calendrierDeuxiemeService;

	public Table(int nbChaises) {
		super(0, new CalendrierAnnuel());
		this.nbChaises = nbChaises;
		this.calendrierDeuxiemeService = new CalendrierAnnuel();
	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		int nbpersonnes = formulaire.getNombrePersonnes();
		return estLibre(formulaire) && (nbpersonnes <= nbChaises);
	}

	@Override
	public Reservation reserver(FormulaireRestaurant formulaire) {

		int service = formulaire.getNumService();
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();

		ReservationRestaurant reservation = null;
		CalendrierAnnuel calAnn = calendrierDeuxiemeService;

		if (compatible(formulaire)) {
			if (service == 1) {
				calAnn = calendrier;
			}
			if (calAnn.reserver(jour, mois)) {
				reservation = new ReservationRestaurant(jour, mois, service, numero);
			}
		}
		return reservation;
	}
}
