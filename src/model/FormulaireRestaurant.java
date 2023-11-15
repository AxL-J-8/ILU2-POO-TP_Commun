package model;

public class FormulaireRestaurant extends Formulaire {
    private int nbPersonnes;
    private int noService;
    
	public FormulaireRestaurant(int jour, int mois,int nbPersonnes,int noService) {
		super(jour, mois,0);
		this.nbPersonnes= nbPersonnes;
		this.noService=noService;
		// TODO Auto-generated constructor stub
	}
	public int getNombrePersonnes() {
		return nbPersonnes;
	}
	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}
	public int getNumService() {
		return noService;
	}
	public void setNoService(int noService) {
		this.noService = noService;
	}

}
