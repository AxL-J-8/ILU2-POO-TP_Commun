package model;

public abstract class Formulaire {
 private int jour;
 private int mois;
 private int noEntite;
 public Formulaire(int jour ,int mois,int noEntite) {
	 this.jour=jour;
	 this.mois=mois;
 }
public int getJour() {
	return jour;
}
public void setJour(int jour) {
	this.jour = jour;
}
public int getMois() {
	return mois;
}
public void setMois(int mois) {
	this.mois = mois;
}
public int getIdentificationEntite() {
	return noEntite;
}
public void setIdentificationEntite(int noEntite) {
	this.noEntite = noEntite;
}

}
