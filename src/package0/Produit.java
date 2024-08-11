package package0;

import java.util.Date;
public class Produit {
	private String RefProduit;
	private String DescriptifProduit;
	private String DatePeremption;
	private int QuantiteProduit;
	private int PrixProduit;
	private Rangement RefRangement;
	private Ingredient RefIngredient;
	
	
	
	
	public Produit(String RefProduit, String DescriptifProduit,
			String DatePeremption, int QuantiteProduit, int PrixProduit,
			Rangement RefRangement, Ingredient RefIngredient) {
		this.RefProduit = RefProduit;
		this.DescriptifProduit = DescriptifProduit;
		this.DatePeremption = DatePeremption;
		this.QuantiteProduit = QuantiteProduit;
		this.PrixProduit = PrixProduit;
		this.RefRangement = RefRangement;
		this.RefIngredient = RefIngredient;
	}
	public String getRefProduit() {
		return RefProduit;
	}
	public void setRefProduit(String refProduit) {
		RefProduit = refProduit;
	}
	public String getDescriptifProduit() {
		return DescriptifProduit;
	}
	public void setDescriptifProduit(String descriptifProduit) {
		DescriptifProduit = descriptifProduit;
	}
	public String getDatePeremption() {
		return DatePeremption;
	}
	public void setDatePeremption(String datePeremption) {
		DatePeremption = datePeremption;
	}
	public int getQuantiteProduit() {
		return QuantiteProduit;
	}
	public void setQuantiteProduit(int quantiteProduit) {
		QuantiteProduit = quantiteProduit;
	}
	public int getPrixProduit() {
		return PrixProduit;
	}
	public void setPrixProduit(int prixProduit) {
		PrixProduit = prixProduit;
	}
	public Rangement getRefRangement1() {
		return RefRangement;
	}
	public void setRefRangement(Rangement refRangement) {
		RefRangement = refRangement;
	}
	public Ingredient getRefIngredient() {
		return RefIngredient;
	}
	public void setRefIngredient(Ingredient refIngredient) {
		RefIngredient = refIngredient;
	}





}
