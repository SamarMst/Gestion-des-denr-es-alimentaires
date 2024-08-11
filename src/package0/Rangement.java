package package0;

public class Rangement {
private String refRangement;
private String NomRangement;

public Rangement(String refRangement , String NomRangement){
	this.refRangement=refRangement;
	this.NomRangement=NomRangement;
}

public Rangement() {
	// TODO Auto-generated constructor stub
}



public String getRefRangement() {
	return refRangement;
}

public void setRefRangement(String refRangement) {
	this.refRangement = refRangement;
}

public String getNomRangement() {
	return NomRangement;
}

public void setNomRangement(String nomRangement) {
	NomRangement = nomRangement;
}

}