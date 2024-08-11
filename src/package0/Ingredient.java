package package0;
public class Ingredient {
private String RefIngredient;
private String NomIngredient;
private TypeIngredient RefType; 


public Ingredient(String RefIngredient, String NomIngredient,TypeIngredient RefType){
	this.RefIngredient = RefIngredient;
	this.NomIngredient = NomIngredient;
	this.RefType = RefType;
}


public Ingredient() {
	// TODO Auto-generated constructor stub
}


public String getRefIngredient() {
	return RefIngredient;
}


public void setRefIngredient(String refIngredient) {
	RefIngredient = refIngredient;
}


public String getNomIngredient() {
	return NomIngredient;
}


public void setNomIngredient(String nomIngredient) {
	NomIngredient = nomIngredient;
}


public TypeIngredient getRefType() {
	return RefType;
}


public void setRefType(TypeIngredient refType) {
	RefType = refType;
}

}