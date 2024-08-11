package package0;

public class Composition {
	private String RefComposition ;
	private int QuantiteComposition;
	private Recette RefRec;
	private Ingredient RefIngredient;
	
	
	
	public Composition(String RefComposition, int QuantiteComposition,
			Recette RefRecette, Ingredient RefIngredient) {
		super();
		this.RefComposition = RefComposition;
		this.QuantiteComposition = QuantiteComposition;
		this.RefRec = RefRecette;
		this.RefIngredient = RefIngredient;
	}



	public String getRefComposition() {
		return RefComposition;
	}



	public void setRefComposition(String refComposition) {
		RefComposition = refComposition;
	}



	public int getQuantiteComposition() {
		return QuantiteComposition;
	}



	public void setQuantiteComposition(int quantiteComposition) {
		QuantiteComposition = quantiteComposition;
	}



	public Recette getRefRec() {
		return RefRec;
	}



	public void setRefRec(Recette refRec) {
		RefRec = refRec;
	}



	public Ingredient getRefIngredient() {
		return RefIngredient;
	}



	public void setRefIngredient(Ingredient refIngredient) {
		RefIngredient = refIngredient;
	}

	


}
