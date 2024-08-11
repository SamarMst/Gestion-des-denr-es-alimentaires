package package0;

public class TypeIngredient {
private String RefType;
private String NomType;

public TypeIngredient( String RefType,String NomType){
	this .RefType =RefType;
	this.NomType=NomType;
	
}

public String getRefType() {
	return RefType;
}

public void setRefType(String refType) {
	RefType = refType;
}

public String getNomType() {
	return NomType;
}

public void setNomType(String nomType) {
	NomType = nomType;
}


}

